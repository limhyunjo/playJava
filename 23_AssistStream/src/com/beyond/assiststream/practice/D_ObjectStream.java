package com.beyond.assiststream.practice;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class D_ObjectStream {

    public void fileSave(){

        // 객체를 출력 -> byte 기반으로만 출력 가능
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"))) {
            //FileOutputStream fos = new FileOutputStream("c_object.dat");
            // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c_object.dat"));


            oos.writeObject(new Member("hong123", "1234", "홍길동", 30, '남', 3456.789));

            // NotSerializableException 로 오류
            // 직렬화를 하기 위해 serializable 인터페이스를 구현해야 함
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void fileRead(){

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"))) {
           // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"));

            Member member = (Member)ois.readObject(); // object는 최상위고 member는 자식이라 typecasting으로 다운 캐스팅 해주기


            System.out.println(member);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }


    public void  objectsSave(){
        // 여러개의 객체 저장

        List<Member> members = new ArrayList<>();

        members.add(new Member("hong123", "1234", "홍길동", 30, '남', 176.3));
        members.add(new Member("kim123", "5678", "김철수", 20, '남', 163.5));
        members.add(new Member("sung123", "9010", "성춘향", 25, '남', 152.2));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_objects.dat"))) {




            oos.writeObject(members);

            for(Member member : members){
                oos.writeObject(member);
                System.out.printf("%s 객체 저장 완료\n", member.getId());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void objectsRead(){

        List <Member> members = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_objects.dat"))) {
            // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c_object.dat"));

            try {
                while (true) {
                    members.add((Member) ois.readObject());
                }

            }catch(EOFException e){ //
                System.out.println("파일 읽기 완료");
            }
            for(Member member : members){
                System.out.println(member   );
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }





}

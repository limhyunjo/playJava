package com.beyond.assiststream.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
    
    public void fileSaveAndRead(){
        
        // 스트림 생성
        // 파일 출력 
        // 기반 스트림 생성
        // 보조 스트림 연결
        // try with resource로 close 자동 생성
        // write 메서드로 파일에 출력
        
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt")); // 2개를 구분하기 위해 세미 콜론
                DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"))) {
            // 기반 스트림으로 사용하고 나면 쓸 일이 없음
            // ctrl + alt + n -> inline 처리
            // DataOutputStream dos = new DataOutputStream(new FileOutputStream("b_data.txt")); // write 메소드 사용하여 저장할 예정


            //DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"));
            // 파일에 데이터 출력
            dos.writeUTF("홍길동");
            dos.writeInt(30); // 4byte
            dos.writeDouble(175.3); // 8 byte
            dos.writeChar('남'); // 2byte
            dos.writeBoolean(false); //1byte

            // 각각 표현하는 byte가 달라서 저장은 정상적으로 되지만 출력은 이상하게 됨
            
            // 파일에서 데이터 읽어오기
            // 순서 바뀌면 제대로 출력되지 않는다
        /*    System.out.println(dis.readUTF());
            System.out.println(dis.readDouble()); // 8byte로 끊어서 읽어옴
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());*/

            System.out.printf("이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c, 결혼 여부는 %b입니다.\n",
                    dis.readUTF(), dis.readInt(), dis.readDouble(), dis.readChar(),dis.readBoolean());
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}

package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class A_FileByteStream {

    public void fileSave(){

        // 내용 저장할 메서드

        FileOutputStream fos = null;
        byte[] values = {99, 100, 101, 102, 103};


        try {
            //fos = new FileOutputStream("a_byte.dat"); // dat : data 파일이라는 뜻
            fos = new FileOutputStream("a_byte.dat", true); // dat : data 파일이라는 뜻
            // append true : 덮어쓰지 않고 이어쓰는 것을 허용
            
            
            fos.write(97); // 4byte 중 마지막 1byte만 사용 // a
            fos.write('b'); // 형변환되어서 넘어감
            fos.write(10);  // 줄바꿈 문자가 저장됨
            fos.write('c'); 
            fos.write(10); 
            fos.write('홍'); // 홍이 M으로 나옴 / write는 integer 타입으로 받음
            // 한글은 2byte로 표현되기 때문에 byte 단위 Stream으로는 출력에 제한이 있다. ( 2byte 중 1byte만 출력됨)


            fos.write(10);
            fos.write(values); // 코드값 cdefg 출력
            fos.write(10);
            fos.write(values, 1 , 2); // offset : 내가 출력할 시작 인덱스
            // write 메소드는 IOException을 throw 한다 -> try catch로 감싸주기
            
            // 버퍼에 모였다가 한번에 나감
            fos.flush();
            // write() 메소드에서 IOException이 발생했을 경우 close()가 실행되지 않는다.
            // 따라서 finally 블록 안에서 close() 메소드를 실행해야 한다.
            // fos.close();

        } catch (IOException e) { // filenotfound 보다 io가 더 상위라 이것만 써도 됨
            e.printStackTrace();
        } finally {
            // fos는 try 안에서 만든 지역 변수고 try 블록 안에서만 존재 -> 변수를 try 밖에 선언해준다
            try {
                // close는 예외가 발생하건 안하건 무조건 실행되도록 해야함

                if (fos != null) {
                    fos.close(); // try catch로 한 번 더 감싼다

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // 생성자에서 this는 다른 생성자 호출

        // 위에서 만들어진 파일을  들어가면

    }


    public void fileRead(){
        
        // 내용 읽어올 메서드
        FileInputStream fis = null; // 참조변수 null로 초기화
        byte[] buffer = new byte[50];



        try {

            // inputStream 같은 경우는 파일이 존재하지 않으면 Filenotfound 예외 발생
            // 읽어오는 애라 파일이 없는 경우 자동으로 새로 만들 수 없음

            fis = new FileInputStream("a_byte.dat"); // try catch로 감싸기
            // 객체가 생성될 때 주소값을 주는데 예외가 발생하면 생성되지 않고 바로 catch로 넘어감
            // 그대로 null이 담겨 있어서 넘어가면 nullpoint예외가 발생


        /*    System.out.println((char)fis.read()); //filenotfound를 io예외로 바꾸면 한번에 예외처리 가능
            System.out.println((char)fis.read());
            System.out.println(fis.read());
            //System.out.println(fis.read(buffer));
            // 읽어온 바이트의 개수를 리턴
            System.out.println(fis.read(buffer, 10, 10)); // 10번부터 10개만 읽어옴
            System.out.println(Arrays.toString(buffer));
            // 배열에서 할당한 공간이 50이어서 값이 없는 만큼 0이 들어감


            System.out.println(fis.read()); // 위에서 buffer에 담아서 읽어온 후 더이상 읽을 게 없어서 -1 나옴
*/
            // 위의 출력을 반복문으로 만들기
            // 버퍼 내부에 잔류 바이트가 없도록 -1 이 나올 때까지 반복해서 읽는 반복문

            // 내부에 데이터가 얼마나 있는지 모름 -> 얼마나 반복하는지 모름

            // read() 메소드가 2번 실행되기 때문에 정상적으로 값을 출력할 수 없다( 읽어올 때 뜨문 뜨문 읽어오게 됨)
         /*   while (fis.read() != -1) {
                System.out.print((char)fis.read());
            }*/

            int value = 0;
            while((value=fis.read())!= -1){
                System.out.println((char)value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                if(fis != null) {
                    fis.close(); // 예외 처리

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

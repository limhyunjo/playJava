package com.beyond.fileio.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharStream {

    public void fileSave(){

        // try - with - resource
        // try(선언문) -> try에서 예외가 발생하면 먼저 close를 해주고 catch 구문으로 넘어감
        // try - with - resource 문을 통해서 사용한 리소스를 자동으로 close() 시킨다.
        try (FileWriter fw = new FileWriter("b_char.txt", true)){
           // FileWriter fw = new FileWriter("b_char.txt", true);// 파일을 연결해서 쓸 것임

             fw.write('A');
             fw.write('\n');
             fw.write('홍');
             fw.write('\n');
             fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
             fw.write('\n');
             fw.write(new char[] {'a', 'p', 'p', 'l', 'e'},2, 3);
            fw.write('\n');
            fw.write("안녕하세요\n");
            fw.write("저는 홍길동입니다.\n", 3, 8);
            fw.flush();


    } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public void fileRead(){

        // 파일 내용 출력하기

        try(FileReader fr = new FileReader("b_char.txt")) {
            //FileReader fr = new FileReader("b_char.txt");
            
            int value = 0;
            
            while ((value = fr.read()) != -1) { //문자 하나 읽어오고 -1이 아니면 반복문 수행
                System.out.println((char)value); // read()는 int로 읽어오기 때문에 char로 바꿔준다
                // 파일 내용을 읽어서 출력해줌
            }
            
            
        } catch (FileNotFoundException e) { // 위에서 try문 에러나는 이유는 close문이 io 예외를 던지는 중이라
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일명 잘못주면 에러남




    }
}

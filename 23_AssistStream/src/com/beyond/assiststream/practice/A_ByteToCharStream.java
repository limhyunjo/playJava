package com.beyond.assiststream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {


    // InputStreamReader 테스트
    public void method1(){
        
        //

        // System.in -> 표준 입력과 연결된 inputstream
        // static final 이라 프로그램 시작과 동시에 만들어짐
        try {
        char[] buffer = new char[50];
        //InputStreamReader isr = new InputStreamReader(System.in); // 보조 스트림을 여러개 사용할 수도 있음
        // inputStreamReader는 보조 스트림이라 기반 스트림이 있어야 생성된다
        // InputStreamReader는 byte 기반의 스트림을 문자로 바꿔줌
        // 기반 스트림을 system.in으로 함
        
        // system.in 은 byte 기반 스트림이고 inputstreamreader가 system.in을 문자 기반 스트림으로 바꿔줌
        // . 찍어서 사용 메소드로 확인 가능
      /*      System.out.print("문자열 입력>"); // 사용하고 close 안할 것임 (계속 사용)

            isr.read(buffer); // 입력한 값 읽어서 담아줌
            // IO 예외때문에 오류남 -> try catch로 감싸기

            for(char c : buffer){
                System.out.print(c); // 읽어온 값 출력
            }*/


            //----------------------------------------------------

            // 보조 스트림 여러개 사용
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // bufferedreader로 보조 스트림을 또 받음( buffer가 부모라서 형변환 가능)
            // 기반 스트림에 input보조 스트림 연결 이후 bufferReader 보조 스트림을 연결 -> 여러개의 보조 스트림을 연결해서 사용할 수 있다
            // 성능을 향상 보조 스트림을 연결해서 사용
            String line = null;
            System.out.print("문자열 입력 >");
            line = br.readLine();

            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*enter를 입력한 순간 문자를 버퍼에 담아주고 콘솔에 출력 후 종료*/

    }


    // OutputStreamWriter
    public void method2(){


        // system.out -> 표준 출력에 해당하는 콘솔에 연결된 outputStream
        // print 메소드를 가짐
        // byte 기반 스트림

        // 처음부터 문자 기반 스트림이 필요하면 write로 만들면 됨
        // 다른 곳에서 byte 기반 스트림을 가져온다면 outputStream으로 문자 기반 스트림으로 만들어줌

        try {

        // OutputStreamWriter osw = new OutputStreamWriter(System.out);
/*

            osw.write("안녕하세요. 저는 이몽룡입니다.\n");// 버퍼에 입력만 함
            osw.write("만나서 반가워요. 힘내세요..^^\n");
            // 버퍼에 데이터를 쌓아놨다가 출력
            // 출력 스트림들은 내부부 버퍼를 flush를 통해 비워주지 않으면 데이터가 쌓여있음
            // stream 메서드들은 close를 하면 flush도 같이 일어남
            osw.flush(); // 이걸 안하면 내부 버퍼에 채워진 채로 종료됨(출력이 안됨)
*/
            
            // ---------------------------
            
            //bufferedwriter 메소드로 성능 향상
            BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
            // byte 기반의 output 스트림을 문자 기반의 스트림(outputstreamwriter)으로 문자열 기반으로 바꿔주고 bufferedwriter로 성능 향상
            
            bw.write("안녕하세요 저는 이몽룡입니다.");
            bw.newLine(); // bufferedwriter에서 제공하는 개행 메서드
            bw.write("만나서 반가워요. 힘내세요..^^\n");
            bw.flush(); // 이걸 해야 출력이 됨
            //bw.close(); 시스템에서 제공하는 것이라 종료시키면 다른데서 사용할 수 없음 / 하면 안됨
            
            /*
            * sysout, sysin은 기반 스트림인데 close하면 쓸 수 없게된다
            * 
            * // close하면 메인 메서드의 프로그램 종료 구문이 보이지 않고 이후 사용할 수 없다
            * 
            * */
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 보조 스트림들을 반드시 기반 스트림이 있어야 함(생성자 매개값으로 보냄)

    }
}

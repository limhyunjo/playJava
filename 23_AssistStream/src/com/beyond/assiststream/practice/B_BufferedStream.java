package com.beyond.assiststream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_BufferedStream {

    public void fileSave(){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt", true))) {
            // 기반 스트림 먼저 생성
            // FileWriter fw = new FileWriter("a_buffer.txt");

            // 기반 스트림을 bufferedwirter 객체를 만들어 전달
           // BufferedWriter bw = new BufferedWriter(new FileWriter("a_buffer.txt")); // 생성자의 매개값으로 기반 스트림 전달

            // bufferedwriter 로 writer 메서드 호출해서 사용


            // 자동으로 close 하도록 try with resource 구문 사용 try() 내부에 넣음


            // 출력
            bw.write("This is a BufferedStream");
            bw.newLine(); // bufferedwriter에서 제공하고 개행 (줄바꿈)할 때 사용 ( 어플리케이션 구동 시 실행됨)
            bw.write("줄바꿈이 적용되었나요?");
            bw.newLine(); // 기반 스트림에는 없음 bufferdwriter에서 제공해주는 것
            bw.flush();// 자동 close 되면서 flush도 같이됨 -> 안 써줘도 됨
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void fileRead(){

        // 기반 스트림 생성
        try(BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"))) {
            //FileReader fr = new FileReader("a_buffer.txt");
            // 기반 스트림은 보조 스트림 생성 시 매개값 전달할 때만 필요
            // 보조 스트림 생성 ( Reader를 매개값으로 받음)
           // BufferedReader br = new BufferedReader(new FileReader("a_buffer.txt"));


            // readline() : BufferedReader에서 제공하는 메서드, 한 줄을 읽어서 문자열로 반환해줌
            String line = null;

           /* line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            line = br.readLine();
            System.out.println(line);

            line = br.readLine(); // 더이상 읽어올 데이터가 없으면 null을 return한다
            System.out.println(line); */

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }


            /* .readLine()
            * BufferedReader에서 제공하는 메소드, 파일에서 한 줄을 읽어올 때 사용한다
            * 더 이상 읽어올 데이터가 없을 때 null을 return한다.
            * line = br.readLine();
            * System.out.println(line);
            *
            * */
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

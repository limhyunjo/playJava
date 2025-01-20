package com.beyond.file.practice;

import java.io.File;
import java.io.IOException;

public class A_File {

    /*
    * File 클래스
    *
    *  - 파일을 다루기 위한 클래스
    *  - 파일 크기, 속성, 이름, 등의 정보를 얻어내는 기능과 파일  생성 및 삭제 기능을 제공한다.
    *  - 파일의 데이터를 읽고 쓰는 기능은 지원하지 않는다
    *  - 파일의 데이터를 읽고 쓰기 위해서는 파일 관련 입출력 스트림을 사용해야 한다
    *
    * */

    public void method1(){

        try {
            // 파일 경로 생략하고 파일명만 주면 root 파일 아래 만들어줌
            File file = new File("test1.txt"); // 메모리상에만 존재하는 파일

            // 경로를 지정해주면 해당 위치에 파일을 만들어줌
            // File file = new File("C:/Users/Playdata/develop/test.txt"); // alt + enter 지역변수로 삽입
            // heap 메모리 영역에 파일 객체를 만들고 test.txt라는 이름을 파일을 만듬 -> 아직은 메모리 상에만 존재하고 파일이 생성되지는 않음
            // 메모리상에만 존재하는 객체


            System.out.println("파일명 : " + file.getName());
            System.out.println("파일 경로 : " + file.getAbsolutePath());
            System.out.println("파일 용량 : " + file.length());
            System.out.println("파일 존재 여부 : " + file.exists()); // false ( 아직 heap메모리에만 존재하는 자바 객체 )
            System.out.println("파일 여부 : " + file.isFile());
            System.out.println("디렉터리 여부 : " + file.isDirectory());


            if(file.exists()){ //  파일이 존재하면
                file.delete(); // 파일 또는 디렉터리 삭제
            }else{
                // 실제 파일로 만들기 -> .createNewFile() 메소드를 사용하고 예외처리 해주면 실체 파일이 만들어짐

                file.createNewFile(); // 실제 파일이 만들어짐
                // 처리되지 않은 예외
            }
           
            // CheckedException : 처리되야 하는 예외
            // IOException 도 CheckedExceptioon
            // ctrl로 메서드 눌러보면 예외를 처리하라고 throw한게 보임
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        




    }




    public void method2(){

        try {

            boolean result=false; // 파일 생성 실패 성공 여부

            //File file = new File("C:/Users/Playdata/develop/temp/demo/demo.txt");
            // 존재하는 경로로 파일을 만들어야 함
            // 중간에 temp/demo는 존재하지 않는 파일이어서
            // 파일을 만들려하면 오류남
            // File file = new File("C:/Users/Playdata/develop/temp"); // temp 폴더를 만듬
            File demo = new File("C:/Users/Playdata/develop/temp/demo"); // temp 폴더를 만듬
            File file = new File("C:/Users/Playdata/develop/temp/demo/demo.txt"); // temp 폴더를 만듬


            // 존재하지 않는 경로일 경우 디렉터리 생성
            if(!demo.exists()){
                //file.mkdir();  // 디렉토리 생성
                result = demo.mkdirs(); // 중간에 없는 디렉토리도 디렉토리 생성
            }

            /*
            *  파일 생성
            * - 경로를 지정하면 해당 위치에 파일을 생성한다.
            * - 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
            *
            *
            * */

            if(!file.exists()){
               result = file.createNewFile();
            }

            System.out.printf("폴더 및 파일 생성 여부 : %b\n", result);

            //file.createNewFile(); // ctrl + enter로 예외처리
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

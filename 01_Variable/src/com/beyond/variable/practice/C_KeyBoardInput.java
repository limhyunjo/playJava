package com.beyond.variable.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class C_KeyBoardInput {

    /*
    *system.in 표준 입력
    사용자로 부터 입력 받음
    사용자가 입력한 값을 바이트 단위로 읽음
    Scanner scanner = new Scanner(System.in);
    // System.in(필드)은 키보드에 연결된 inputStream
    *
    * // Scanner클래스를 사용하면
     사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
     system.out은 표준 출력 (모니터와 연결됨)
     system.in 은 키보드
    * */

    public void keyboardInput() {

        Scanner scanner = new Scanner(System.in);
        String name = null;
        int age = 0;
        double height = 0.0;
        char gender = '\u0000'; // 그냥 0 넣어도 됨


        System.out.print("enter your name: ");
        name = scanner.nextLine();
        // next와 nextLine의 차이점
        // 
        // 문자 하나만 꺼내올 때는 next 사용


        System.out.print("enter your age: ");
        age = scanner.nextInt();
        // scanner에서 nextInt 자체가 사용자가 입력한 값을 반환해줌

        System.out.print("enter your height:");
        height = scanner.nextDouble();

        System.out.print("enter your gender(m/f): ");
        gender = scanner.next().charAt(0); // 0번째 인덱스의 값을 담아줌


        System.out.printf("당신의 이릉은 %s 이고 나이는 %d세, 키는 %.1fcm 이고 성별은 %c 입니다.\n",
                name, age, height, gender);



        //ctrl + alt + shift s : 프로젝트 설정 변환


        // ---------------------------------------------------------------------

        // Scanner 객체를 사용하기 위해서는 Scanner 클래스를 import 해줘야 함
        // java.util 패키지에 존재하기 때문에 import해서 가져옴

        // Scanner.next(); : 단어 (String) 1개 입력
        // 공백 문자 입력 시 입력 종료

        //  Scanner.nextLine(); : 문자열(string) 1개 입력
        // 엔터 (개행 문자) 입력 시 종료 
        
        // Scanner.nextInt() : int 형 정수 1개 입력
        // Scanner.nextlong() : long형 정수 1개 입력
        // Scanner.nextDouble() : 실수 1개 입력
    }

    // Scanner.nextLine();
    // scanner.nextInt면 버퍼에 저장된 값 중
    // 정수만 추출된다 // -> 정수와 같이 입력된 엔터가 버퍼에 남아있음
    // 버퍼에서 다음 엔터까지 읽어오는 scanner.nextLine() 해석 시
    // 버퍼에 남아있는 엔터 때문에 아무것도 입력 못함
    // nextLine()을 한번 호출해서 남아있던 엔터를 빼버림(제거)
    // 버퍼가 비어야 다시 입력 가능

    public void method4() {

        Scanner sc = new Scanner(System.in);
        //길이를 입력 받아
        System.out.print("배열 길이:");
        int len = sc.nextInt();

        //입력 받은 길이 만큼의 배열을 생성(할당) 한 후
        int[] randoms =new int[len]; // 입력하는 수(len) 만큼 길이 할당

        //모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
        for(int i=0; i< randoms.length; i++) {

            randoms[i]=(int)(Math.random()*len);
            // double을 int로 강제 형변환
            // 데이터 손실을 이용한 소수점 제거
        }
        //Arrays.toString(배열참조변수)
        // -> 배열에 모든 요소를 [a,b,c] 형태 문자열로 반환

        System.out.println(randoms);// 주소(비스무리한 것)

        System.out.println(Arrays.toString(randoms));// 배열 요소 출력

    }




}

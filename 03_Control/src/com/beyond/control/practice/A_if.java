package com.beyond.control.practice;

import java.util.Scanner;

public class A_if {


        /*
        * if 문
        *  [표현법]
        *
        *  if(조건식){
        *    .. 실행 코드
        *
        *  }else if (조건식){
        *     .. 실행 코드
        *
        *  }else{ - 위의 조건식이 참인 경우 else는 실행되지 않음
        *     .. 실행 코드
        *
        *  }
        *    - 조건식의 결과는 항상 true, false인 논리연산자
        *
        *    - 상황에 따라 else는 생략 가능
        * */

    // 사용자에게 입력받은 정수값이  홀수인지 짝수인지 판별하기

    public void method1(){


       // System.in(사용자가 입력한 값을 바이트 단위로만 읽어온다
        // 정수나 실수 형태로 가져오고 싶으면?
        // -> Scanner 클래스 사용 : 사용자가 입력한 값을 정수, 실수, 문자 형태로 가져옴


        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력>");

        number = sc.nextInt();

        if((number % 2) == 0){
            // 조건식이 참인 경우 중괄호 안의 내용이 실행됨
            System.out.printf("%d은(는) 짝수이다. \n", number);

        }else{
            // ctrl + y 한 줄 삭제
            // ctrl +d 한 줄 복사
            System.out.printf("%d은(는) 홀수이다. \n", number);
            // 실행 코드가 한 줄인 경우 중괄호는 생략 가능
            // 가독성 때문에 한 줄이어도 중괄호 사용
        }

        

        
    }


    // 사용자에게 이름을 받아서 "홍길동이 맞는지 확인하기

    public void method2(){


        String name = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요!>");

        name = sc.nextLine();
        System.out.println("홍길동" == "홍길동"); // true
        System.out.println("홍길동" == new String("홍길동")); //false
        System.out.println( name == "홍길동"); // false
        // 문자열은 참조 타입이어서 비교 연산자로 비교 X

        // 문자열이 아닌 주소 값을 비교함
        // heap 영역에 문자열을 저장하고 주소값을 얻어옴

        // String 지역 변수를 생성해서 사용하면 Stack 영역에 저장됨
        // 변수 안의 문자열은 heap 영역에 저장됨( 크기 만큼 메모리 영역이 할당되어 문자열이 만들어짐)
        // Stack에서 heap 영역의 주소를 참조해서 저장

        // -----------------------------------------

        System.out.println("홍길동" == "홍길동");
        // 비교가 가능하고 true가 나오는 이유
        // 리터럴을 만들면 heap 영역 안에 상수 constant pool을 생성
        // 동일한 리터럴을 사용하면 상수풀에 있는지 확인하고 메모리 낭비를 막기 위해
        // 새롭게 만들지 않고 하나의 문자열을 같이 참조
        // 이미 있으면 기존의 주소값을 똑같이 참조하도록 대입해준다
        // 똑같은 리터럴 -> 같은 주소를 참조하게 됨 ( true가 나옴 )


        System.out.println("홍길동" == new String("홍길동")); //false
        // new 연산자로 만들면 문자열이 같아도 heap영역에 새로 만든다 -> 새 주소를 가짐
        /*
        *  stack          heap
        *  name(주소)  <-  문자열(주소)
        *
        * */

        // 문자열을 비교할 때는 .equals 사용
        // 문자열의 주소값과 상관업이 데이터만 비교하는 메서드
        // System.out.println("홍길동".equals(new String("홍길동"))); //false



        if(name.equals("홍길동")){ // "홍길동".equals(name) 도 가능

            System.out.printf("%s는(은) 홍길동과 이름이 일치합니다", name);
        }else{

            System.out.printf("%s는(은) 홍길동과 이름이 일치하지 않습니다.", name);
            // 입력 안 하고 엔터만 눌러도 빈 문자가 들어가서 일치하지 않는다고 나옴
        }



    }


    // 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인하기
    public void method3(){

        char ch = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.print("알파벳 하나를 입력해주세요>");
        ch = sc.next().charAt(0); // 문자열을 입력받아서 하나만 출력
        // 문자열을 입력받아서 0번에 위치한 문자 하나만 출력

        
        // 알파벳만 입력 가능하게 하기
        if((ch >= 'A') && (ch <= 'Z')){ //  코드값도 가능
            System.out.printf("%c은(는) 알파벳 대문자이다.",ch);

        }else if(ch >= 'a' && ch <= 'z'){
            System.out.printf("%c은(는) 알파벳 소문자이다.",ch);

        }else{
            System.out.printf("%c은(는) 알파벳이 아닙니다.",ch);

        }


        System.out.printf("%c",ch);

    }


    // 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력
    // -90점 이상을 A
    // B는 80점 이상, C, D, 60점 미만은 F 등급
    public void method4(){

      int score = 0;
      Scanner sc = new Scanner(System.in);

      char grade = '\u0000';

        System.out.printf("점수 >");
        score = sc.nextInt();

        if (score >= 90){
            grade = 'A';

        } else if (score >= 80){
            grade = 'B';

        }else if (score >= 70){
            grade = 'C';

        }else if (score >= 60){
            grade = 'D';

        }else{
            grade = 'F';
        }
        System.out.printf("당신의 점수는 %d 점이고 등급은 %c  \n", score, grade);


    }

}

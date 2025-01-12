package com.beyond.variable.practice;

public class B_ConsoleOutput {

    public void valuePrint() {

        // System도 클래스임 
        // System.out (console/ 콘솔)
        // System.out 출력 필드에 접근해서 print 메서드를 호출할 것임
        System.out.print("안녕하세요."); // 값을 전달하면 콘솔에 출력해줌
        // 시스템이 가진 출력 장치로 출력할 것임

        // System.out은 표준 출력에 해당됨
        System.out.print(12345);
        System.out.print(false);
        // println과 다르게 한 줄에 출력됨
        // 값을 출력하고 줄바꿈을 하지 않는다
        // print메서드는 단순하게 괄호 안의 값을 콘솔에 출력해 주는 역할만 한다

        System.out.println();
        System.out.println("안녕하세요");
        System.out.println(123345);
        System.out.println(false);

        // println은
        // print 메서드와 동일하게 출력하는 메서드로
        // 출력 후 자동으로 줄바꿈 해주는 메서드이다.

        // f= format 정해진 서식을 줌
        // 해당 format에 맞는 값을 출력해줌
        // 줄바꿈 x
        System.out.printf("%d\n", 10);
        System.out.printf("%d + %d = %d\n", 10, 20, (10+20));

        // printf 는 정해져 있는 서식에 맞는 값을 줄바꿈하지 않고 출력해주는 메소드이다.

        // 서식 지정자
        /*
        *  %d : 정수형
        *  %f : 실수형
        *  %b : 논리형
        *  %c : 문자형
        *  %s : 문자열
        *
        * */


       // escape 문자
       //  \n : 줄 바꿈
       //  \t : 수평 탭
       //  \" : 큰 따옴표 출력
        //  \' : 작은 따옴표 출력

        System.out.printf("%f\t%f\n", 3.14, 4.2345);
        System.out.printf("%.2f\t%.3f\n", 3.14234, 4.23452342);
        System.out.printf( "%c %s \n", 'A', "\"Hello world!\"");
        // 서식 지정자의 개수에 맞게 값을 지정해줘야 함
        // " 자체를 하나의 문자로 만들어줌 이스케이프 문자

    }
}

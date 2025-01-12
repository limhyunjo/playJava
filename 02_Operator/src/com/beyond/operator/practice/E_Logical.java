package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {

    public void method1() {
      // 사용자가 입력한 정수값 1부터 100 사이의 값인지 확인하기

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean result = false; // 결과 참거짓
        System.out.print("임의의 정수를 입력해주세요>");

        number = sc.nextInt();

        // number 가 1보다 크고 100보다 작은지 확인
        result = ((1<=number) && (number<=100));
        System.out.printf("%d는(은) 1부터 100사이의 값인가요? %b \n", number, result);



    }

    public void method2() {

        // short cut 연산
        // 단락회로 연산
        //(Short Circuit Evaluation)

        int number1 = 10;
        boolean result = false;

        System.out.println("&&연산 전의 number의 값을 출력 : " + number1);

        // && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산을 수행하지 않음
        result = ((number1 <5) && (++number1 > 0)); // 첫 연산부터 false라 뒤가 실행되지 않음
        // 첫 조건의 값이 거짓인 경우 뒤 코드가 실행되지 않는 것을 활용

        // & 기호를 한번만 사용하면 앞이 false여도 뒤의 연산을 수행한다
        System.out.println("result : " + result);
        System.out.println("&&연산 후의 number의 값을 출력 : " + number1);
        System.out.println();



        System.out.println("||연산 전의 number의 값을 출력 : " + number1);

        result = ((number1 <20) || (++number1 > 0)); // 첫 연산부터 true라 뒤가 실행되지 않음
        // 첫 조건의 값이 참이어서 뒤 코드가 실행되지 않는 것을 활용

        // 뒤 코드가 실행되기를 바라면 |하나만 사용
        System.out.println("result : " + result);
        System.out.println("||연산 후의 number의 값을 출력 : " + number1);
        System.out.println();
    }
}

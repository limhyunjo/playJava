package com.beyond.operator.practice;

import java.sql.SQLOutput;

public class C_Arithmetic {
    
    public void method1() {

        
        // 정수의 산술 연산
        int number1 = 10;
        int number2 = 3;

        //shift + enter 누르면 커서만 아래로 내려옴

        // ctrl + shif +enter ; 쉼표 붙여줌
        System.out.println( number1 + number2);
        System.out.println( number1 - number2);
        System.out.println( number1 * number2);
        System.out.println( number1 / number2);
        System.out.println( number1 % number2);


        // 실수의 산술 연산

        double dNumber1 = 35.0;
        double dNumber2 = 10.0;
        System.out.println( dNumber1 + dNumber2);
        System.out.println( dNumber1 - dNumber2);
        System.out.println( dNumber1 * dNumber2);
        System.out.println( dNumber1 / dNumber2);
        System.out.println( dNumber1 % dNumber2);


        // 문자의 산술 연산
        char ch = '홍';
        System.out.println((char)(ch +1)); // 홍에 해당하는 코드값 + 1이 나온다 54862
        System.out.println('a'+'b');

        //참고

        System.out.println(5/0);
        // ArithmeticException : 예외 발생됨
        System.out.println(5/0.0);
        // 에러가 나지 않고 infinity

        System.out.println(5%0);
        // 오류남 (처음과 동일한 오류(예외 발생))

        System.out.println(5%0.0); // NaN (Not a Number) : 숫자 값이 아님

        // Double이라는 클래스에서 메소드 사용
        // 연산 결과가 infinity인지 검사하는 메소드
        System.out.println( Double.isFinite(5/0.0));
        // 연산 결과가 NaN인지 검사하는 메서드
        System.out.println( Double.isNaN(5%0.0));
        // 매개 값이 무한대면 true


    }
}

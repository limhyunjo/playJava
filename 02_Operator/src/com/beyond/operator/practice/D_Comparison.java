package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {

    public void method1() {

        int number1 = 10;
        int number2 = 25;

        boolean result = false;

        // result = (number1 == number2);
        //result = (number1 != number2);
        // 가독성을 위해 괄호 써줌

        // result = (number1 < number2);
        // result = 'A' == 65;  // int의 범위가 더 커서 A가 숫자로 변함 A 코드는 65
        // result = ( 3.0 == 3); // double로 형 변환 되어 비교 (true)
        result = (0.1 == 0.1f); // false
        // false인 이유 double, float 
        // true일 것 같지만 예외적으로
        // 부동 소수점 방식은 오차 생길 수 있어서 실수형 비교는 잘 안함
        //대부분의 비교 연산에서는 정수 타입을 사용

        System.out.println("result : " + result);


    }

    public void method2() {

        /*산술 연산 + 비교 연산
        - 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단하기
        *
        * */

        int number = 0;
        boolean result = false;

        Scanner sc = new Scanner(System.in);


        System.out.print("임의의 정수를 입력하세요 >");

        number = sc.nextInt();

        result = ((number % 2) == 0);
        System.out.printf("%d는 짝수인가요? %b \n", number, result);




    }
}

package com.beyond.operator.practice;

public class A_LogiacalNegation {

    /*
    * 논리 부정 연산자
    * [표현법]
    *
    *  !논리값 (true, false)
    *
    * */

    /*
            * shift alt
        -- 코드 옮기기

        ctrl shift
        -- 메소드 안에서 코드 옮기기 가능


    *
    * */

    public void method1() {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 :" + b1); // true 
        System.out.println("b1의 부정 :" + !b1); // true 
        // 논리 부정 연산자를 사용해도 b1의 결과에 영향을 주지는 않는다
        
        System.out.println("b2 :" + b2);
        System.out.println("b2의 부정 :" + !b2);

    }





}

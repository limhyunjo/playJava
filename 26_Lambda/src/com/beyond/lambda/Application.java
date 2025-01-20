package com.beyond.lambda;

import com.beyond.lambda.practice.A_Lambda;
import com.beyond.lambda.practice.B_FunctionalInterface;
import com.beyond.lambda.practice.C_Consumer;
import com.beyond.lambda.practice.D_Supplier;
import com.beyond.lambda.practice.E_Function;
import com.beyond.lambda.practice.F_Operator;
import com.beyond.lambda.practice.Functional.C_Functional;
import com.beyond.lambda.practice.G_predicate;
import com.beyond.lambda.practice.H_MethodReference;

public class Application {


    /* 람다식 ( Lambda Expression )
    *
    *자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다.
     람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만 런타임 시에는 인터페이스의 익명 구현 객체를 생성한다.
     *
     *
     *  [표현법]
     *  - ( [자료형 매개변수, ...]) ->{
     *      // 실행 코드
     *
     *   [ return 반환값; ]
     * }
     *
     *  Ex)
     *
     *
     *   - () -> {....}
     *
     * //----------------------------------------
     *
     * 매개 변수가 하나인 경우
     *
     *  - (int a) -> {  System.out.println(a);} // 내부에 프린트 구문을 작성한 람다식
     *  - (a) -> {  System.out.println(a); } // 자료형 생략 가능
     *  - a -> System.out.println(); // 매개변수가 하나일 떄는 괄호 생략 가능, 실행 코드가 하나일 때 중괄호 생략 가능
     *
     *
     * // --------------------------------------
     *
     *  매개 변수를 2개 가지는 경우
     *
     *  - (int a, int b ) -> { return a + b}; // 매개 변수 2개를 받아서 리턴하는 람다식
     *  - ( a, b ) -> {return a + b;} // 매개 변수의 자료형 생략 가능, 변수가 여러개라 괄호 생략 불가능
     *  - ( a, b ) -> a + b;  // 식이 하나라 중괄호 생략 가능 , return 구문 생략 가능
     *
     * //--------------------------------------
     *
    * */
    public static void main(String[] args) {

        // Runnable 인터페이스로 람다식 테스트
       // new A_Lambda().method1();


        // 반환값이 없고 매개값이 없는 메서드의 구현 객체
        // 함수적 인터페이스
        // new B_FunctionalInterface().method1();
        //new B_FunctionalInterface().method2();
        //new B_FunctionalInterface().method3();
        //new B_FunctionalInterface().method4(300);

        // 매개값을 받아서 소비만 하는 역할 return 없음
        //new C_Consumer().method1();


        // 매개값 없이 하나만 return 공급하는 역할
       // new D_Supplier().method1();


        // 타입 변환
       // new E_Function().method1();

        // 연산
        // new F_Operator().method1();
       // new G_predicate().method1();

        // 메소드 참조
        new H_MethodReference().method1();

    }
}

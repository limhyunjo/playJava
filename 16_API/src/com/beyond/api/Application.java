package com.beyond.api;

import com.beyond.api.practice.A_String;
import com.beyond.api.practice.B_Wrapper;
import com.beyond.api.practice.C_DateTime;

public class Application {

    public static void main(String[] args) {


        //new A_String().method1();
        //new A_String().method2();

        // Wrapper 클래스 (메소드의 매개값으로 객체 타입만 요구되거나 컬렉션 경우 기본 타입의 값을 객체로 만들어줌
        // new B_Wrapper().method1();


        // 날짜, 시간과 관련된 클래스
       // new C_DateTime().method1();
        new C_DateTime().method2();


    }
}

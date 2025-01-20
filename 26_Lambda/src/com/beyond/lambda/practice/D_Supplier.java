package com.beyond.lambda.practice;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class D_Supplier {


    /*
    * Supplier
    *  - Supplier 표준 함수적 인터페이스는 매개값이 없고 리턴값이 있는 get() 추상 메소드를 가지고 있다
    *  - get() 추상 메서드는 호출한 곳으로 데이터를 공급(리턴)하는 역할만 한다.
    *
    * */

    public void method1(){

        // 객체를 반환하는 supplier , T 타입의 객체를 반환
        // Supplier<T> : T 타입의 객체를 리턴한다
        Supplier<String> supplier= () ->  "Supplier는 T 타입의 객체를 리턴한다.";
        System.out.println(supplier.get());


        // BooleanSupplier : boolean 타입이 고정이라 타입 파라미터를 받지 않음
        // BooleanSupplier : boolean 타입의 값을 리턴한다

        BooleanSupplier booleanSupplier = () ->  true;

        System.out.println(booleanSupplier.getAsBoolean()); // get으로 공급




    }


}

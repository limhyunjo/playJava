package com.beyond.generices;

import com.beyond.generices.practice.ArrayToListConverter;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Generics type


        String[] names = {"홍길동","성춘향","이몽룡","김철수","김영희"};
        Integer[] numbers = {1,2, 3, 4, 5,6};
        Double[] dNumbers = {1.1,3.3, 4.5, 3.2,4.2};
        // 여러 타입을 보내고 싶으면 Object로 정하거나 생성 시점에 타입 파라미터를 정해주면 됨
        
        
        //ArrayToListConverter converter = new ArrayToListConverter(names); // 매개값으로 객체를 넘겨줄 것임
        //ArrayToListConverter converter = new ArrayToListConverter(numbers); // 매개값으로 객체를 넘겨줄 것임
        //ArrayToListConverter<String> converter = new ArrayToListConverter<>(names); // 매개값으로 객체를 넘겨줄 것임
        // 위에 객체가 생성되는 순간 타입이 String으로 정해짐
        ArrayToListConverter<Double> converter = new ArrayToListConverter<>(dNumbers); // 매개값으로 객체를 넘겨줄 것임
        // 생성되는 시점에 클래스의 T를 전부 double로 만든다
        // 객체 생성 시에 타입을 정해줌

        /*
        * 숫자 형태의 배열 데이터들만 받고싶은 경우 < T extends Number >
        *
        * */
        
        /*
        *  하나의 클래스로 여러 타입의 list를 다루고 싶을 때 generics로 객체 생성 시 클래스의 타입을 정함
        * */


        converter.print();
        System.out.println();

        List<Double> list = converter.toList();
        System.out.println(converter.toList());
        System.out.println();
        
        // generics타입으로 한 클래스에서 여러 타입의 배열을 다룰 수 있음

    }
}

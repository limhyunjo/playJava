package com.beyond.generices.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   타입 파라미터는 대문자 알파벳 한글자로 표현한다
    - 타입 파라미터를 가지는 클래스들을 generics type이라 한다
*  E - Element 요소
*  K - Key
*  V - Value
*  T - Type
*  N - Number
*  r - Result
*
* */
//public class ArrayToListConverter<T> {
// T type 파라미터로 올 수 있는 애들은 number나 number를 상속하는 애들만 가능
public class ArrayToListConverter<T extends  Number> { // T는 Number이거나 Number를 상속하는 애들만 받음
// 아무 타입도 안정해주면 Object 타입

    private final T[] values;
    // String 타입의 배열만 저장할 수 있는 클래스


    public ArrayToListConverter(T[] values) {
        this.values = values;
    }

    // values의 값을 출력해주는 메소드
    public void print(){


        for (T value : values) {
            System.out.println(value);
        }
        //Arrays.stream(values).forEach(System.out::println);  한 줄로 가능
    }

    // String array를 받아서 list로 변환
    // list에 저장하는 메소드
    public List<T> toList(){
        List<T> list = new ArrayList<>();

        for( T value : values){
            list.add(value);
        }
        return list;
        //return Arrays.stream(values).toList(); 이렇게 한 줄로도 가능
    }
}

package com.beyond.lambda.practice;

import java.util.function.BiFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class E_Function {
    /*
    * Function
    *  - Function 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가지고 있다.
    *  - apply() 추상 메소드는 주로 매개값을 리턴 값으로 매핑(타입 변환) 하는 역할을 한다.
    * */

    public void method1(){

        // Function<T, R> : T타입의 객체를 R 타입의 객체로 매핑(타입 변환)한다.
       // Function<String, Integer> function;

        /*function = (String str) ->{
          // return 타입이 int

            return Integer.parseInt(str);  // atuo boxing 되어서 integer여도 정수 int로 써도 됨

        };*/

        Function<String, Integer> function = str -> Integer.parseInt(str);

        System.out.println(function.apply("34156")); // 문자를 integer로 바꿔서 반환해줌


        //---------------------------------------

        // BiFunction< T, U , R > : T 타입의 객체와 U 타입의 객체를 R 타입의 객체로 매핑(타입 변환)한다.
     /*   BiFunction<Integer, Double, String> biFunction;

        biFunction = (Integer i ,  Double d)->{

            return String.format("%d + %.1f = %.1f\n", i, d, (i+d));
        };*/

        BiFunction<Integer, Double, String> biFunction = (i,d)->  String.format("%d + %.1f = %.1f\n", i, d, (i+d));
        System.out.println( biFunction.apply(10, 3.15));


      /*  BiFunction<String, Integer, Student> studentBiFunction;
        studentBiFunction = (String name, Integer age) ->{
            //String, Int 타입으로 받아서 Stueent 타입으로 매핑해줌
            return new Student(name, age);
        };
*/

        //BiFunction<String, Integer, Student> studentBiFunction = (name, age) -> new Student(name, age);

         //studentBiFunction = Student ::new; // 직접 생성자 참조해서 bifunction 만들거라는 의미

        //------------------------------------------


        // ToIntFunction<T> : T타입의 객체를 int 타입의 값으로 매핑(타입 변환)한다.
        ToIntFunction<Student> studentToIntFunction;
        // bi binary -> 매개값이 2개
        studentToIntFunction = (Student student) ->{

            return (student.getMath()+ student.getEnglish())/2;
        };

    //studentToIntFunction.applyAsInt(new Student("홍길동", 30, "남자", 60, 80));


        Student student = new Student("홍길동", 30, "남자", 60, 80);

        // studentToIntFunction = s -> (s.getMath() + s.getEnglish()) / 2;
        // studentToIntFunction = s -> s.getAvg();
        studentToIntFunction = Student::getAvg;

        System.out.println(studentToIntFunction.applyAsInt(student));
        
        
        
        //-------------------------------------


        // DoubleToIntFunction : double을 int로 바꿈


    }





}

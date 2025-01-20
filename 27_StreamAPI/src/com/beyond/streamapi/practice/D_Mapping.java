package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D_Mapping {

    /*
    *  매핑
    *  - 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
    *
    * */
    public void method1(){

        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 70, 70)
        );


        // 학생들의 이름을 출력

        students.stream()
                .distinct()
                /*.map((Student student)-> {
                    return student.getName(); // 문자열을 요소로 가지는 새로운 스트림 생성 (Stream -> String)
                })*/
                .map(Student::getName)
                .forEach(System.out::println);



        // 학생들의 점수의 합계
        int sum = students.stream()
                .distinct()
                // student 객체 타입 변환 시킬예정
                //.mapToInt(student->student.getMath())
                .mapToInt(Student::getMath)
                .sum();

        System.out.println(sum);

    }


    public void method2(){

        int[] iNumber = {1,2,3,4,5};
        double[] dNumber = {1.1,2.2,3.3,4.4,5.5};

        Arrays.stream(iNumber)
                // .asDoubleStream()// integer 타입을 double 타입으로 만들어서 요소로 가짐
                // double 타입은 int나 long으로 바꿀 수 없음 ( 범위가 더 작아서 손실이 생김 )
                .asLongStream()
                //.asDoubleStream()
                .forEach(System.out::println);
        // 범위 차이에 의해
        // int는 double, long으로 변환 가능
        // long은 double로 가능
        // double은 변환 불가하다

        System.out.println();

        // 중간 처리 메소드는 최종 처리 메소드가 호출되어야 동작한다!!

        double sum = Arrays.stream(dNumber)
                .boxed() //기본 타입에서 객체 값을 저장하는 타입으로 바뀌었다
                .sorted(Comparator.reverseOrder())
                // 객체 타입은 sum()을 제공하지 않는다 Student + Student? 이런 경우 안됨
                //.mapToDouble(number->number) // 객체 그대로 리턴하면 double로 auto unboxing이 일어남 (다시 알아보기)
                //.mapToDouble(number->number.doubleValue())
                .mapToDouble(Double :: doubleValue)
                .peek(System.out::println)
                .sum();

        System.out.println(sum);


        // peek , forEach는 반복 처리 메소드
        // forEach는 void로 stream을 반환하지 않음 ->최종 처리 메소드
        // peek 은 stream을 반환 -> 중간 처리 메소드



    }
}

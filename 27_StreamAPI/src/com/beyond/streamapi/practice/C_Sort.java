package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class C_Sort {


    // 정렬하기
    /*
    * 정렬
    *  - 중간 처리 단계
    *  - 스트림의 요소들이 최종 처리가 되기 전에 중간 단계에서 요소들을 정렬할 수 있다.
    *  - 기본 데이터 타입의 IntStream, LongStream, DoubleStream은 요소를 오름차순으로 정렬한다.
    *  - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다.
    *
    * */


     // 요소가 기본 자료형 일 떄
    public void method1(){


        // 오름차순 정렬
        IntStream.of(3,5,1,4,2)
                .sorted() // 무조건 오름차순만 가능한 정렬
                .forEach( value -> System.out.println(value + " "));
        System.out.println();

        // 내림차순 정렬
        IntStream.of(3,5,1,4,2)
                .boxed() // 기본 타입의 요소를 박싱(랩핑)해서 객체화하고 새로운 스트림 객체로 돌려줌 -> sorted를 사용 가능하게 됨
                .sorted(Comparator.reverseOrder())
               // .mapToInt(Integer::intValue) 객체에서 다시 기본 타입으로 변경 -> sum() 을 쓸 수 있게됨
                .forEach( value -> System.out.println(value + " "));
             
               // 기본 타입이 아닌 객체에서는 sum() 못 씀
    }


    // 요소가 객체일 때
    public void method2(){

        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 70, 70)
        );

        // 오름차순 정렬
        students.stream()
                .distinct()
                //.sorted((s1, s2)-> s1 -> compareTo(s2))
                // .sorted(Student::compareTo)
                .sorted((s1,s2)->
                        s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);


        System.out.println();

 
        // comparator 인터페이스의 구현 객체를 sorted에 넘겨줌
        
        // 내림차순 정렬
        students.stream()
                .distinct()
                //.sorted(Comparator.reverseOrder())
                //.sorted((s1, s2) -> s2.compareTo(s1))
                .sorted((s1, s2)-> s2.getName().compareTo(s1.getName()))
                .forEach(System.out::println);


    }


    // 매핑 : 타입 변환

    // 스트림 요소의 데이터 타입 변환

}

package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class E_Match {

    /*
    * 매칭
    *  - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다
    *
    *  - allMatch(Predicate) // 모든 요소가 조건을 만족하면 true 리턴
    *    - 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다
    *
    *  - anyMatch(Predicate) // 조건이 하나라도 만족하면 true
    *    - 최소한 한 개의 요소가 매개값으로 주어진 Preidacte의 조건을 만족하는지 조사한다.
    *
    *  - noneMatch(Predicate) //->  모두 거짓이어야 true
    *   - 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
    *
    * */
    public void method1(){
        boolean result = false;
        int[] numbers = {2,4,6};

        // 정수값의 요소들을 가진 스트림 생성
        result = Arrays.stream(numbers).allMatch(number -> number % 2 == 0);

        System.out.println(result); // 요소 중에 하나라도 거짓이면 false가 나옴



        result = Arrays.stream(numbers).anyMatch(number -> number % 3 == 0);
        System.out.println(result); // 요소 중에 하나라도 조건을 만족하면 true, 하나도 만족하지 않으면 false


        result = Arrays.stream(numbers).noneMatch(number -> number % 5 == 0);
        System.out.println(result); // 모두 거짓이어야 true

    }

    public void method2() {


        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 70, 70)
        );

        // 남학생 중에 평균이 80 점 이상인 학생이 한명이라도 있는지
        boolean result = false;
       /* boolean result = false;
        result = students.stream()
                .distinct()
                .filter(student -> student.getGender().equals("남자"))
                .anyMatch(student ->student.getMath()*student.getEnglish()/2 >=80);

        System.out.println(result);
*/
        result = students.stream()
                .distinct()
                .filter(student -> student.getGender().equals("남자"))
                //.peek( student -> System.out.println((student.average())))
                //     .anyMatch(student ->student.average() >=80);
                .peek(System.out::println)
                .mapToDouble(Student::average)
                .anyMatch(average -> average >= 80);
        System.out.printf("남학생들 중에 평균이 80점 이상인 학생이 있습니까? %b", result);


        System.out.println();
        // 나이가 스무살 이상인 학생들이 모두 남자인지
       /* result = students.stream()
                .filter(student -> student.getAge() >= 20)
                .allMatch(student -> student.getGender().equals("남자"));

        System.out.println(result);
    */

       result =  students.stream()
                .distinct()
                .filter(s -> s.getAge() >=20)
                //.peek(System.out::println)
                .allMatch(s -> s.getGender().equals("남자"));

        System.out.printf("나이가 스무살 이상인 학생들이 모두 남자인가? %b", result);

    }
}

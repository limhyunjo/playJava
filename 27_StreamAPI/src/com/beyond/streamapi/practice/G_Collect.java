package com.beyond.streamapi.practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class G_Collect {

    /*
    * 수집
    *
    *  - 최종 처리 기능을 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
    *
    *
    * */

    // list , set, map으로 추출하기 
    public void method1(){

        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("이몽룡", 26, "남자", 70, 70),
                new Student("성춘향", 20, "여자", 100, 100)
        );
        
        // 성별이 남자인 학생들만 모아서 새로운 List 객체를 만들고
        // Student 타입의 객체를 List로 변환해서 return할 것임


        // 학생들의 이름만 List 컬렉션으로 추출
        List<String> names = students.stream()
                //.map(student ->student.getName())
                .map(Student::getName) // 이름을 가져와서 String 타입의 스트림으로 바꿈
                .collect(Collectors.toList());// 스트링 타입의 스트림을 리스트로 바꿔서 반환해줌

        System.out.println(names); // 데이터의 타입이 다른 새로운 리스트 생성됨
        System.out.println();

        //----------------------------------------------------
        // 남학생들만 List 컬렉션으로 추출 (filter)
        List<Student> list  = students.stream()
                .filter(student -> student.getGender().equals("남자"))
                  // .collect(Collectors.toList());
                .toList(); // 자바 16부터 추가된 메소드 ( toArray(), toList() 있음)
        list.forEach(System.out::println); // 남학생들만 list로 나옴

        System.out.println();


        //-------------------------------------------------

        // 성별이 여자인 학생들만 모아서 Set 컬렉션으로 추출한다
        Set<Student> set = students.stream()
                .filter(student -> student.getGender().equals("여자"))
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

        System.out.println();

        // ------------------------------------------------------

        // Map 컬렉션으로 수집 ( key : 이름, value : Student 객체 )
     /*   Map<String, Student> map = students.stream() // students를 stream으로 가져옴
                .collect(Collectors.toMap(s -> s.getName(), s -> s));
*/
        Map<String, Student> map = students.stream() // students를 stream으로 가져옴
                .collect(Collectors.toMap(Student::getName, Function.identity()));
        // 람다식을 2개 작성 (key, value)

        // System.out.println(map);

      /*  map.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " "+ entry.getValue());
        });*/

        map.forEach((key, value)-> System.out.println(key + " "+ value));

        System.out.println();

        // group으로 묶어서 list로 만들어줌
        Map<String, List<Student>> listMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        listMap.forEach((s, studentList)->{
            System.out.println(s);
            studentList.forEach(System.out::println);
            System.out.println();
        });
       // listMap.forEach((key, value) -> System.out.println(key + " "+ value));

    }
}

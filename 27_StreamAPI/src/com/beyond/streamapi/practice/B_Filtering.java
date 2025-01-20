package com.beyond.streamapi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_Filtering {
    
    
    /*
    * 필터링 관련 중간 처리 메소드
    * 
    * 필터링 : 중간 처리 기능으로 요소를 걸러내는 역할을 한다 
    * distinct() : 요소의 중복을 제거하는 메소드( .eqauls와 해시코드 재정의해야함 )
    * filter(Predicate) : 필터에 있는 요소를 다 한번씩 predicate하고 true인 애들만 통과해줌 
    * - filter 메소드는 매개값으로 predicate가 false를 리턴하는 요소를 제거한다
    * */
    
    // 중복 제거 테스트
    public void  method1(){
        //List<Student> students = new ArrayList<>();
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 70, 70)
        );

        Stream<Student> stream = students.stream();

       /* stream.forEach((Student name) ->{
            System.out.println(name);
        });
        */
        stream.forEach(System.out::println);
        System.out.println();

        //  이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 ㅇ벗다.
        // 다시 리스트로부터 스트림을 다시 얻어와야한다.
       // stream.distinct().forEach(System.out::println);
        
        // 스트림은 얻어와서 최종 처리 메소드까지 사용을 하면 다시 사용할 수 없고
        // 리스트로부터 다시 얻어와야 한다
        // 그래서 대부분 변수에 담지 않고
        // 리스트로부터 직접 얻어와서 최종 처리를 한다
        students.stream().distinct().forEach(System.out::println);
    }
    
    // 필터 메소드 테스트  
    public void method2(){

        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 50),
                new Student("이몽룡", 26, "남자", 70, 70)
        );

        // 성별이 여자인 학생만 출력
        // 리스트에서 바로 얻어서 사용
        // students.stream().forEach(System.out::println); // 5명의 학생이 출력됨

       /* students.stream()
                .distinct() // Stream을 리턴해주는 중간 처리 메소드(이어서 쓸 수 있음), 중복 제거 후 새로운 스트림을 만들어서 리턴
                .filter((Student s)-> {
                 return s.getGender().equals("여자"); // 성별이 여자인지 비교하고 true인 경우만 filter를 통과해서 새로운 스트림으로 만들어 리턴
                })  // Student 타입이나 그 부모 타입의 객체를 받아서 true, false 리턴
                .forEach(System.out::println);
*/

        // 위의 축약형
     /*   students.stream() // 스트림 파이프라인
                .distinct()
                .filter(student -> student.getGender().equals("여자"))
                .forEach(System.out::println);

        */

        // 수학 영어 점수가 둘다 60점 이상인 학생만 출력

        students.stream()
                .filter(student ->student.getMath()>=60 && student.getEnglish()>=60)
                .forEach(System.out::println);


    }
}

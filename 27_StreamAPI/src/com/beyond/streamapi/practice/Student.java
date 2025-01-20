package com.beyond.streamapi.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@EqualsAndHashCode //  중복 제거
//@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor // non null 붙은 필드들만 초기화 할 수 있는 생성자
public class Student implements Comparable<Student> { // alt + enter로 메서드 구현 (compare to 메서드 재정의해서 사용)
    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }

    @NonNull
    private String name;

    @NonNull
    private int age;
    //@Setter
    private String gender;
    private int math;
    private int english;


    // @Data 어노테이션 : getter, setter, toString, equals, hashcode까지 다 만들어줌 )


    // 객체 지향적인 코드
    public int getSum(){
        return math + english;
    }

    public int getAvg(){
        return getSum()/2;
    }


    public double average(){
        return math + english/ 2.0;
    }


}

package com.beyond.lambda.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
* lombok 다운
확장자가 .jar인 애들은 클래스 파일들이 압축되어 들어가 있음
프로젝트에서 접근할 수 있도록 해줘야 함
classpath에 직접 넣어야 함
intellij에서 ctrl + alt + shift + s
모듈 - 종속 요소- + jar 또는 디렉터리 + download에서 lombok.jar
적용
라이브러리에 lombok.jar가 보임
lombok에서 제공하는 어노테이션 사용 가능
*
* */

// anotation target이 type이면 class에 붙이는 것 field면  필드에 붙이는 어노테이션임 ( ctrl 키로 확인 가능)

// lombok 에서 제공하는 어노테이션
 @Data // 컴파일 시 getter, setter, toString 등등 만들어줌
// @EqualsAndHashCode
// @Getter
// @Setter
//@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 매개변수 생성자
@RequiredArgsConstructor // final이나 NonNull이 붙은 필드들만 생성자로 초기화
public class Student {

    //@RequiredArgsConstructor
    // final이나 @nonnull 어노테이션이 붙은 필드를 생성자로 만들어 초기화하는 어노테이션

   // private final String name; // 특정 필드에만 적용할 수 있음 / 전체에 다 적용하고 싶으면 클래스 위에 적용
   @NonNull
    private String name;

    @NonNull// Null 값을 허용하지 않는 어노테이션
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

}

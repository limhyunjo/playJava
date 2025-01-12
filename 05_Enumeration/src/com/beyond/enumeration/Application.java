package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {


        //상수값을 저장할 변수 생성
        Week today = null;      // null 값, 열거 상수 7개만 담아줄 수 있다
        //Week 도 데이터 타입이다( mon~sunday 까지만 담을 수 있는 데이터 타입)

        today = Week.MONDAY; // 열거 타입 변수에 열거 상수 대입
        // Monday에 해당하는 열거 참조 값이 today에 들어감

        //열거 상수들도 여러 메소드들을 가지고 있음

        //열거 상수 == 객체 (메소드 제공됨)

        // 열거 타입 상수는 객체 형태로 만들어지고
        // enum 이라는 추상 클래스를 상속 받아서 객체로 만들어진다


        System.out.println( today.name()); // MONDAY 출력됨
        // name()메소드는 상수의 이름을 문자열로 얻어와서 반환해준다


        //ordinal() 메소드는 전체 열거 상수 중 몇 번째 열거 상수인지 정숫값을 반환한다. (0부터 시작)
        System.out.println(today.ordinal()); //0

        //equals() 메소드는 매개값으로 전달되는 열거 상수와 동일한 열거 상수인지 확인 후 true 또는 false를 반환한다.
        System.out.println( today.equals(Week.FRIDAY)); //false

        //compareTo() 메소드는 매개값으로 주어진 열거 상수를 기준으로 전후로 몇 번째 위치하는 정숫값을 반환한다.
        System.out.println(today.compareTo(Week.SUNDAY)); //-6
        // MONDAY 뒤에 SUNDAY가 6번째에 있음

        
        // 열거 타입에서 기본적으로 제공하는 정적 메소드
        // 클래스를 new로 생성하지 않아도 사용 가능한 메소드 == 정적 메소드
        // 정적 메소드들은 생성 시 static을 붙여줌

        Week monday = Week.valueOf("MONDAY"); // alt +enter 지역 변수 삽입하면 자동으로 변수 만들어줌
        // 매개값으로 주어진 동일한 열거 상수를 찾아서 대입해줌

        Week[] values = Week.values(); //alt+enter 지역 변수
        // 모든 열거 상수를 담아서 만든 배열을 반환해줌

        System.out.println(Arrays.toString(values));
        //ctrl+alt+n 위에서 만든 변수를 대입해줌


        System.out.println(Arrays.toString(Week.values()));

        System.out.println();

        // 열거 타입에 속성 추가 후 확인
        System.out.println(today.getName()); // today에 담긴 값
        System.out.println(today.getShortName());
        System.out.println(today.getValue());



    }
}

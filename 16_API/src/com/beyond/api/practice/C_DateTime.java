package com.beyond.api.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C_DateTime {



    /*
    *  Date 클래스
    *  - 날짜와 시간을 표현하는 클래스이다.
    *  - 주로 객체 간에 날짜와 시간 정보를 주고 받을 때 사용한다.
    *
    * */
    public void method1(){

        // 현재 시스템의 날짜와 시간에 대한 정보를 가지고 객체를 생성한다.
        Date today = new Date();
        // shift + f6 ( 한번에 바꾸는 단축키)

        // 1970 년 1월1일 00시를 기준으로 밀리 세컨드 단위로 표기한다.
        // Date when = new Date(1000000000000L); // long 타입 기준

        // Date when = new Date(2025, 1,13); // @Deprecated
        Date when = new Date((2025-1900), (1-1), 13); // 이렇게 해야 제대로된 정보를 얻을 수 있음
        // 위의 객체를 통해 년, 월, 일 정보 빼오기

        System.out.println(today.getTime());
        System.out.println(today.getYear() + 1900);
        System.out.println(today.getMonth() + 1);
        System.out.println(today.getDate());
        System.out.println();

        System.out.println(today);
        System.out.println(when);


        // Date 객체 사용하지 않기

        // SimpleDateFormat으로 사요
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(today));






    }



    /*
     * java.time 패키지
     * - 1.8부터 날짜와 시간을 나타내는 java.time 패키지
     *
     * LocalDateTime
     *  - 날짜와 신간 정보를 모두 저장할 있는 객체를 생성하는 클래스
     *
     * LocalDate
     * - 날짜 정보를 저장할 수 있는 객체를 생성하는 클래스이다.
     *
     * LocalTime
     * - 시간 정보를 저장할 수 있는 객체를 생성하는 클래스이다.
     *
     * */

    public void method2(){

        // 시스템에 현재 날짜와 시간 정보를 저장한 객체를 생성한다.
        LocalDateTime now = LocalDateTime.now(); // private 접근제한자여서 클래스 안에서만 접근 가능
        //  표준 표기법에 따라 출력해줌
        System.out.println(now);

        // 매개값으로 주어진 날짜와 시간 정보를 저장한 객체를 생성할 수 있다.
        //LocalDateTime when = LocalDateTime.of(2025, 1,13,12,32,30);
        LocalDateTime when = LocalDateTime.parse("2025-03-10T16:32:00");
        System.out.println(ZonedDateTime.now());// 어떤 위치에서의 시간인지 알려줌
        System.out.println(); // 표기법을 맟추며  문자열도 가능



        // 날짜와 시간에 대한 정보 출력
        System.out.println(when.getYear());
        System.out.println(when.getMonth()); // Month enum 값을 돌려줌
        System.out.println(when.getDayOfMonth());
        System.out.println(when.getMonthValue());
        System.out.println(when.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println();

        // 날짜와 시간을 조작하는 메소드
        LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1);
        // 현재 날짜와 시간에서 더하는 메소드/ 메소드 체이닝
        // alt + enter로 지역 변수 삽입함
        LocalDateTime minusMonths = now.minusMonths(2);
        System.out.println(now);
        System.out.println(plusDays); // 원본을 바꾸는게 아니라 1일 차이의 새로운 객체가 만들어짐
        System.out.println(minusMonths);
        System.out.println();


        // 날짜와 시간을 비교하는 메서드
        System.out.println(now.isAfter(plusDays)); // plus가 now보다 이후여서 false
        System.out.println(now.isBefore(plusDays));
        System.out.println(now.isEqual(plusDays));
        System.out.println(now.isAfter(minusMonths));
        System.out.println(now.isBefore(minusMonths));
        System.out.println();


        // 되도록 Date() 클래스는 사용하지 말고 java.time 패키지의 메서드로 만들기
        // localDate, localTime 등으로 만들기
        
        // 날짜와 시간 정보 가져오기

        // 날짜 정보를 저장하는 객체
        //LocalDate today = LocalDate.now();
        //LocalDate today = LocalDate.of(2025, 1, 13);
        //LocalDate today = LocalDate.parse("2025-01-13");
        LocalDate today = now.toLocalDate();

        // 시간 정보를 저장하는 객체
        // LocalTime todayTime = LocalTime.now(); // 시간 정보만 가져옴
        // LocalTime todayTime = LocalTime.of(20, 30, 30); // 시간 정보를 가진 객체
        // LocalTime todayTime =LocalTime.parse("20:30:30");
        LocalTime todayTime = now.toLocalTime();

        System.out.println(today);
        System.out.println(todayTime);
        System.out.println();

        // DateTimeFormatter 클래스 사용
        DateTimeFormatter formatter = 
                DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");

        System.out.println(now);
        System.out.println(now.format(formatter)); // 날짜 데이터를 format에서 지정해준 형식대로 출력해줌
        System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE)); // 3번째 주 첫번째 1
        System.out.println(LocalDate.parse("2025-W04-3",DateTimeFormatter.ISO_WEEK_DATE)); // 원하는 포맷을 정해서 출력 가능
        // date 쓰지 말고 localdatetime 사용하기
        // format들이 ISO 상수로 정해져있음
    }
}

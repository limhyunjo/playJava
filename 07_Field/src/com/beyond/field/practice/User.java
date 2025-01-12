package com.beyond.field.practice;

public class User {

    // 필드 선언
    public String id = "hong123";



    protected String address; // 상속 관계 아니면 default와 비슷

    private String password;

    String name; // 접근 제한 없음


    // 메소드 선언
    public void test(int number) {// 매개 변수 받음
        
        // 지역 변수에는 접근 제한자를 붙이지 않는다
        
        // 매개 변수도 지역 변수에 속한다
        int num = 20; 
        // 지역 변수는 값이 대입되는 시점에 생성되기 때문에
        // 사용전에 초기화해야함
        
        // 메소드 소멸 시 지역 변수도 소멸
        // 매개변수도 지역 번호 메소드 영역에서 사용이 가능하다
        System.out.println(num);

        System.out.println(number);
        // 매개변수는 호출되기 전에 이미 사용자가 전달해준 값으로
        // 초기화되어있다

        // 매개 변수는 메소드 호출 시 반드시 값이 전달되어 오기 때문에 출력이 가능


        System.out.println(password);
        // this. 라는 키워드를 주면 필드 값을 가져옴
        // password가 없는 경우 메소드 안에서 지역 변수를
        // 우선적으로 사용
        // 필드는 클래스 전역에서 사용이 가능하다(생성자, 메소드)
        // 미 초기화 시 jvm이 기본값으로 초기화된다

        password ="123456789";

    }


    /*
    *  지역 변수에는 접근 제한자를 붙일 수 없음
    * 
    * */




}

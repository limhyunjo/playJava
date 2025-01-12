package com.beyond.constructor;

import com.beyond.constructor.practice.User;

public class Application {

    public static void main(String[] args) {

        User user; // User 타입에 객체의 주소값을 담을 수 있는 변수를 선언

        // 기본 생성자를 통해서 객체 생성
        user = new User();


        System.out.println(user.information());
        user.information(); // 값을 전달해주지 않아서 기본값인 null, null, null, 0, 0
        
        // 매개 변수가 있는 생성자로 객체 생성(3개의 값을 생성자로 전달)
        user = new User("hong123", "1234", "홍길동"); // 매개값 전달
        
        // 생성자 오버로딩 : 
        // 매개변수의 개수, 순서가 다르면 여러개의 생성자를 만들 수 있다

        System.out.println(user.information());
        user.information();


        // 매개 변수가 있는 생성자 객체 생성 5개의 값을 전달
        user = new User("hyun123", "0977","현", 20, 'W');

        System.out.println(user.information());
        System.out.println();
    }
}

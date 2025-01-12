package com.beyond.staticmember.practice;

public class A_StaticField {

    // 정적 필드
    // 정적필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 생성된다
    // class loader로 읽은 후 메모리에 적재되는 시점에 static이 붙은 정적 필드가 생성된다
    // 정적필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 생성되고 종료 시 소멸된다
    // 정적필드는 객체들이 공유하면서 사용할 목적으로 선언한다.
    public static int number=2;
    
    // class 파일을 메모리에 로드 A_staticField 클래스 파일을 읽어오고 
    // heap 영역에 생성된 인스턴스들이 동일한 number static 필드에 접근하여 값을 읽어옴
    // 정적 멤버는 클래스 영역에 클래스 로드 시 생성
    // 일반 멤버는 heap 영역에 new로 나중에 생성됨


    //---------------------------------

    private static String message = "Hello world";
    // private로 선언해서 외부에서 접근 안됨


    // 정적 필드에 대한 getter와 setter 메서드 또한 static 키워드가 붙어야한다
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        A_StaticField.message = message;
        // 정적 메소드에서는 this 사용할 수 없음
        // 객체가 존재하지 않은 상태라 this를 사용할 수 없음
    }
}

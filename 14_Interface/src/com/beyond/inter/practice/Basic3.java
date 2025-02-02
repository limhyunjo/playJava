package com.beyond.inter.practice;

public interface Basic3 extends Basic, Basic2 {

    // 클래스는 다중 상속이 불가능하지만
    // 인터페이스는 다중 상속 가능
    // 같은 추상 메소드가 있어도 하위 구현 클래스(인터페이스)가 상위 인터페이스를 다 재정의 해야하고
    // 구현 클래스에서 마지막으로 재정의하는 추상 메소드를 사용하기 때문에 중복되는 추상 메소드가 있어도 상관없음

    // 어떤 경우에 추상 클래스를 사용하고 어떤 경우에 인터페이스를 사용하는지 알아보기
    // 구현해야할 메소드들이 많은 경우 인터페이스



}

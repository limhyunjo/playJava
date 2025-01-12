package com.beyond.abstractclass.practice;

public class BasketBall extends Sports {

    public BasketBall(int numberOfPlayers) {
        // 부모의 기본 생성자가 없어서 아래 super() 주석하면 에러남
        super(numberOfPlayers);
        // BasketBall 클래스로 객체를 만들려면 이 생성자로만 만들어야 함

    }

    // 추상 메서드는 재정의하거나 사용하는 자식 클래스가 추상 클래스가 되면 사용가능
    //재정의한 rule메서드를 지우면 오류남
    @Override
    public void rule(){
        System.out.printf("BasketBall 선수의 수는 %d명, 공을 던져서 링에 넣어야 함 \n", numberOfPlayers);
    }
}

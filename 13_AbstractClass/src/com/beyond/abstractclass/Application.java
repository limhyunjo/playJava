package com.beyond.abstractclass;

import com.beyond.abstractclass.practice.BasketBall;
import com.beyond.abstractclass.practice.FootBall;
import com.beyond.abstractclass.practice.Sports;

public class Application {

    public static void main(String[] args) {


        // 추상 클래스는 미완성의 클래스여서 객체를 생성 못함
        // 참조 변수로는 사용 가능(다형성 적용 가능)
        // 추상 클래스는 객체로 못 만든다고 오류남
        // Sports sports = new Sports(5);


        // 추상 클래스는 참조 변수로 사용이 가능하다
        // 즉, 다형성을 적용해서 자식 객체를 참조할 수 있다.
        Sports basketBall = new BasketBall(5);
        Sports footBall = new FootBall(11);

        Sports[] sports = { // 다 sports 타입이어서 배열에 담김
                basketBall,
                footBall
        };
        
        for( Sports s : sports){
            
            printRule(s); // 실제 참조하는 곳의 재정의된 메서드가 나옴


        }

    }

    private static void printRule(Sports sports){
        sports.rule();
    }
}

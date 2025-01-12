package com.beyond.inter;

import com.beyond.inter.practice.Basic;
import com.beyond.inter.practice.Desktop;
import com.beyond.inter.practice.SmartPhone;
import com.beyond.inter.practice.Television;

public class Application {

    public static void main(String[] args) {

        // 인터페이스는 객체 생성이 불가능하다
        // 인터페이스를 구현하는 클래스를 통해서 객체를 생성해야 한다
        // Basic baisc = new Basic();


        // interface는 참조변수로 사용이 가능하다
        // 다형성을 적용해서 인터페이스를 구현하는 객체들을 참조할 수 있다.
        Basic basic = new Desktop(); //

        basic.turnOn();
        basic.turnOff();
        System.out.println();
        
        // 배열의 다형성
        Basic[] products = new Basic[4];
        products[0] = new Desktop();
        products[1] = new Desktop();
        products[2] = new SmartPhone();
        products[3] = new Television();



        for(Basic product : products){
            product.turnOn();
            product.turnOff();
        }

    }
}

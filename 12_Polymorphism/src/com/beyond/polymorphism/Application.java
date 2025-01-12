package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
import com.beyond.polymorphism.practice.Television;

public class Application {

    public static void main(String[] args) {


        //1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우
        // Product product = new Product(); // 추상 클래스는 객체로 만들 수 없음

        // product 참조 변수로 Product 클래스의 멤버만 접근 가능
        // product 타입이라 product의 멤버 변수(필드), 메서드만 접근 가능
        //System.out.println(product); // . 도트 연산자로 메서드 호출하려 하면 부모클래스의 메서드만 보임
        System.out.println();


        // 2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우
        Desktop desktop = new Desktop();

        // desktop 참조 변수로  Product, Desktop 클래스의 멤버에 접근 가능
        System.out.println(desktop);
        // 자식 클래스는 Product의 public 접근제한자인 멤버들을 상속받아 부모 메서드와 자신의 메서드 호출 가능
        System.out.println();


        // 3. 부모 타입의 참조 변수로 자식 객체를 다루는 경우
        Product television = /*(Product)가 생략되어있음*/new Television(); // 부모 타입에 자식 인스턴스를 대입해도 오류나지 않음
        // Product 타입과 Television 타입으로 타입이 다른데 대입이 됨
        // television이 product로 자동 형변환되어 대입됨
        // 업캐스팅 - 자식 타입의 객체가 부모 타입으로 형변환되어 대입됨
        System.out.println(television); // 부모 타입으로 형변환되었는데 자식 클래스의 inch도 출력됨
        //. 메소드로 호출하려하면 get,set inch 메서드가 보이지 않음
        // 실제 타입이 television이어도 참조하는 객체는 Product 객체임
        // product 타입(클래스)는 product 클래스에 있는 멤버만 접근 가능
        // 자식 클래스 멤버도 접근하고 싶으면 자식으로 다운캐스팅해야함

        // 부모 타입 / 참조변수(부모타입) = 실제 생긴 객체 ( 자식 클래스. 부모 메서드만 호출 가능 )
        // 예외로 재정의한 메서드는 자식 메서드가 호출됨
        // Product television =new Television();
        // product가 아닌 television의 toString이 출력된 것은 오버라이딩된 메서드가 우선 출력되기 때문
        // 참조 변수는 Product 부모 타입이지만 ( Product 타입 멤버만 접근 가능 ) 실제 메모리에 있는 객체는 television이라는 클래스가 만들어짐
        // 그럼 television 타입에서 재정의한 toString이 앞서있음
        // 부모의 toString을 재정의하여 가린 실제 객체 television 타입의 toString이 호출됨


        // 부모 타입의 참조변수 Product television을 자식 타입으로 강제 형변환 == 다운 캐스팅
        // 다시 television 클래스의 멤버에 접근하고 싶으면 형 변환을 해야 한다.
        System.out.println(((Television) television).getInch()); // 다운 캐스팅 후에 메서드 접근 가능 () 괄호로 먼저 수행하게 함
        // 기존 television 객체를 자식 타입으로 다운 캐스팅  자식 메서드 getinch 가져올 수 있음

        // 한 가지 타입의 참조변수에 여러 타입의 객체가 대입될 수 있음
        // 다양한 형태가 만들어질 수 있음 -> 다형성

        // ex) Product 타입에 television, desktop 등 여러개가 대입될 수 있고
        // 같은 코드에서 담긴 객체에 따라 결과가 달라질 수 있음


        // 4. 배열과 다형성
        // 1) 다형성을 적용하기 전
        Desktop[] desktops = new Desktop[2]; // desktop 타입의 객체를 2개 담을 수 있는 배열 생성

        desktops[0] = new Desktop();
        desktops[1] = new Desktop();

        SmartPhone[] smartPhones = /*new SmartPhone[]*/{ // 선언과 동시에 초기화하면 new 연산자 생략 가능
                new SmartPhone(),
                new SmartPhone()
        };
        // 다형성 적용 전에는 desktop, smartphone객체를 각각 저장할 배열을 생성해야함

        // 2) 다형성을 적용한 후
        Product[] products = new Product[]{ // Product 타입의 배열을 만들어 desktop, smartphone 타입의 객체를 생성 대입

                // 부모 타입이기 떄문에 자식 객체들을 담아서 관리 가능
                new Desktop(),
                new Desktop(),
                new SmartPhone(),
                new Television()
        };

   /*     for(int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
*/
        for (Product p : products) {
            System.out.println(p);

        // 각각의 자식 객체들의 멤버를 가져오고 싶은 경우 다운 캐스팅
        if (p instanceof Desktop) {

            System.out.println(((Desktop) p).isAllinOne());
        } else if (p instanceof SmartPhone) {
            System.out.println(((SmartPhone) p).getMobileAgency());
        } else if (p instanceof Television) {
            System.out.println(((Television) p).getInch());
        }
      }




        // 5. 매개변수의 다형성

        // main은 static 메서드
        // 일반 메서드는 호출 전 객체를 생성해야 함
        // static에서는 메서드를 호출할 수 없다
        // new로 객체 생성 훙에 호출 가능함


        productInfo(new Desktop());
        productInfo(new SmartPhone());
        productInfo(new Television());
        
        
        
    }

   
   /* public static void productInfo(Desktop desktop){ // 다형성 적용 안하면 static을 붙여야 됨
        System.out.println(desktop);
    }*/
    
    public static void productInfo(Product product) { 
        // 어떤 타입의 객체가 들어와도 product의 하위 객체이면 참조변수에 대입 가능
        System.out.println(product);
    }
}

package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {

        // Person타입의 인스턴스의 주소값이 person에 담김
        Person person = new Person(); // 참조변수에 생성자를 담음
        // 자료형 부분에 클래스 타입이 옴(클래스도 하나의 자료형, 데이터 타입임)

        // person 생성자를 호출해서 인스턴스 생성
        // person 타입의 참조변수에 담아둠
        
        /* person 생성자 호출 시 
          
          stack             heap                                  stack
        * 
        *                    person이 가진 필드만큼 생성          getName() // 다른 인스턴스들과 공유됨
                            (new 연산자로 생성 시 만들어짐)
        *                    값이 없으면 기본값으로 초기화함         getAge()

           person (200)                 (200)null , 0
            주소값을 참조

        * */


        // person.whoAreYou();
        // 이름 null, 나이 0이 기본값으로 출력됨

        // 메소드는 실행 코드 블럭
        // static 영역에 저장됨
        // setName() 메소드들은 필드에 간접 접근할 수 있도록 해줌

        person.setName("홍길동"); // person에 setName을 호출하면서 String 매개값을 전달해줌
        // setName은 매개값을 받기 위해 매개 변수를 만들어놓음 name
        // setName(String name) 으로 만들어진 곳에 "홍길동"이 대입
        // this.name this는 자기 자신으로 객체의 주소값이 담김
        // this라는 참조변수에 주소가 들어가 있음
        //System.out.println(person); - "홍길동"

        // this.name = name  매개 변수 name을 대입하겠다는 뜻

        person.setAge(24);

        person.setPhone("Samsung", "Galaxy", "Blue");
        // 타입과 개수에 맞춰서 매개값들을 전달해줘야 오류가 없다.

        person.whoAreYou();
        
        // Phone 클래스는 default라 Person 패키지에서는 사용 불가


        //(객체) 클래스는 캡슐화되어있음
        // 접근하기 위해서는 getter와 setter사용
        // get은 해당 필드의 속성을 외부에서 사용하기 위해 가져감 (값을 줌)
        // set은 값을 전달하여 변경

    }
}

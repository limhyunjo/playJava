package com.beyond.object.practice;


/*class 에서 사용 가능한 접근 제한자
* public 과 default 설정만 가능
* 
* public : public 으로 선언된 클래스들은 아무런 제약 없이 사용할 수 있다.
* 
* default : 동일한 패키지에서는 아무런 제약 없이 사용할 수 있지만 다른 패키지는 사용할 수 없다.
*  - default 는 아무런 제약 조건을 써주지 않으면 된다 
* */
public class Person {
    
    // 1. 필드(속성) 정의 (보통 맨 위에 만든다)
    private String name;
    private int age;

    private Phone phone = new Phone(); // 필드를 선언과 동시에 초기화
    // 필드에 저장될 인스턴스도 같이 만들어짐 
    // 같은 패키지 practice에 있어서 접근 가능
    // 접근 가능 메소드 생성했음
    
    // public 이라는 접근 제한자를 주면 instance를 만들었을 때 누구나 다 접근 가능 -> 보안에 좋지 않음
    // private는 클래스 내부에서만 접근 가능함


    // 2. 생성자 정의
    public Person() {
        System.out.println("생성자 호출");
    }

    // 생성자가 없으면 instance를 만들지 못함
    // 인스턴스를 생성할 때 호출됨



    // 3. 메소드 정의
    public String getName() {
        return name;
    }
    public void setName(String name) { // 값 변경 메소드
       this.name = name;
       // 매개 값을 필드에 대입해준다
        // 필드에 접근하기 위해 this 사용
        // void는 반환하는게 없다는 뜻
        // 간접적으로 접근하기 위해 필드에 메소드를 생성

    }

    public void setAge(int age) {
        this.age = (age>=0)?age : 0;
    }


      public void setPhone(String name, String brand, String color){
        phone.setBrand(brand);
        phone.setColor(color);
        phone.setName(name);
        // phone 클래스를 Person에서는 필드로 가짐
        // phone의 brand, color를 변경하기 위해 setPhone 메서드 생성
        // 간접 접근하기 위해 set 사용
    }

    public void whoAreYou(){
        System.out.printf("안녕하세요. 저는 %s 입니다. 나이는 %d세 입니다.\n", name, age);
        System.out.printf("저는 %s의 %s(%s)를 가지고 있습니다.\n",
                phone.getBrand(), phone.getName(), phone.getColor());
        // 값을 변경할 때는 setter , 값을 줄 때는 getter
    }// 객체 안에 또다른 객체를 갖게 함

    // 캡슐화 (객체 지향 특성 중 하나) : 객체에 직접 접근을 막고 getter와 setter로 접근 가능



}

package com.beyond.inherit.practice;

// Product를 상속받음
public class Desktop extends Product{


    // code, name, brand, price가 겹침
    // 여러 개의 상품이 있고 중복되는 code의 이름이 pcode로 바뀌는 경우
    // 전부 다 일일이 바꿔줘야 해서 불편 -> 상속(공통된 속성을 가질 클래스 생성)
    // 중복 제거, 생산성+ 유지보수성이 좋아짐

    private boolean allinOne; // 일체 여부


    public Desktop(){
        //super는 맨 첫 번째 줄에서만 사용 가능 아래서 사용되면 오류남
        // 부모 클래스 호출 생성 실행이 끝나고 나서 자식 클래스가 생성되는 것이라

        super(); // 생략 가능 (컴파일 과정에서 부모 클래스의 생성자를 자동 호출하도록 넣어줌)
        // super() : 부모 인스턴스에 접근, 주소 참조를 의미
        // 메서드가 아닌 생성자에서만 사용 가능
        System.out.println("자식 클래스의 기본 생성자 호출");
    }

    // 객체 초기화하는 매개 변수 생성자 -> 필드의 속성들로 객체가 생성됨
    public Desktop(String code, String name, String brand, int price, boolean allinOne){
        // 자식 클래스에서 부모 필드를 초기화할 수 있는 방법
        // 1) 부모의 생성자를 호출해서 초기화
        // super 생략하면 자동으로 super() - 부모의 기본 생성자 호출 -> 부모의 인스턴스(객체)가 만들어짐
        // super(code, name, brand, price); // 부모 클래스의 필드를 받아와서 초기화
        // 부모 생성자가 있어야 호출 가능(this와 같음)


        // 2) 부모의 Setter 메소드를 호출해서 초기화
        /*super();// 부모 인스턴스의 주소가 참조되어있음( 생략해도 됨 )
        this.setCode(code);
        setName(name);
        super.setBrand(brand);
        super.setPrice(price);*/
        // this는 Desktop이지만 부모 클래스인 Product로부터 상속받아서 Setter를 사용할 수 있다.
        
        
        // 3) 부모의 필드에 직접 접근해서 초기화(protected 접근 제한자 사용)
        // 부모의 필드는 private(자식에게 상속하지 않음/직접 접근이 안됨)
        this.code = code;
        this.name = name; 
        this.brand = brand;
        this.price = price;
        // protected 써도 super로 접근해도 됨

        this.allinOne = allinOne;
    }



    public boolean isAllinOne() {
        return allinOne;
    }

    public void setAllinOne(boolean allinOne) {
        this.allinOne = allinOne;
    }



    // ---------------------------------------------------------------


    // @어노테이션은 컴파일러에게 정보를 주는 것임
    // @Override // 생략해도 되지만 재정의된 것을 알리기 위해 @Override 어노테이션을 적어줌
    // 선언부가 완전히 동일해야 됨 (매개변수를 추가하거나 하면 오류남)
    // 매개변수를 주면 메서드 오버라이딩이 아닌 메서드 오버로딩(메서드가 하나 더 생김)이 됨
    /*public String information(){
        return String.format("code : %s, name : %s, brand : %s, price : %d, allinOne : %b \n",
                code, name, brand, price, allinOne);
    }*/

    @Override
    public String information(){
        return String.format("%s, allinOne : %b \n",
                super.information(), allinOne); // super로 부모 메서드 호출 가능
    }




}

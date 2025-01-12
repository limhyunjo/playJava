package com.beyond.object.practice;
// default : 접근 제한자 생략 시 default 적용됨
// 동일한 패키지에서 아무 제약 없이 사용 가능
 class Phone {

     // 필드 정의 (속성)
     private String name;
     private String color;
     private String brand;


     // 2. 생성자

    // select None하면 기본 생성자 만들어줌
    Phone() {
        // 접근제한자에 따라 생성자가 만들어짐 / default -> 생성자도 default로 만들어짐
        // public이면 생성자도 public
    }

    // ctrl 로 클릭해주면 전체 선택 가능( getter, setter 만들기)
    // getter : 필드의 값을 외부로 전달
    // boolean 타입은 is

    // 메소드 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

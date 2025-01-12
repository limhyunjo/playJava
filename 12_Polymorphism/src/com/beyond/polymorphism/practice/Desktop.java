package com.beyond.polymorphism.practice;

// Product를 상속받음
public class Desktop extends Product{


    private boolean allinOne; // 일체 여부


    public Desktop(){

    }

    // 객체 초기화하는 매개 변수 생성자 -> 필드의 속성들로 객체가 생성됨
    public Desktop(String code, String name, String brand, int price, boolean allinOne){

        this.code = code;
        this.name = name; 
        this.brand = brand;
        this.price = price;
        this.allinOne = allinOne;
    }



    public boolean isAllinOne() {
        return allinOne;
    }

    public void setAllinOne(boolean allinOne) {
        this.allinOne = allinOne;
    }


    @Override
    public String toString() {
        return "Desktop{" +
                "allinOne=" + allinOne +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}

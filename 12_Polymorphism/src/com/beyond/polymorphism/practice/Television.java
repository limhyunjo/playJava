package com.beyond.polymorphism.practice;

public class Television extends Product{

    /* private String code; // 상품코드
    private String name; // 상품 이름
    private String brand; // 상품 브랜드
    private int price; // 상품 가격*/
    private int inch; // 상품 인치 정보


    public Television() {
    }

    public Television(String name, String code, String brand, int price, int inch) {
        // 부모의 것을 상속받아서 그대로 사용 (부모의 기본 인스턴스 호출해서 사용)

        // this.name = name; -> 이 경우는 부모의 필드에 직접 접근한 것임
        
        this.setName(name);
        this.setCode(code);
        this.setBrand(brand);
        this.setPrice(price); // 부모의 기본 생성자와 Setter를 물려받아 사용
        this.inch = inch;
    }



    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Television{" +
                "inch=" + inch +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

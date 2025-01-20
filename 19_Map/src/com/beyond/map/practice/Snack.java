package com.beyond.map.practice;

public class Snack {

    private String name;
    private String flavor;
    private int calories;


    // 필드 초기화 매개변수가 있는 생성자
    public Snack(String name, String flavor, int calories) {
        this.name = name;
        this.flavor = flavor;
        this.calories = calories;
    }


    // 가진 필드값 출력할 수 있는 toString
    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", calories=" + calories +
                '}';
    }
}

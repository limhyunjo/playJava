package com.beyond.assiststream.practice;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {


    @Serial
    private static final long serialVersionUID =  -4996775473190754474L;
    // 직렬화하는 클래스랑 역직렬하는 클래스가 같다는 것을 알려줌
    // 생략해도 됨 but 값이 바뀜

    //transient 직렬화를 막아줌 ( 저장된 객체를 얻어올 때는 password와 point 정보가 보이지 않음

    private String id;
    private transient String password;
    private String name;
    private int age;
    private char gender;
    private transient double point;


    //필드를 초기화할 수 있는 매개변수 생성자
    public Member(String id, String password, String name, int age, char gender, double point) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }


}


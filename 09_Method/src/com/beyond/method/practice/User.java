package com.beyond.method.practice;

public class User {

    private String id;
    private String password;
    private String name;


    public User() {
    }

    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }


    // SETTER만 만들기


    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 한번에 출력할 메서드
    public String information(){
        return String.format("%s, %s, %s\n", id, password, name);
    }
}

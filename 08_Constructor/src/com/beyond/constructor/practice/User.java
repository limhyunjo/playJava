package com.beyond.constructor.practice;

public class User {

    // 필드 선언
    private String id;

    private String password;

    private String name;

    private int age;

    private char gender;

    // -----------------------------------------
    // 생성자가 없으면 기본으로 아무 내용 없는 기본 생성자가 out에서 만들어짐 (컴파일 이후인 out폴더에서 확인 가능)


    //생성자 선언
    
    
    public User(){
        // 기본 생성자는 객체 생성만을 목적으로 한다
    }
    // 매개 변수가 있는 생성자(아이디, 패스워드, 이름)
    // 객체 생성과 동시에 전달된 값들을 매개변수로 받아서 필드를 초기화하는 목적으로 사용한다
    public User( String id, String password, String name){
        // 생성자 추가하면서 기본 생성자가 사라짐
        // 다시 명시적으로 기본 생성자 만들어야 함
        //필드 이름이랑 매개 변수, 지역변수 이름이 같으면 지역변수가 우선시 됨
        this.id = id; // 매개값으로 받은 id의 값을 id라는 필드에 대입할 수 있도록 함
        this.password = password;
        this.name = name;
        // 초기화하지 않은 나머지 필드는
        // jvm이 초기값을 설정해준다
    }
    
    // User() {}  default로 생성자 만들면 동일 패키지에서만 접근 가능해서 현재는 오류남
    
    // 생성자를 private로 선언하면 외부에서 절대로 객체를 생성할 수 없다
    // 클래스 내부에서만 생성자르 호출해서 객체를 생성할 수 있다



    // 매개변수가 있는 생성자(아이디, 패스워드, 이름, 나이, 성별
    public User(String id, String password, String name, int age, char gender){
       
       // 위의 3개까지 생성자 호출
        this(id,password,name); // 생성자 안에서만 다른 생성자 호출 가능
     /*   this.password = password;
        this.name = name;*/
        this.age = age;      
        this.gender = gender;
    }




    
    // 메소드 선언
    public String information(){
        System.out.printf( "%s,%s, %s, %d, %c \n",
                this.id, this.password, this.name, this.age, this.gender);
         //this(id,password,name);
        // 중복되는 지역변수가 없어서 this를 굳이 안써도 됨
        // 메소드 내부에서는 this() 를 사용해서 생성자를 호출할 수 없다


        return String.format("%s,%s, %s, %d, %c \n",
                this.id, this.password, this.name, this.age, this.gender);
        // format 메서드는 값이 들어갈 형식을 만들어서 return
    }
}

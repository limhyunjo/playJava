package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class H_MethodReference {

    // 메소드 참조

    /*
    * 메소드 참조
    *  - 자바 8부터 도입되어 기존 메소드나 생성자를 참조해서 함수적 인터페이스의 구현 객체를 생성한다. (람다식보다 간결하고 가독성 있음
    *  - 람다식에서 불필요한 매개변수를 제거하는 것이 메소드 참조의 목적이다.
    * */
    public void method1(){

        // 정적 메소드 참조

       /* IntBinaryOperator binaryOperator = (int a, int b) ->{

            //return a>b? a:b;
            return Math.max(a,b); // 위에서 직접 쓴 코드가 메서드로 만들어져 있음
        };*/

        // IntBinaryOperator binaryOperator = ( a,  b) -> Math.max(a,b);

        IntBinaryOperator binaryOperator = Math::max; // 메소드 참조해서 리턴하는 구현 객체를 만든다는 뜻
        // 메소드가 매개값이 두개면 개수에 맞는 매개값을 받은 함수적 인터페이스를 사용해야 한다

        // 클래스 이름 뒤에 :: 붙이고 정적 메소드 이름을 기술하면 된다
        System.out.println(binaryOperator.applyAsInt(10, 20));


        // 객체의 메소드 참조
        // - 참조 변수 뒤에 :: 붙이고 메소드 이름을 기술하면 된다.
        /*Consumer<String> consumer = (String str) ->{
            System.out.println(str);
        };*/

        // out 객체는 표준 출력과 관련된 outputstream

        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello World!!");



        // 매개변수의 메소드 참조
        // 매개변수의 클래스 이름 뒤에 :: 붙이고 메소드 이름을 기술하면 된다.
       // function - Student를 String으로 타입 변환
       // Function<Student, String> function;

       // Function<Student, String> function = (Student student) -> student.getName();


        Function<Student, String> function = Student::getName; // student의 getName 메소드를 불러서 참조변수의 값을 넘겨줄 것임

        System.out.println(function.apply(new Student("임꺽정", 20)));



        //-----------------------------------------------------------------

        // 생성자 참조
        // - 클래스 이름 뒤에 :: 붙이고 new 연산자를 기술하면 된다.

       /* Supplier<Student> supplier =() ->{
            
            return new Student(); // 생성자를 호출해서 student 객체를 돌려줌
        } ;*/
        
        // Supplier<Student> supplier = () -> new Student();
        Supplier<Student> supplier = Student :: new; // 생성자로 객체를 만들려면 반드시 매개변수가 없는 생성자가 있어야 한다

        System.out.println(supplier.get());
        




    }


}

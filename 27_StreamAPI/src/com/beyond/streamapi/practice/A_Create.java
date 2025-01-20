package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {

    /*
    *  스트림의 종류
    *
    *  - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다
    *  - Stream<T>, IntStream, LongStream, DoubleStream
    *
    *
    * */

    // 숫자 범위로 스트림을 생성하는 방법
    public void method1(){
        int sum = 0;
        IntStream stream = null;
        // 숫자 스트림들은 테스트 용도로 많이 씀 대부분은 숫자가 아니라 객체로 받아옴

        // 첫 번쨰 매개값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        //stream = IntStream.range(0, 10); //1~9 -> 45

        // 첫 번쨰 매개값 ~ 두 번째 매개값까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        // 인터페이스 insStream의 구현 객체를 넘겨줘서 stream 변수에 담는다
        stream = IntStream.rangeClosed(0, 10); // 1~10 -> 55


        // 1~9 까지의 요소들을 for문을 써서 누적하지 않고 스트림 사용(메소드 호출해서 사용)
       // sum = stream.peek((int value)-> {System.out.println(value)}).sum(); // sum() 최종 처리 메서드
       // sum = stream.peek(value-> System.out.println(value)).sum();  // 위의 축약형
        // 내부에서 처리할 코드만 람다식으로 전달해줌
        sum = stream.peek(System.out::println).sum();

        System.out.printf("sum %d\n",sum);
        System.out.println();

    }

    // 배열로부터 스트림을 생성하는 방법
    public void method2(){

        String[]names ={"홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향"};
        // 기존의 for문을 사용해서 요소 출력
     for(String name : names){
         System.out.print(name + " ");
     }
        System.out.println();


     // 스트림을 사용해서 출력
        Stream<String> stream = Arrays.stream(names);
        //Stream<String> stream = Arrays.<String>stream(names);
        //stream<String> stream = Stream.of(names); //stream 클래스의 of라는 요소로도 가져올 수 있음
        // Stream<String> stream = Stream.of("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");


        // 타입 파라미터를 정해줘야 T 타입이 결정됨(원래는 넘겨줄 때 타입 파라미터를 줘야하지만 생략해도 유추해서 만들어줌)
        //stream.forEach(str-> System.out.print(str+" ")); // 반복해서 수행할 코드만 람다식으로 전달
        //stream.distinct().forEach(str-> System.out.print(str+" ")); // 중복 제거
        stream.parallel().forEach(str-> System.out.print(str+" ")); // parallel() :
        //void forEach(Consumer<? super T> action); // 넘겨줄 때 타입이 String으로 결정됨
        // String 타입의 Consumer 만들기
        // distinct() 중복 제거
        System.out.println();





    }
    // 컬렉션으로부터 스트림을 생성하는 방법
    public void method3(){

        List<String> names = Arrays.<String>asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");// List에 담아서 반환해줌
        //매개값으로 값의 목록을 가지는 리스트를 만들어서 반환해줌

        // for문을 사용해서 출력
        for( int i = 0 ; i< names.size(); i++){
            System.out.print(names.get(i)+ " ");
        }
        System.out.println();

        // Stream을 사용하여 출력
         // list나 set은 stream으로 얻어올 수 있지만  map은 얻어올 수 없다
        Stream<String> stream = names.parallelStream(); // 병렬처리 스트림
        
     /*   stream.forEach((String name) ->{
            System.out.print(name + " ");
        });
*/
       // stream.forEach((name) -> System.out.print(name + " "));
        stream.forEach(System.out::println);

        System.out.println();
        
    }


}

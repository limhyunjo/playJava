package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class F_Aggregate {


    /*
    * 기본 집계
    * - 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다
    * - count()
    * - sum()
    * - average()
    * - max()
    * - min()
    * - findFirst()
    *
    * 커스텀 집계
    * - 기본 집계 이외의 다양한 집계 결과물을 산출하는 역할을 한다
    * - reduce()
    *
    * */

    // Optional 클래스
    // OptionalDouble,Int,Long
    // 스트림의 최종 결과값을 저장하는 객체이다.
    // 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우
    // 기본 값을 설정할 수 있는 객체이다.



    public void method1() {


        int[] numbers = {1, 2, 3, 4, 5, 6};
        //int[] numbers = {1,3,5};


        long count = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .count();
        //.forEach(number -> System.out.print(number + " "));


        System.out.printf("2의 배수의 개수 : %d\n", count);


        int sum = Arrays.stream(numbers).filter(number -> number % 2 == 0).sum();
        System.out.printf("2의 배수의 합 : %d\n", sum);


        OptionalDouble optionalDouble = Arrays.stream(numbers).filter(number -> number % 2 == 0).average();
        // 어떤 수를 0으로 나누면 오류가 난다
        // 조건이 만족하지 않는 경우 0이 나오는데 0/0이 되는 경우 오류가 난다
        // 연산 시 오류가 발생할 수 있는 메서드들은 Optional을 붙여서 더 안전하게 값이 있는지 검사하고 연산한다
        // 값을 꺼내오기 전에 값의 존재 여부 true, false로 확인

        // isPresent 가 true인 경우 연산을 함

        // 1. get() 메소드는 Optional 객체에 저장된 값을 가져온다.
        // System.out.printf("2의 배수의 평균 : %1.f\n", optionalDouble.getAsDouble());
        // isFalse 면 예외를 던진다.

        // isPresent를 보고 값이 없으면 꺼내오지 않는 경우
        // isPresent() 메소드는 값의 존재 여부를 확인할 수 있다

        // 2.
        /* if(optionalDouble.isPresent()){

            System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.getAsDouble());

        }else{
            System.out.println("2의 배수의 평균 : 0");
        }*/


        // 3. 값을 처리할 수 있는 consumer를 등록하는 방법

        // ifPresent() 메소드는 집계 값을 처리한는 Consumer를 등록한다.(단, 값이 존재해야 실행된다.)
        // optionalDouble.ifPresent(value -> System.out.printf("2의 배수의 평균 : %.1f\n",value));
        // 조건을 만족하지 않는 경우 연산 결과가 나오지 않는다(값이 없으면 실행이 안됨)

        // optionalDouble.ifPresent(System.out::println);


        // 4. orElse()메소드는 get()메소드와 도일하게 저장되어 있는 값을 얻어오는 메소드이다.
        // 단, 값이 저장되어 있지 않을 경우 리턴받을 디폴트 값을 지정할 수 있다.
        // 값이 없으면 자신이 기본적으로 지정한 값을 리턴해준다
        System.out.printf("2의 배수의 평균 : %.1f\n", optionalDouble.orElse(0.0)); // 제일 간단함


        // OptionalInt optionalInt = Arrays.stream(numbers).filter(number -> number % 2 == 0).min();
        // 값이 없는데 가장 작은 값을 줄 수 없으니 optional

        // System.out.printf("2의 배수의 최솟값 : %d\n", optionalInt.orElse(0));

        // OptionalInt optionalInt = Arrays.stream(numbers).filter(number -> number % 2 == 0).max();
        // System.out.printf("2의 배수의 최댓값 : %d\n", optionalInt.orElse(0));


        OptionalInt optionalInt = Arrays.stream(numbers).filter(number -> number % 2 == 0).findFirst(); // 요소중애 첫 번째 요소만 가져옴
        // OptionalInt optionalInt = Arrays.stream(numbers).filter(number -> number % 2 == 0).findAny(); // (요소 중에 아무 요소나 가져옴)
        System.out.printf("2의 배수의 첫번째 요소의 값 : %d\n", optionalInt.orElse(0));


        // 2의 배수의 곲
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .reduce((left, right) -> left * right)
                // left에는 첫 번째 값, right에는 두번째값 2* 4 = 8 , 8*6 =48 -> 누적으로 곱함
                .ifPresent(value -> System.out.printf("2의 배수의 곱 : %d\n", value));



        int result = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .reduce( 1, (left, right) -> left * right);

        // identity 값은 optional이 아니라 result값을 준다
        
        // 조건 없는 배열에서는 identity를 반환한다
        System.out.println(result);


        // 집계보다는 수집 부분을 더 많이 씀
        
    }
}

package com.beyond.method.practice;

public class B_Overloading {

    public void test(){

        // println은 메소드 오버로딩의 대표적인 예시이다
        System.out.println();
    }

    // 메소드 이름이 중복되면 호출 시 알 수 없어서 오류
    public void test(int a){
     // 이름이 같아도 매개값이 달라서 오류나지 않음
    }

    public void test(String a, int b){}

    public void test(int b, String a){}
    // 매개변수의 개수와 타입이 같아도 순서가 다르면 메소드 오버로딩이 됨


   /* public void test(int c, int d){}
    public void test(int b, int s){}*/
    // 매개 변수의 이름만 다르다고 오버로딩이 성립되지는 않는다
    // 매개변수의 개수, 타입과 순서가 같아서 오류남


   /* public void test(int b, int a){}
    private void test(int b, int a){}*/
    // 접근제한자를 바꿔도 오류난다
    // 접근 제한자가 다르다고 해서 오버로딩이 적용되지는 않는다


   /* public void test(int a, int b){}
    public int test(int a, int b){}*/
    // 반환형이 다르다고 오버로딩이 적용되지는 않는다

}

package com.beyond.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A_Array {


    // 배열의 선언 및 생성, 초기화 (new 연산자 사용)
    public void method1() {
        // 1) 배열의 선언 및 생성
        int[] iArray1 = new int[5];
        int iArray2[];
        // new 는 생성하면 바로 heap영역에 저장되는데 값을 넣어주지 않으면
        // jvm이 기본값으로 초기화해서 넣어줌

        // 배열은 생성과 동시에 초기화해주면 값의 목록을 줄 수 있음
        // 배열 변수 선언 후에는 값의 목록을 넣을 수 없음


        iArray2 = new int[10];

        // 2) 배열 변수와 인덱스를 이용한 초기화
        iArray1[0] = 2;
        iArray1[1] = 4;
        iArray1[2] = 6;
        iArray1[3] = 8;
        iArray1[4] = 10;
        // iArray1[5] = 12; // ArrayIndexOutOfBoundsException

        // 3) 배열 변수와 인덱스를 이용한 출력
        System.out.println(iArray1[0]);
        System.out.println(iArray1[1]);
        System.out.println(iArray1[2]);
        System.out.println(iArray1[3]);
        System.out.println(iArray1[4]);
        // System.out.println(iArray1[5]); // ArrayIndexOutOfBoundsException
        System.out.println();

        // 4) 반복문을 이용한 출력
        // 배열변수.length를 통해서 배열의 길이를 알 수 있다.
//        for (int i = 0; i < iArray1.length; i++) {
//            System.out.println(iArray1[i]);
//        }

        for (int value : iArray1) {
            System.out.println(value);


            // 5) Arrays 클래스의 toString () 메소드를 이용한 출력
            System.out.println(Arrays.toString(iArray1));


        }





    }



    // 배열의 선언 및 생성, 초기화 (값의 목록 사용)
    public void method2() {

        int[] iArray = new int[]{1,2,3,4,5}; // heap영역에 0으로 초기화해서 만들어줌
        double[]dArray = {1.1,2.2,3.3};
        // 선언과 동시에 초기화 시 배열 크기는 지정하지 않는다
        // 값의 목록을 보고 자료형과 크기를 유추하기 때문에

        System.out.println(iArray.length);
        System.out.println(Arrays.toString(iArray)); // 지정한 값으로 생성되었는지 확인
        System.out.println();


        System.out.println(dArray.length);
        System.out.println(Arrays.toString(dArray));
        System.out.println();


        // dArray = {.....};
        // 위에서 선언한 배열에 다시 값의 목록을 줄 수 없다
        // new 연산자와 데이터 유형을 다시 주면 생성 가능
        dArray = new double[]{5.5,6.6,7.7,8.8}; // 기존의 배열은 참조되지 않고 나중에 garbage collector가 정리해줌
        // 위는 가능
        System.out.println(dArray.length);



        // 배열의 변수는 stack 영역에 생성된다(참조변수)
        //new 자료형[배열 크기] 구문을 실행하면 heap영역에 배열을 생성하고 배열의 주소를 반환한다
        //new 자료형[배열크기] 구문으로 배열을 생성하면 자동으로 기본값으로 초기화한다
        // String 배열은 초기값이 null -> nullpointexception 주의





    }

    // 문자열 배열
    // 사용자로부터 과일 이름을 입력받아서 배열에 저장
    public void method3(){

        String[] fruits = new String[3];
        Scanner sc = new Scanner(System.in);

        //System.out.println(Arrays.toString(fruits));
        // null로 초기화됨

        for( int i = 0; i<fruits.length; i++){

            System.out.print("과일 입력>");

            fruits[i] = sc.next();
        }
        System.out.println(Arrays.toString(fruits));

        // 문자열도 heap 영역에 저장한다
        // 과일 이름이 heap영역에 주소를 가지고 저장되면
        // 배열은 String 타입의 주소를 저장하는 참조 변수 
        // null은 아무것도 참조하지 않음
        // 배열의 각각 요소들에 문자를 직접 저장하는게 아니라 주소를 참조한다


    }

    // 배열 정렬
    public void method4(){

        int[] iArray = {2,7,5,1, 3};
        String[] sArray = {"메론","orange", "Apple", "banana", "apple", "레몬", "apeach"};

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();


        // 배열을 오름차순으로 정렬
        // 사전 순(유니코드 값이 작은 값부터)
        Arrays.sort(iArray); // 배열 정렬 sort는 데이터 유형 길이에 따라 알맞게 정렬을 해준다
        Arrays.sort(sArray);

        System.out.println(Arrays.toString(iArray));
        System.out.println(Arrays.toString(sArray));
        System.out.println();
        
        // 기본 오름차순으로 정렬하는 sort
        // 내림차순으로 정렬하기
        // 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새 배열에 대입
        int[] copy = new int[iArray.length]; //iArray의 길이를 가져옴

        for(int i = 0; i<iArray.length; i++){
            copy[4-i] = iArray[i];
        }

        System.out.println(Arrays.toString(copy));
        System.out.println();
        
        // Arrays.sort() 메소드에 Collections.reverseOrder()를 전달한다
        Arrays.sort(sArray, Collections.reverseOrder());// 기본 배열을 내림차순으로 정렬해준다
        
        // Arrays.sort(); : 오름차순으로 정렬
        // Arrays.sort( 배열 , Collections.reverseOrder()); : 내림차순으로 정렬



    }



    /*
     * 실습 문제 1
     * 사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고
     * 생성된 배열의 크기만큼 반복문을 실행하여 랜덤값을(1 ~ 100) 배열의 저장하고 출력한다.
     *
     * 예시)
     * 정수값을 입력해 주세요. > 3
     *
     * numbers[0] : 77
     * numbers[1] : 88
     * numbers[2] : 6
     */

    public void practice1() {

        int len  = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요>");
        len = sc.nextInt();
        int[] random = new int[len];

        for(int i = 0; i<len; i++){

            random[i] = (int)(Math.random()*100)+1;
            System.out.printf("random[%d] = %d\n", 0, random[i]);
        }

        //System.out.println(Arrays.toString(random));

    }

    /*
     * 실습 문제 2
     *
     * 사용자에게 3명의 키를 입력받아 배열에 저장하고
     * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
     *
     * 예시)
     * 키 입력 > 180.0
     * 키 입력 > 177.3
     * 키 입력 > 168.2
     *
     * 총합 : 525.5
     * 평균 : 175.2
     */

    public void practice2() {


      /*  double height = 0;
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for(int i = 0; i< 3; i++){

            System.out.print("키를 입력하세요");
            height = sc.nextDouble();
            sum += height;
        }
        System.out.println("키의 총합 :" + sum);
        System.out.println("키의 평균 :" + sum/3);*/

        //------------------------------------------------------

        //강사님 풀이


        double sum = 0.0;
        double avg = 0.0;
        double[] heights = new double[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < heights.length; i++) {
            System.out.print("키 입력 > ");

            heights[i] = scanner.nextDouble();
        }

        for (double height : heights) {
            sum += height;
        }

        avg = sum / heights.length;

        System.out.println();
        System.out.printf("총합 : %.1f\n", sum);
        System.out.printf("평균 : %.1f\n", avg);

    }


}

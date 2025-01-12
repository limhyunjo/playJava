package com.beyond.array.practice;

import java.util.Arrays;

public class B_TwoDimensionalArray {


    // 2차원 배열의 선언 및 생성, 초기화 (new 연산자 사용)
    public void method1() {


        int[][] iArray; // 선언 (메소드에서 지역변수로 만들면 stack 영역에 iArray 생성
        // 초기화가 되어야 실제 메모리 공간 heap 영역에 생성됨

        // int iArray [][]; 이것도 오류는 안 나지만 자료형 뒤에 []을 써주는게 좋음 
        // int[] iArray[] 도 가능하지만 가독성에 안 좋음


        // 2차원 배열의 선언 및 생성
        iArray = new int[3][5];
        // 행 번호가 3래 열 번호가 5개

        // 2차원 배열의 초기화

        iArray[0][0] = 1;
        iArray[0][1] = 2;
        iArray[0][2] = 3;
        iArray[2][2] = 13;



       int value =1;
        for(int i =0; i<3 ; i++){
            for(int j =0; j<5; j++) {
                iArray[i][j] = value++;
            }
        }




        // 2차원 배열의 값을 출력
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) { // 1차원 배열의 길이를 가져옴


                System.out.printf("%4d", iArray[i][j]);
            }

            System.out.println();
        }


        // 이차원 배열이 heap영역에 생성 시 1차원 배열들을 참조하는 2차원 배열이 생성되고
        // stack 영역에 변수가 2차원 배열을 참조한다
        // 2차원 배열은 배열의 요소로 배열을 가진다

        /*
        *   stack                   heap
        *
        * 1000                   1000         100
        * iArray       ->           0(100) -> [0,0,0,0]
        *                           1(200) -> [0,0,0,0]
        *                                       200
        * */

        // iArray.length ->2  (행 번호)
        // iArray[0].length ->4 (열 번호)
        // iArray[1].length ->4

    }


    // 2차원 배열의 선언 및 생성, 초기화 (값의 목록 사용)
    public void method2() {

       // String 2차원 배열 생성
       //String[][] sArray = new String[][]{{"Linux", "MariaDB"}, {"Git", "Java"}};
      /* String[][] sArray = {
               {"Linux", "MariaDB"},
               {"Git", "Java"},
               {"HTML", "CSS", "JavaScript"}
       };
    */
       // 값의 목록을 보고 어떤 크기의 배열을 만들지 유추가 가능해서 크기 지정해주지 않는다

        // toString은 2차원 배열의 요소 값을 가져올 수 없다.

        String[][] sArray = new String[3][];
        // 1차원 배열만 만들어서 넘겨줘도 됨
         sArray[0] = new String[] {"Linux", "MariaDB"}; // 선언 후 나중에 초기화(new 연산자 필요)
         sArray[1] = new String[]{"Git", "Java"};
         sArray[2] = new String[]{"HTML", "CSS", "JavaScript"};

        for(int i =0; i<sArray.length; i++){    
            // 배열의 길이를 가져와서 만드는 거라 배열의 개수를 다르게 할 수 있음
            // 가변 배열
            for(int j =0; j<sArray[i].length; j++){
                System.out.printf("%4s \t", sArray[i][j]);
            }
            System.out.println();
        }




        /*
        * String[][] sArray = new String[][]{
        *           {"딸기","포도"},
        *           {"사과","오렌지"}
        *      };
        *
        *
        *  위의 배열 생성 시 stack과 heap영역에 생성되는 형태
        *
        *
        *   stack                                    heap
        *                                                       (100)// 1차원 배열의 주소
        *     300                                    0(100)  -> 딸기 문자열을 참조, 포도..
        *     sArray                                          // 여기도 문자열을 참조한다
        *
        *                                            1(200)   -> 사과 문자열을 참조 ...
        *                                                        (200)
        *
        *                                            300(2차원 배열의 주소)
        * */



    }


    /*
     * 실습 문제 1
     *
     * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
     *
     * 예시)
     * 1 8 9
     * 8 3 3
     * 4 1 7
     */
        public void practice1() {

            int[][] iArray = new int[3][3];
            int random = 0;

            for(int i =0 ; i<3 ; i++) {
                for (int x = 0; x < 3; x++) {

                    random = (int) (Math.random() * 10) + 1;

                    iArray[i][x] = random;
                    System.out.printf("%3d", iArray[i][x]);
                }

                System.out.println();

            }

/*
            int[][] array = new int[3][3];

            // 랜덤값을 2차원 배열에 대입
            for(int i =0 ; i< array.length ; i++) { // 행 반복
                for (int x = 0; x < array[i].length; x++) { // 열 반복

                    array[i][x] = (int)(Math.random()*10+1);
                    // 랜덤 값을 2차원 배열에 대입

                }
            }

            // 2차원 배열 출력

            for(int i =0; i<array.length; i++) {
                for(int x =0; x<array[i].length; x++) {
                    System.out.printf("%2d", array[i][x]);
                }
                System.out.println(); // 이걸 해야지 행이 나눠짐
            }*/

        }




        /*
         * 실습 문제 2
         *
         * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
         * 단, 랜덤 값에 중복을 제거해서 대입하시오.
         *
         * 예시)
         * 1 8 9
         * 6 4 5
         * 2 1 3
         */
        public void practice2() {
            int[] array = new int[9];
            // 중복 제거된 랜덤값 1차원 배열에 저장

            int index = 0;


            for(int i =0 ; i<array.length ; i++) {
              array[i] = (int)(Math.random()*10+1);
              // 배열에 랜덤 값을 넣어줌

               // 중복 제거 (기존의 수와 새로운 랜덤 값을 비교해서 같으면 넘어감)
               for(int j=0; j<i; j++) {
                   if(array[i] == array[j]){
                       i--;

                       break; // 중복값이 들어간 i번째 값을 줄여서 다시 입력받게 함
                   }
               }
            }

            //System.out.println(Arrays.toString(array));

            // 2차원 배열에 랜덤값을 대입
            int[][] newArray = new int[3][3];// 2차원 배열 생성

            for(int i =0 ; i<newArray.length ; i++) {

                for (int x = 0; x < newArray[i].length; x++) {

                    newArray[i][x] =array[index++]; // 1차원 배열을 2차원 배열에 하나씩 대입
                }
            }

            for(int i =0 ; i<newArray.length ; i++) {

                for (int x = 0; x < newArray[i].length; x++) {

                    System.out.printf("%3d", newArray[i][x]);
                }

                System.out.println();
            }


        }

}

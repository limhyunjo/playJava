package com.beyond.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A_HashMap {


    public void method1(){

        
        // hashmap에서 제공하는 메서드 활용
         Map<String, Snack> map = new HashMap();// map은 타입 파라미터를 2개 받는다
         // Map<String, Snack> map = new TreeMap<>();
                // ctrl+alt+b

        map.put("다이제", new Snack("다이제","초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸","바나나맛", 200));
        map.put("프링글스", new Snack("프링글스","어니언맛", 500));
        map.put("프링글스", new Snack("프링글스","짠맛", 400));
        map.put("먹태깡", new Snack("먹태깡","청양", 300));
        
        // 키값이 중복되는 경우 나중에 저장된 객체가 저장된다
        // map 인터페이스 안에 treemap이 있음
       // Map.Entry<String, Snack> entry = map.entrySet(
         System.out.println(map);
        System.out.println(map.size()); // entry 객체의 개수
        System.out.println(map.isEmpty());
        System.out.println();

        Snack snack = map.get("칸쵸"); // map 에서 칸쵸를 얻어와서 snack에 저장
        System.out.println(snack);
        System.out.println();
        
        // key에 해당하는 entry 객체를 삭제하는 메소드
        snack = map.remove("먹태깡");
        System.out.println(snack);
        System.out.println(map);
        System.out.println(map.size());

        // 모든 Entry 객체를 삭제하는 메소드
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println();

        

    }
    
    
    public void method2(){

        Map<String, Snack> map = new HashMap();// map은 타입 파라미터를 2개 받는다

        // ctrl+alt+b

        map.put("다이제", new Snack("다이제","초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸","바나나맛", 200));
        map.put("프링글스", new Snack("프링글스","어니언맛", 500));
        map.put("초코파이", new Snack("초코파이","수박맛", 200));
        map.put("먹태깡", new Snack("먹태깡","청양", 300));

        // Map 은 인덱스의 개념이 없어서 반복문을 사용할 수 없다
       /* for(int i = 0; i< map.size(); i++){
         }*/

        // map 안에는 Iterable 인터페이스를 구현하지 않아서 향상된 for문을 사용할 수 없다
        // for (Map.Entry<String, Snack> entry : map) {}

        // map은 구조가 달라서 arraylist에 담아서 사용할 수 없다
        //new ArrayList<Snack>(map);

        // map에 접근하기 위한 방법
        // 1. KeySet() 메소드를 이용하는 방법
        //   - Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다
        Set<String> set = map.keySet();

        // key들만 set에서 가져와서 반복 처리
        for( String key : set){ // key는 keyset에서 얻어온 value
            System.out.printf("key : %s , value : %s\n", key, map.get(key));
        }


        // 2. entrySet() 메소드를 이용하는 방법
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();
        // Map.Entry가 아니라 Entry만 사용하고 싶으면 import 구문에
        // import java.util.Map.Entry;까지 적는다

        for( Entry<String, Snack> entry : entrySet){
            System.out.printf("key : %s, value : %s\n", entry.getKey(), entry.getValue());

        }



    }
}

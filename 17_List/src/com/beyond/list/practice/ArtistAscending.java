package com.beyond.list.practice;

import java.util.Comparator;

public class ArtistAscending implements Comparator<Music> {


    /*
    * compare()
    *  - 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다
    *  - 두 객체가 같으면 0을 리턴한다
    *  - 첫 번째 객체가 크다면 양의 정수 리턴
    *  - 두 번째 객체가 크다면 음의 정수 리턴
    * 
    * */
    @Override
    public int compare(Music music1, Music music2) {
        
        // compareTo 호출해서 매개값으로 두번째 값을 줘서 비교시킴
        return music1.getArtist().compareTo(music2.getArtist());
    }
}

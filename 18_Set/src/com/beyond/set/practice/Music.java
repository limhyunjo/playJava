package com.beyond.set.practice;

import java.util.Objects;

public class Music implements Comparable<Music>{

    private String title;
    private String artist;
    private int ranking;


    public Music(String title, String artist, int ranking) {
        this.title = title;
        this.artist = artist;
        this.ranking = ranking;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    /*
    * compareTo()
    *  - 메소드에서 반환되는 값을 가지고 정렬 기준을 잡는다
    *  - 비교해서 같으면 0을 리턴
    *  - 비교해서 자신이 크다면 양의 정수를 리턴한다.
    *  - 비교해서 자신이 작다면 음의 정수를 리턴한다.
    * */
    @Override // 재정의 -> 정렬 기준 메서드 구현
    public int compareTo(Music music) { // 같으면 0 , 랭킹이 자신이 더 낮으면 양수 리턴, 랭킹이 자신이 더 크면 음수 리턴
        return this.ranking - music.ranking;
        // 자신이 3이고 매개값으로 들어온 값이 5면 음수가 나옴

        // 내림차순 하고 싶으면 값만 반대로 함
        // return music.ranking -this.ranking;
    }

    @Override
    public boolean equals(Object o) { // 재정의를 통해 객체의 주소가 아닌 데이터 값을 비교하도록 함
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return ranking == music.ranking && Objects.equals(title, music.title) && Objects.equals(artist, music.artist);
    }

    @Override
    public int hashCode() { // 데이터가 같으면 같은 해시코드를 리턴하도록 재정의
        return Objects.hash(title, artist, ranking);
    }
}

package com.example.sl.yigongbang.util;


public class Fruit {
    private String name;
    private String time;
    private String place;
    private int number;
    public Fruit(String name,String time,String place,int number){
        this.name=name;
        this.time=time;
        this.place=place;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public String getTime(){
        return time;
    }
    public String getPlace(){
        return place;
    }
    public int getNumber(){
        return number;
    }
}

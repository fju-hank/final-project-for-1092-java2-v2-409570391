package com.fju;

public class Monster extends Role{
    public Monster(){
        name = "Ugly" ;
        blood = 50 ;

    }
    public void injury(){
    blood-=10;
    }
    public void show(){
        System.out.println(name+"got hurt");
    }
}

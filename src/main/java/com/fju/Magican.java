package com.fju;

public class Magican extends Role {
    public Magican(){
        name = "Marry" ;
        blood = 100 ;
    }
    public void fight(){
    System.out.println("Magic attack");
}
    public void cure() {
        System.out.println("Magic heal");
    }
}

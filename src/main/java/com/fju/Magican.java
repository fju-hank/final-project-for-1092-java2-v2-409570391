
package com.fju;

public class Magican extends Role {
    public Magican(){
        name = "Marry" ;
        blood = 100 ;
    }
    public void fight(Monster monster){
        System.out.println("Magic attack");
        monster.injury();
    }
    public void show() {
        System.out.println(name+" left " +blood +" blood");
    }
}
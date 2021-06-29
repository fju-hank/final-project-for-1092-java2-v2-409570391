
package com.fju;

public class Warrior extends Role{
    public Warrior(){
        name = "Matt";
        blood = 150 ;
    }
    public void fight(Monster monster){
        System.out.println("Physical attack");
        monster.injury();
    }
    public void show(){
        System.out.println(name+" left "+blood+" blood");
    }
}
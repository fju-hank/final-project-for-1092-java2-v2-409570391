package com.fju;

public class Test {public static void main(String[] args)
{
    int i=0;
    Warrior warrior = new Warrior();
    Monster monster = new Monster();
    for(i=0;;i++)
    {i+=1;
        System.out.println("The "+i+" Round start");
        warrior.fight(monster);

        System.out.println("The "+i+" Round over");
        System.out.println("Battle statistics");
        warrior.show();
        monster.show();
        i-=1;
        if(monster.blood<=0)
        {break;

        }
    }
    System.out.println("Winner is "+warrior.name);
    System.out.println("Battle statistics");
    i+=1;
    System.out.println(warrior.name+" fight with "+ monster.name+i+" times");
}
}

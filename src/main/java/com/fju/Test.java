package com.fju;

import java.util.Scanner;

public class Test {public static void main(String[] args)
{
    int i=0;
    int j = 0 ;
    Warrior warrior = new Warrior();
    Magican magican = new Magican();
    Monster monster = new Monster();
    Scanner scanner = new Scanner(System.in);
    String role ="";
    String enemy = "C";
    String battle ="";
    System.out.println("Please choose a role");
    System.out.println("A:Warrior");
    System.out.println("B:Magican");
    role = scanner.nextLine();
    battle = role + enemy ;
    switch(battle){
        case "AC" :{
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
            break;
        }
        case "BC":{for(i=0;;i++)
        {i+=1;
            System.out.println("The "+i+" Round start");
            magican.fight(monster);
            System.out.println("The "+i+" Round over");
            System.out.println("Battle statistics");
            warrior.show();
            monster.show();
            i-=1;
            if(monster.blood<=0)
            {break;

            }
        }
            System.out.println("Winner is "+magican.name);
            System.out.println("Battle statistics");
            i+=1;
            System.out.println(magican.name+" fight with "+ monster.name+i+" times");
            break;
        }


    }

}
}
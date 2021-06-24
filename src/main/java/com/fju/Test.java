package com.fju;

public class Test {
    public static void main(String[] args) {
        demoSwordsMan();
        demoMagician();
    }

    static void demoSwordsMan() {
        Warrior warrior = new Warrior();
        warrior.setName("Matt");
        warrior.setLevel(1);
        warrior.setBlood(150);
        System.out.printf("Warrior", warrior.getName(),
                warrior.getLevel(), warrior.getBlood());
    }

    static void demoMagician() {
        Magician magician = new Magician();
        magician.setName("Marry");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.printf("Magican", magician.getName(),
                magician.getLevel(), magician.getBlood());
    }

}

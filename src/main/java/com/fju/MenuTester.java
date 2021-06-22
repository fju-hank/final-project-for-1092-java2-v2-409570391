package com.fju;
import java.util.*;
public class MenuTester {
    static Dish[] Menu = new Dish[100];
    static int Dish_NO = 0 ;
    static Order[] Fare = new Order[20];
    static int Order_NO = 0 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name[] = {"beef", "chicken", "lamb", "turkey", "salmon", "white bread", "whole wheat bread ", "rye bread", "multigrain bread", "sourdough bread", " fries", "sweet potatoes", "mashed potatoes", "hash browns", "onion rings", "spaghetti", "lasagna", "rotini ", "macaroni ", "fettuccine", "linguine", "spaghetti "};

        int[] price = {120, 200, 320, 200, 400, 200, 150, 150, 120, 270, 250, 200, 200, 300, 280, 400, 200, 500, 200, 450, 200, 150};
        for (int i = 0; i < name.length; i++) {

            Menu[i] = new Dish();

            Menu[i].name = name[i];

            Menu[i].price = price[i];
        }
        System.out.printf("  Menu\t\tPrice\n");

        for (int i = 0; i < name.length; i++) {

            System.out.printf("%s\t", Menu[i].name);

            System.out.printf("%d\t", Menu[i].price);

            System.out.printf("\n");
        }
        int table_No, count, item, sel;

        int total_m=0;

        System.out.println("Please enter the table :");
        table_No = scanner.nextInt();
        for(int i=0; i<Dish_NO; i++){

            System.out.printf("(%d)%s  ", (i+1), Menu[i].name);

            if ((i+1)%5 == 0)

                System.out.printf("\n");

        }
        System.out.printf("Enter(0)to end the order \n");

        System.out.printf("Please enter the number of the dish name\n =>");

        item = scanner.nextInt(); count = 0;

        while(item != 0) {

            Fare[Order_NO] = new Order();

            Fare[Order_NO].No = table_No;

            Fare[Order_NO].name = Menu[item-1].name;

            Fare[Order_NO].price = Menu[item-1].price;total_m = total_m + Fare[Order_NO].price;

            Order_NO = Order_NO + 1;

            count = count + 1;System.out.printf("Accumulated %d yuan, %d, please enter the number of the dish name :",

                    total_m);

            item = scanner.nextInt();
        }
        System.out.printf("The menu for %d table customers is as follows:\n", table_No);

        System.out.printf("  dish name\t\tprice\t");
        for(int i=0;i< count;i++)

            System.out.printf("%s\t%3d\t%3d\n",Fare[i].name,Fare[i].price);

        System.out.printf("dish name\t\ttotal price:%d\n",total_m);

        System.out.printf("The kitchen adds menu as follows:\n");

        for(int i=0;i<count;i++)

            System.out.printf("%3d table times\n\t %s \n",Fare[i].No, Fare[i].name);
    }

}

package test;
import java.util.*;
public class Try {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        final int CP = 5 , FP = 4 ,AP = 5 , SP = 3 , EP = 2 ,SLP = 3 ,BTP = 4 , BP = 2 , UP = 3 ,DP = 5 ;

        int weights = CP+FP+AP+SP+EP+SLP+BTP+BP+UP+DP;

        int a,b ,c ,d ,e,f,g,h,i,j;

        float value;

        System.out.printf("Depression self-diagnosis system\n");

        System.out.printf("Please enter how obvious the various symptoms are(0-10)\n");

        System.out.printf("\tSuch as: not obvious (0), slightly obvious (4) obvious (6), very obvious (10)\n");



        System.out.printf("I often feel like crying(0~10)\n =>");

        a = scanner.nextInt();

        System.out.print("I feel bad(0~10)\n =>");

        b = scanner.nextInt();

        System.out.print("I feel tantrums more easily than before(0~10)\n =>");

        c = scanner.nextInt();

        System.out.print("I can't sleep well(0~10)\n =>");

        d = scanner.nextInt();

        System.out.println("I don't feel like eating\n =>");

        e = scanner.nextInt();

        System.out.println("I think thinking or doing things is slower than before\n =>");

        f = scanner.nextInt();

        System.out.println("I'm more likely to think in the bad direction\n =>");

        g = scanner.nextInt();

        System.out.println("I feel sick\n =>");

        h = scanner.nextInt();

        System.out.println("I feel very useless\n =>");

        i = scanner.nextInt();

        System.out.println("I can't think about it, I even want to die\n =>");

        j = scanner.nextInt();



        value = (float)(a*CP+b*FP+c*AP+d*SP+f*EP+g*SLP+h*BP+i*UP+j*DP)/weights;
if (value)
        //value=Math.sqrt((a*x*x + b*y*y + c*z*z + d*k*k) /(double)(a+b+c+d));

        System.out.printf("\n您感染新冠肺炎指數為(0 ~ 10)= %.2f\n", value);

    }
}

package march30;

import java.util.Scanner;
import java.util.SortedMap;

public class Lottery {

    public static void main(String[] args) {

        System.out.print("Welcome to my Lottery ! ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1-100 to try if it is a Lucky Number: ");

        int num;

        for(int x=1;x<=3;x++){
            num=sc.nextInt();
            if(num==55){
                System.out.println("Congratulations! You won $5000");
                break;
            }else {
                if(x<3) {
                    System.out.println("Sorry try again !");
                    continue;
                }
                System.out.println("Sorry maximum try reached!");
            }
        }
    }
}

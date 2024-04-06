package assignment3;

import java.util.Scanner;

public class DoWhileUntilQ {

    public static void main(String[] args) {

        char c;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter a char: ");
            c=sc.next().charAt(0);
        }while(c!='q');

    }

}

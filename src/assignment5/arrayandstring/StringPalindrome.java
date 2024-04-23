package assignment5.arrayandstring;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        System.out.print("Enter a string to check if it is a Palindrome: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char[] ch=str.toCharArray();

        int j=ch.length-1;
        boolean match=true;
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[j]){
                match=false;
                break;
            }
            j--;
        }

        if(match==true)
            System.out.println("String "+str+" is a Palindrome !");
        else
            System.out.println("String "+str+" is NOT a Palindrome !");
    }

}

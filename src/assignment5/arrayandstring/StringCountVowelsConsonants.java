package assignment5.arrayandstring;

import java.util.Scanner;

public class StringCountVowelsConsonants {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String to count number of vowels and consonants: ");
        String str1=sc.next();
        String str=str1.toLowerCase();

        int j=0,k=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                j++;
            else k++;
        }

        System.out.println("Number of vowels = " + j);
        System.out.println("Number of consonants = " + k);


    }




}

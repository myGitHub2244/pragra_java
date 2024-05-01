/*
Write a Java program that takes a sentence as input and reverses the order of words in it. A word is defined as a sequence of non-space characters. The program should maintain the order of characters within each word.
For example:
Input: "Hello World" Output: "World Hello"
Input: "Java Programming is Fun" Output: "Fun is Programming Java"
 */

package assignment5.arrayandstring;

import java.util.Scanner;

public class StringReverseWords {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence (in double quotes): ");    //E.g. "Java Programming is Fun"


        String st1=null;
        String[] st4=new String[2];
        String merge=sc.next().substring(1);

//        System.out.println(merge);
        char breakloop=' ';
        while(sc.hasNext()){
            st1=sc.next();
            if(st1.charAt(st1.length()-1)=='\"'){
                st1=st1.substring(0,st1.length()-1);
                breakloop='\"';
            }
//            System.out.println(st1);
            st4[0]=merge;
            st4[1]=st1;
            merge=String.join(" ",st4);
//            System.out.println(merge);
            if(breakloop=='\"')break;
        }

//        System.out.println("While loop complete");
        String[] st5 = merge.split(" ");
        String[] st6 = new String[st5.length];
        String dbqoutes="\"";

        int j=0;
        for(int i=st5.length-1;i>=0;i--) {
            if(i==st5.length-1)
                st6[j] = dbqoutes.concat(st5[i]);
            else if(i==0)
                st6[j] = st5[i].concat(dbqoutes);
            else
                st6[j] = st5[i];
            j++;
        }

        String st7 = String.join(" ",st6);
        System.out.println("Reversed Sentence : " + st7);   //Expected: "Fun is Programming Java"

    }

}

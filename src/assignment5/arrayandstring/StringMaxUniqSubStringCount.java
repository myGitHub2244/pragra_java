package assignment5.arrayandstring;

import java.util.Scanner;

public class StringMaxUniqSubStringCount {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String to count max sub-string of non-repeated chars: ");
        String st1=sc.next();
        String st2 = st1.toLowerCase();

        System.out.println("st2 = " + st2);

        int j=0,k=1;
        String st3=st2.substring(0,1);
        System.out.println("st3 = " + st3);

        String maxString=st3;
        System.out.println("st3 = " + st3);

        int maxLength=1;

        for(int i=1;i<st2.length();i++){
            for(j=0;j<st3.length();j++){
                System.out.println("st3.charAt(j) = " + st3.charAt(j));
                if(st3.charAt(j)==st2.charAt(i)){
                   System.out.println("string matched: " +st2.charAt(i));
                   st3=st3.substring(j+1)+st2.charAt(i);
                   System.out.println("Reset Subtring = " + st3);
                   break;
               }
               else{
                   System.out.println("string NOT matched: " +st2.charAt(i));
                   System.out.println("st3.substring(0,j+1) = " + st3.substring(0, j+1));
                   System.out.println("st2.charAt(i) = " + st2.charAt(i));



                   if(j==i-1){
                       st3=st3.substring(0,j+1)+st2.charAt(i);
                       System.out.println("New bigger substring = " + st3);

                       k++;
                       if(k>maxLength){
                           System.out.println("Max length updated: "+k);
                           maxLength=k;
                           maxString=st3;
                           System.out.println("maxString = " + maxString);                       }
                            k=0;
                       break;
                   }
               }
            }
//            j+=1;
        }

        System.out.println("maxString = " + maxString);
        System.out.println("maxLength = " + maxLength);
    }

}

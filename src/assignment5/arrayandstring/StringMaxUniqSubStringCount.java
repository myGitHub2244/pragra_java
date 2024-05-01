//Given a string, find the length of the longest substring without repeating characters. []

package assignment5.arrayandstring;
import java.util.Scanner;

public class StringMaxUniqSubStringCount {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string to count max length of sub-string of non-repeated chars: ");
        String inString=sc.next();
        String inStringLowerCase = inString.toLowerCase();

        String subString=inStringLowerCase.substring(0,1);

        String maxString=subString;
        int maxLength=subString.length();

        //Nested FOR loop

        //Outer FOR loop to traverse through the Input String
        for(int i=1;i<inStringLowerCase.length();i++){
//            System.out.println("charAt(i) = " + inStringLowerCase.charAt(i));
            //Inner FOR loop to traverse through the non-repeated char Sub-String
            for(int j=0;j<subString.length();j++){
//                System.out.println("charAt(j) = " + subString.charAt(j));
                if(subString.charAt(j)==inStringLowerCase.charAt(i)){
//                    System.out.println("char matched");
                   if(j==subString.length()-1)
                       subString=String.valueOf(inStringLowerCase.charAt(i));
                   else
                       subString=subString.substring(j+1)+inStringLowerCase.charAt(i);
                   System.out.println("Reset substring: " +subString);
                   break;
               }
               else{
//                    System.out.println("char not matched");
                    if(j==subString.length()-1){
//                        System.out.println("Update new substring");
                       subString=subString.substring(0,j+1)+inStringLowerCase.charAt(i);
//                        System.out.println("subString = " + subString);
                        if(subString.length()>maxLength){
                           maxString=subString;
                           maxLength=subString.length();
                           System.out.println("New maxString = " + maxString);
                           System.out.println("New maxLength = " + maxLength);
                       }
                    break;
                    }
               }
            }
        }

        System.out.println("Final maxString = " + maxString);
        System.out.println("Final maxLength = " + maxLength);
    }

}

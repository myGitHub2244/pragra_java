package assignment1;

import java.util.Scanner;

public class CheckVowelConsonant {

    public static void main(String[] args) {

        char vowel[] = {'a','e','i','o','u'};
        char consonant[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check if it is a vowel or a consonant: ");

        char charInput1 = sc.next().charAt(0);
        char charInput = Character.toLowerCase(charInput1);
        boolean vowelFound = false;

        for (char vow:vowel){
            if(charInput == vow) {
                System.out.println("Char entered is a Vowel: " + charInput);
                vowelFound = true;
                break;
            }
        }
        if (vowelFound == false){
            for (char vow:consonant){
                if(charInput == vow) {
                    System.out.println("Char entered is a Consonant: " + charInput);
                    vowelFound = true;
                    break;
                }
            }
        }

        if (vowelFound == false)
            System.out.println("Char entered is a neither a Vowel nor a Consonant: " + charInput);
        sc.close();
    }
}

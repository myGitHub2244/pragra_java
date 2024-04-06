package assignment1;

import java.util.Scanner;

public class CheckStudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Grading System: \n  A: 90-100 \n  B: 80-89 \n  C: 70-79 \n  D: 60-69 \n  E: 0-59 (Fail)");

        System.out.print("Enter Student's score: ");

        int score = sc.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade: E (Fail)");
        } else System.out.println("Invalid score entered");

        sc.close();
    }
}

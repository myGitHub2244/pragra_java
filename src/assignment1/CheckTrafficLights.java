package assignment1;

import java.util.Scanner;

public class CheckTrafficLights {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Traffic Light Colors: \n . Red \n . Yellow \n . Green");

        System.out.print("Enter your choice: ");

        String colorInput = sc.next();

        switch(colorInput){
            case "Red":
                System.out.println("STOP !");
                break;
            case "Yellow":
                System.out.println("PREPARE TO STOP !");
                break;
            case "Green":
                System.out.println("GO !");
                break;
            default:
                System.out.println("Invalid color entered");
        }

        sc.close();
    }
}

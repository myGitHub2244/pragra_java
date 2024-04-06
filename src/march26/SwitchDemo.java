package march26;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int x=sc.nextInt();

        switch(x) {
            case 1:
                System.out.println("Switch on the fan: " + x);
                break;

            case 2:
                System.out.println("Switch on the Red bulb: " + x);
//                break;        --> break is commented out, hence if '2' is entered it will print msg for 2 and 3 as well

            case 3:
                System.out.println("Switch on the Green bulb: " + x);
                break;

            default:
                System.out.println("Invalid Number entered: " + x);

        }
    }
}

package april13.array;

import java.util.Scanner;

public class Array2Demo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        //Take int input and store in array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

//Print Array
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[i] = " + arr[i]);
        }



    }

}

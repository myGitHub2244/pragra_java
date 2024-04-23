package april13.array;

public class ArraySum {

    public static void main(String[] args) {

        int[] arr1={23,44,23,52,54,23,87,87};
        int j=0;
        for(int i=0;i<arr1.length;i++){             //For Loop
            j+=arr1[i];
        }
        System.out.println("Sum of Array = " + j);

        j=0;
        for(int i:arr1){                            //For-Each Loop
            j+=i;
        }
        System.out.println("Sum of Array = " + j);

    }
}

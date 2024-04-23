package april13.array;

public class ArrayReverseUsingForLoop {

    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50,60,70};

        int l=0;
        for(int i=arr1.length-1,j=0;i>arr1.length/2;i--,j++){             //For Loop to reverse
            l=arr1[j];
            arr1[j]=arr1[i];
            arr1[i]=l;
        }

        for(int k=0;k<arr1.length;k++){
            System.out.println(arr1[k]);         //Prints elements of Array
        }

    }
}

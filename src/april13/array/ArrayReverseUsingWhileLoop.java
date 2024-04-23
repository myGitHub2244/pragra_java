package april13.array;

public class ArrayReverseUsingWhileLoop {

    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50,60,70};

        int start=0;
        int end=arr1.length-1;
        int temp=0;

        while(start<end){

            temp=arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            start++;
            end--;

        }

        for(int k=0;k<arr1.length;k++){
            System.out.println(arr1[k]);         //Prints elements of Array
        }

    }
}

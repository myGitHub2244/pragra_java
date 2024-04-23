package april13.array;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50,60,70};
        int[] arr2=new int[7];

        int i,j;
        for(i=arr1.length-1,j=0;i>=0;i--,j++){             //For Loop
            arr2[j]=arr1[i];
        }

        for(int k=0;k<arr2.length;k++){
            System.out.println(arr2[k]);         //Prints elements of Array
        }

    }
}

package april13.array;

public class ArrayFindMax {

    public static void main(String[] args) {

        int[] arr = {23,45,22,100,01,80};

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }

        System.out.println("Maximum number = " + max);

    }

}

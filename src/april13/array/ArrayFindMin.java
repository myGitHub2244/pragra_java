package april13.array;

public class ArrayFindMin {

    public static void main(String[] args) {

        int[] arr = {23,45,22,100,01,80};

        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Minimum number = " + min);

    }

}

package april13.array;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr={33,22,44,00,10,60,100};

        int i,j,l=0,temp=0,temp1=0;

        for(i=0;i<arr.length;i++){
            temp=arr[i];
            l=i;
            for(j=i+1;j<arr.length;j++){
                if(temp>arr[j]){
                    temp=arr[j];
                    l=j;
//                    System.out.println("j = " + j); //for debug purpose
                }
            }
//            System.out.println("l = " + l); //for debug purpose
            if(i!=l) {
                temp1 = arr[i];
                arr[i] = temp;
                arr[l] = temp1;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);         //Prints elements of Array
        }

    }
}

package april13.array;

public class ArrayDemo {

    public static void main(String[] args) {

        //Array is an object of homogeneous elements. It has fixed length. Index starts at 0

        int[] arr1 = new int[2];    //Array size is must

        int[] arr={13,33,43,5,67,32,99};
//        Array ref = Array object

        System.out.println("Array Length: "+arr.length);
        for(int i=0;i<arr.length;i++){          //length is property of Array. it is not a function !
            System.out.println(arr[i]);         //Prints elements of Array
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr);            //Print reference to Object Array. Array is stored in Heap!
        }

    }
}

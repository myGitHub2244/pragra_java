package april13.array;

public class ArrayDemo {

    public static void main(String[] args) {

        //Array is an object of homogeneous elements. It has fixed length. Index starts at 0

        int[] arr1 = new int[2];    //Array size is must

//        int[] arr2 = new int[];   --> Compile error: Must initialize OR at least provide array length
//        int[3] arr3 = {0,1,2};   //--> Compile error: Cannot give array length like this!


        int[] arr4;
//        arr4={0,1,2,3};      //--> Since arr4 was not defined a length, this line is error

        int[] arr5=new int[3];
//        arr5={0,1,2};         //Invalid initialization
        arr5[0]=0;arr5[1]=1;arr5[2]=2;  //Valid initialization
        arr5[3]=3;      //somehow compiler allows setting 4th position although Array length is 3 !
        arr5[100]=1;    //somehow compiler allows setting 4th position although Array length is 3 !
//        System.out.println("arr5[3] = " + arr5[3]); //This gives  java.lang.ArrayIndexOutOfBoundsException
        int[] arr2=new int[]{0,1,2};

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

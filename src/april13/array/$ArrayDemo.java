package april13.array;

public class $ArrayDemo {

    public static void main(String[] args) {

        //Array is an ** Object ** of homogeneous elements. It has fixed length. Index starts at 0
        //Array is a non-primitive data-type
        //Elements in an Array are automatically initialized as per that elements data-type. E.g. int is '0', boolean is false !

        int[] arr7=new int[3];
        arr7[0]=0;
        System.out.println("Default value of int: " +arr7[1]);     //arr[1] is not automatically initialized as per array type i.e. '0' for a Int !!
        System.out.println(arr7);        //prints the address of the array (Array is an object of similar data-type elements)

        boolean[] bo=new boolean[2];
        System.out.println("Default value of boolean: " +bo[1]);
        System.out.println(bo);

        char[] c=new char[2];
        System.out.println("Default value of char: " +c[0]);

        int[] arr6={0,1,2,3};       //Array initialized at declaration with size 4
        int[] arr1 = new int[2];    //Array size is must, if not initialized at time of declaration

//        int[] arr2 = new int[];   --> Compile error: Must initialize OR at least provide array length
//        int[3] arr3 = {0,1,2};   //--> Compile error: Cannot give array length like this!


        int[] arr4;
//        arr4={0,1,2,3};      //--> Since arr4 was not defined a length, this line is error

        int[] arr5=new int[3];
//        arr5={0,1,2};         //Invalid initialization
        arr5[0]=0;arr5[1]=1;arr5[2]=2;  //Valid initialization
        arr5[3]=3;      //somehow compiler allows setting 4th position although Array length is 3 !
        arr5[100]=1;    //somehow compiler allows setting 100th position although Array length is 3 !
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

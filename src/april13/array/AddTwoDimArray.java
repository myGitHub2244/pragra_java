package april13.array;

public class AddTwoDimArray {

    public static void main(String[] args) {


    //                row index 0   index 1     index 2
        int[][] arr1={{54,12,4}, {2,36,40}, {6,4,5}};   //this is same as arr1[3][3] !!
                                                        // {{54,12,4},
                                                        // {2,36,40},
                                                        // {6,4,5}}

        int[][] arr2={{2,9,40}, {5,3,6}, {3,5,12}};

        int[][] arr3= new int[3][3];        // row x columns
        System.out.println(arr3[0]);    //reference of array at 1st row. This itself is an array of columns


        for(int i=0;i<arr1.length;i++){         //length is the Property of Array object. It is not a method !
            for(int j=0;j<arr1.length;j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
                System.out.println("array value = " + arr3[i][j]);
            }
        }


    }

}

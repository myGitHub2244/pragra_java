package april13.array;

public class AddTwoDimArray {

    public static void main(String[] args) {


        int[][] arr1={{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] arr2={{2,9,40}, {5,3,6}, {3,5,12}};
        int[][] arr3= new int[3][3];


        for(int i=0;i<arr1.length;i++){
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

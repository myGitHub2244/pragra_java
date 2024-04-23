package april13.array;

public class TwoDimArray {

    public static void main(String[] args) {

//        int[][] arr = new int[3][3];

        int[][] arr1={{10,20,30},{40,50,60},{70,80,90}};


        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.println("array value = " + arr1[i][j]);
            }
        }

    }

}

package march23;

public class Assign1 {
    public static void main(String[] args) {
        System.out.println("Before Swapping:");
        int x = 10;
        int y = 20;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int z = x;
        x = y;
        y = z;

        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}

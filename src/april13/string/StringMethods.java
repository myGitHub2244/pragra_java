package april13.string;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Test";
        System.out.println("s1 = " + s1);

        s1="Test"+" Result ";
        System.out.println("s1 = " + s1);

        System.out.println("s1.toLowerCase() = " + s1.toLowerCase());
        System.out.println("s1.toLowerCase() = " + s1.toUpperCase());

        System.out.println("s1.contains(A) = " + s1.contains("A"));
        System.out.println("s1.contains(T) = " + s1.contains("T"));

        System.out.println("s1.substring(2) = " + s1.substring(2));
        System.out.println("s1.substring(2,3) = " + s1.substring(2, 3));

        System.out.println("s1.trim() = " + s1.trim());

    }


}

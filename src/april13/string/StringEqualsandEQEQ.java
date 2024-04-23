package april13.string;

public class StringEqualsandEQEQ {

    //String is immutable and it is basically a Array of char

    public static void main(String[] args) {
        String s1 = "test";             //"test" is either already present or created in Heap and s1 is Object Reference present in
        String s2 = "test";             // s1 is also pointing to same heap "test"
        String s3 = new String("test");     //creates a new object in Heap. this is different than "test" already present

//        "==" checks if points to same reference (and not content)
        System.out.println(s1==s2);     //s1 and s2 points to same "test" in heap, hence true
        System.out.println(s1==s3);     //s1/s2 do not point to the same "test" in heap, hence false

        //"equals() checks if content is same.
        System.out.println(s1.equals(s3));  //s1 and s3 although point to different objects but content is same, hence true

    }


}

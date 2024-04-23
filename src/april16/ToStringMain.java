package april16;

public class ToStringMain {

    public static void main(String[] args) {
        Student st=new Student(101,"John");

        //toString method is originally created in Object. It can overidden in child class e.g. String Class
        //toString method of Object displays Class prop and hashcode whereas of String displays String object values

        System.out.println(st);     //  compiler in this case st.toString of Object class and print Class+Hashcode

        // If we want to print value of Object i.e. 101 "John" we need to override the toString method in Student class

    }
}

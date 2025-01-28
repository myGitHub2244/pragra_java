package april16;

public class ToStringMain {

    public static void main(String[] args) {
        Student st=new Student(101,"John");

        //toString method is originally created in Object. It can overidden in child class e.g. String Class
        //toString method of Object displays Class prop and hashcode whereas of String displays String object values

        System.out.println(st);     //  compiler in this case calls "st.toString" of Object class and print Class+Hashcode
        System.out.println(st.toString()); //toString is defined in Object class
        //Object class -> public String toString() {return getClass().getName() + "@" + Integer.toHexString(hashCode());}

    // If we want to print value of Object i.e. Student{id=101, name='John'} we need to override the toString method in Student class
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }


        //"toString" has been overridden in String class, hence it prints the actual value and not hashcode !
        String s1="Test";
        System.out.println(s1.toString());  //    public String toString() {return this;}
        System.out.println(s1); //internally calls String class toString method !

        String s2=new String("Test");
        System.out.println(s2); //calls String toString overridden method

    }
}

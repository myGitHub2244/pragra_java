package april02;

public class Student {


    //attributes
    int id;
    String name;

    //methods/behavior

    public void getStudent(String name, int id){  //nm in this case is a "Parameter". Obj wil call using "Argument"
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Student st=new Student();       //new keyword will allocate memory to an object

        st.getStudent("Tommy",101);              //nm in this case is an "Argument". Basically call uses Argument. Whereas Method itself uses a Parameter

    }


}

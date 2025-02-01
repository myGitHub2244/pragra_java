package may04.Generics;

public class IssueWithoutGenerics {

    //Issue with using Object is although generic is achieved but this is too much generic and it comprises on type safety at Object creation !
        Object id;
        Object name;

        public IssueWithoutGenerics(Object id, Object name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {              //override the toString method. Else toString of Object class will be used which print hashcode
            return "Employee{" +
                    "id=" + id +
                    ", name=" + name +
                    '}';
        }
}

class MainDemo{
    public static void main(String[] args) {
        IssueWithoutGenerics iss1=new IssueWithoutGenerics(101,"Pragra");
        System.out.println("iss1 = " + iss1);

        IssueWithoutGenerics iss2=new IssueWithoutGenerics("Toronto","Pragra"); // There is no type safety with use of Object
        System.out.println("iss2 = " + iss2);


    }

}

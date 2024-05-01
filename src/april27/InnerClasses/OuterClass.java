package april27.InnerClasses;

 class OuterClass {
    int x=10;

    class InnerClass{
        int y=20;
        public void innerMethod(){
            System.out.println("Inner Method");
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();       //obj of Outer class is needed in order to crate obj of Inner class
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();

        innerClass.innerMethod();
    }

}

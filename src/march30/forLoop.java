package march30;

public class forLoop {

    public static void main(String[] args) {

        /*
        for (initialization ; condition ; increment/decrement ) {
              lines of code
        }

        Steps -> First initialize, 2nd check condition, if true then execute code, then incr/decr, check cond..repeat!
                Note: Initialize is executed only once !
         */

        for(int x=0;x<=10;x++){
            System.out.println(x);
        }

        int x=0;
        for(;x<=10;x++){
            System.out.println(x);
        }

        int y=0;
        for(;y<=10;){
            System.out.println(y);
            y++;
        }




//        Below is a valid code but it is infinite loop !
//        for(;;){
//            System.out.println("Display");
//        }


    }
}

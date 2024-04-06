package march30;

public class forLoopBreakContinue {

    public static void main(String[] args) {


        for(int x=1;x<=10;x++){
            if(x%2==0)
                break;                  //break will break the loop and exit for loop
            System.out.println(x);
        }

        for(int x=1;x<=10;x++){
            if(x%2==0)
                continue;               //continue will skip the logic at that point and move to next iteration
            System.out.println(x);
        }

    }
}

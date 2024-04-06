package march30;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PrintCounter {

    public static void main(String[] args) {

    int counter=1;
    int sum=0;

    do{
        System.out.println("Counter: " +counter);
        sum +=counter;
        counter++;

    }while(counter<=10);
        System.out.println("Sum of Numbers: "+sum);

//    while(counter<=10){
//        System.out.println("Counter: " +counter);
//        sum +=counter;
//        counter++;
//    }
//        System.out.println("Sum of Numbers: "+sum);
    }
}

package april13.string;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Pragra";

        //First convert String to char Array
        char[] ch=s.toCharArray();

        int start=0;
        int end=ch.length-1;
        char ch1=' ';

        while(start<end){
            ch1=ch[start];
            ch[start]=ch[end];
            ch[end]=ch1;
            start++;
            end--;
        }

//        String s1=String.copyValueOf(ch);       //Convert char array to String
        String s1=new String(ch);                  //Convert char array to String
        System.out.println("Reverse String = " + s1);

    }

}

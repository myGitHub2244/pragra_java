package april06.constructor;

public class DateUsingThis {

    int day;
    int month;
    int year;

DateUsingThis(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;

}

public void printDate(){
    System.out.println("Date: "+day+"/"+month+"/"+year );

}

    public static void main(String[] args) {

// *** Cannot create object with this bcoz Java will not provide default constructor !!!***
//        DateUsingThis date=new DateUsingThis();

        DateUsingThis date1=new DateUsingThis(06,04,2024);
        date1.printDate();
    }

}

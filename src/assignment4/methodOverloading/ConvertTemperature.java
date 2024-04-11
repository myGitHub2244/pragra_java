package assignment4.methodOverloading;

public class ConvertTemperature {

    public double convertCelcius(double celcius){
        return celcius*9/5+32;

    }

    public double convertCelcius(double celcius, double kelvinConstant){
        return celcius+kelvinConstant;
    }

    public static void main(String[] args) {
        ConvertTemperature conv=new ConvertTemperature();
        System.out.println("Celcius to Fahrenheit = " + conv.convertCelcius(10));
        System.out.println("Celcius to Kelvin = " + conv.convertCelcius(10, 273.15));
    }


}

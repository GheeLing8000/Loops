
import java.util.Scanner;

public class CalculateWindChillTemperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Receive the wind speed
        System.out.print("Enter the wind speed in kilometers per hour (km/h) above 3 km/h : ");
        double windSpeed = input.nextDouble();
        //Receive outside temperature
        System.out.print("Enter the outside temperature in degree Celsius (oC) at or above -50(oC) and below  or at 5(oC): ");
        double outsideTemperature= input.nextDouble();

        if ( windSpeed >= 3 && (outsideTemperature >= -50 && outsideTemperature <= 5))
        {
            double windChillTemperature = 13.12 + 0.6215 * outsideTemperature - 11.37 * Math.pow(windSpeed, 0.16)
                    + 0.3965 * outsideTemperature * Math.pow(windSpeed, 0.16);
            windChillTemperature = (int) (windChillTemperature * 100) / 100.0;
            //Display the result

            System.out.println("The wind chill temperature of " + windChillTemperature
                    + " degree Celsius (oC) is derived from outside temperature of "
                    + outsideTemperature + " degree Celsius(oC) and wind speed of "
                    + windSpeed + " kilometers/h(km/h).");
        }
        else
            System.out.println("One of the parameters wind speed " + windSpeed + " km/h  is below 3.0 km/h" +" or outside temperature "
                    +  outsideTemperature + " is below -50 degree Celsius(oC) or above 5 degree Celsius(oC)");

    }
}
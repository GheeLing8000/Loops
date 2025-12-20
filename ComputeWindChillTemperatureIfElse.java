import java.util.Scanner;

public class ComputeWindChillTemperatureIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit (F): ");
        double temperatureFahrenheit = input.nextDouble();
        //Prompt the user to enter the wind speed kilometers per hour(km/h)
        System.out.print("Enter the wind speed in kilometers per hour (km/h): ");
        double windSpeedKmHr = input.nextDouble();
        double FahrenheitToCelsius = (temperatureFahrenheit - 32.0) / (9.0 / 5.0);
        if (temperatureFahrenheit >= -58 && temperatureFahrenheit <= 41 && windSpeedKmHr >= 2) {
            double windChillTemperature = 13.12 + 0.6215 * (FahrenheitToCelsius)
                    - 11.37 * (Math.pow(windSpeedKmHr, 0.16))
                    + 0.3965 * FahrenheitToCelsius * (Math.pow(windSpeedKmHr, 0.16));
            double windChillTemperatureFahrenheit = windChillTemperature * 1.8 + 32.0;
            System.out.println("The wind chill temperature is " + windChillTemperatureFahrenheit + " F");
        }

        else
            System.out.println("The temperature " + temperatureFahrenheit + "F and/or the wind speed " + windSpeedKmHr
            + " is invalid");
    }
}
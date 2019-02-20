package task1;

public class Temperature {

    /**
     * This method converting Fahrenheit degrees into Celsius degrees
     * @param fahrenheitTemperature - temperature in Fahrenheit degrees
     */
    public static void convertFahrenheitToCelsius(double temperature){
        double celsiusTemperature = (temperature - 32) * (5. / 8);
        System.out.printf(" %.1f degrees in fahrenheit its %.1f degrees in celsius\n", temperature, celsiusTemperature);
    }
}

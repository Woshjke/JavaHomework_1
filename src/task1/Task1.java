package task1;

public class Task1 {
    public static void main(String[] args) {
        fahrenheitToCelsius(33.2);
        fahrenheitToCelsius(36.6);
    }

    /**
     * This method converting Fahrenheit degrees into Celsius degrees
     *
     * @param fahrenheitTemperature - temperature in Fahrenheit degrees
     */
    private static void fahrenheitToCelsius(double fahrenheitTemperature) {
        double celsiusTemperature = (fahrenheitTemperature - 32) * (5. / 8);
        System.out.printf(" %.1f degrees in fahrenheit its %.1f degrees in celsius\n", fahrenheitTemperature, celsiusTemperature);
    }
}

public class Temperature {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return 5 * (fahrenheit - 32) / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9 * celsius + 160) / 5;
    }
}

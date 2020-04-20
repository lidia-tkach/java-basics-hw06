import java.util.Scanner;

public class CelsiusRunner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = Temperature.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}
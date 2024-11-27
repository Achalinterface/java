package Task_1;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature: ");
		double temperature = scanner.nextDouble();

		System.out.println("Enter the measurement unit: C for Celsius and F for Fahrenheit.");
		char unit = scanner.next().charAt(0);
		char unitInUpperCase = Character.toUpperCase(unit);

		if (unitInUpperCase == 'C') {
			double fahrenheit = celsiusToFahrenheeit(temperature);
			System.out.println(temperature + " Degree celsius is equal to " + fahrenheit + " degree fahrenheit");
		} else if (unitInUpperCase == 'F') {
			double celsius = FahrenheeitToCelsius(temperature);
			System.out.println(temperature + " degree fahrenheit is equal to " + celsius + " degree celsius");
		}

		scanner.close();
	}

	public static double celsiusToFahrenheeit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static double FahrenheeitToCelsius(double fahrenheit) {
		return (fahrenheit * 9 / 5) + 32;
	}
}

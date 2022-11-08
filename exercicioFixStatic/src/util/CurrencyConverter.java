package util;

public class CurrencyConverter {
	
	public static double tax = 0.06;
	
	public static double converter(double y, double x) {
		return (y * x) * (1.0 + tax);
	}
}

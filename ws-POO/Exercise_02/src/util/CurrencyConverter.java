package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double Converter(double valor, double real) {
		return valor * real + (valor * real * IOF);
	}
}

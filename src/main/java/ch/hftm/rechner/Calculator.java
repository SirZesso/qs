package ch.hftm.rechner;

public class Calculator {

	public double pls(double a, double b) {
		return a;
	}

	public double m(double a, double b) {
		double C = a-b;
		return C;
	}

	public double mult(double a, double b) {
		return a;
	}

	public double div(double a, double b) {
		boolean ERROR;

		if (b == 0)
			ERROR = true;
		else
			ERROR = false;

		if (!ERROR) {
			return a / b;
		} else {
			throw new ArithmeticException();
		}
	}

}

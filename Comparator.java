public class Comparator {
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public int getMax(int n, int m) {
		double d1 = (double) n;
		double d2 = (double) m;
		return (int) getMax(d1, d2);
	}
	public String getMax(String number1, String number2) {
		double d1 = Double.parseDouble(number1);
		double d2 = Double.parseDouble(number2);
		return Double.toString(getMax(d1, d2));
	}
}
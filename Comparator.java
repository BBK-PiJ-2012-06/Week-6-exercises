public class Comparator {
	public <T> T getMax(T number1, T number2) {
		double d1 = Double.parseDouble(number1);
		double d2 = Double.parseDouble(number2);
		
		return d1 > d2 ? d1 : d2;
	}
}
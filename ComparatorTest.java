public class ComparatorTest {
	public static void main(String[] args) {
		ComparatorTest ct = new ComparatorTest();
		ct.launch();
	}
	
	public void launch() {
		Comparator comp = new Comparator();
		int n, m;
		n = 3;
		m = 7;
		System.out.println( "Max of ints 3 and 7: " comp.getMax(n, m) );
		double p, q;
		p = 4.356;
		q = 8.66;
		System.out.println( "Max of doubles 4.356 and 8.66: " comp.getMax(p, q) );
		String s, t;
		s = "977.5";
		t = "12.67";
		System.out.println( "Max of Strings 977.5 and 12.67: " comp.getMax(s, t)  );
	}
}
public class ExtendedString extends String {
	public void printEven() {
		for(int i = 1; i<this.length(); i+=2) {
			System.out.print( this.charAt(i) );
		}
		System.out.print("\n");
	}
}
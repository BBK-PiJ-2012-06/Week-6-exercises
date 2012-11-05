public class Frog extends Amphibian {
public Frog() {
		species = "Frog";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Croak, ribbit" );
	}
}
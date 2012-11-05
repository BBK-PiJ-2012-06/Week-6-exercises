public class Pigeon extends Bird {
	public Pigeon() {
		species = "Pigeon";
		isAquatic = false;
		isFlying = true;
	}
	public void makeSound() {
		System.out.println( "Coo" );
	}
}
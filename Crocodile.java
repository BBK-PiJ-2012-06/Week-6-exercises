public class Crocodile extends Reptile {
	public Crocodile() {
		species = "Crocodile";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Roar!" );
	}
}
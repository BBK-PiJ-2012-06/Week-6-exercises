public class Bear extends Mammal {
	public Bear() {
		species = "Bear";
		isAquatic = false;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Roar!" );
	}
}
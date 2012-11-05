public class Dolphin extends Mammal {
	public Dolphin() {
		species = "Dolphin";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Squeak chatter (so long...)" );
	}
}
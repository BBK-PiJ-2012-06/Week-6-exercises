public class Whale extends Mammal {
	public Whale() {
		species = "Whale";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "OoooooWaaaahEee" );
	}
}
public class Monkey extends Mammal {
	public Monkey() {
		species = "Monkey";
		isAquatic = false;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "ook" );
	}
}
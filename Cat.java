public class Cat extends Mammal {
	public Cat() {
		species = "Cat";
		isAquatic = false;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Meow" );
	}
}
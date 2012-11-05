public class Dog extends Mammal {
	public Dog() {
		species = "Dog";
		isAquatic = false;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Bark woof yap" );
	}
}
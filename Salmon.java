public class Salmon extends Fish {
	public Salmon() {
		species = "Salmon";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Splash" );
	}
}
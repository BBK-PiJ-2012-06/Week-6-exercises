public class Shark extends Fish {
	public Shark() {
		species = "Shark";
		isAquatic = true;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Splash" );
	}
}
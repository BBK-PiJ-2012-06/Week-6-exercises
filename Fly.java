public class Fly extends Insect {
public Fly() {
		species = "Fly";
		isAquatic = false;
		isFlying = true;
	}
	public void makeSound() {
		System.out.println( "Buzzz..." );
	}
}
public class Beetle extends Insect {
public Beetle() {
		species = "Beetle";
		isAquatic = false;
		isFlying = true;
	}
	public void makeSound() {
		System.out.println( "Skrnkle, skrinkle..." );
	}
}
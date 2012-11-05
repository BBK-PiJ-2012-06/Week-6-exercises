public class Snake extends Reptile {
	public Snake() {
		species = "Snake";
		isAquatic = false;
		isFlying = false;
	}
	public void makeSound() {
		System.out.println( "Hisss..." );
	}
}
public class Reptile extends Animal {
	@Override
	public void reproduce() {
		layEggs();
	} 
	
	public void layEggs() {
		System.out.println( species + " is laying eggs..." );
	}
	
	public void makeSound() {}
}
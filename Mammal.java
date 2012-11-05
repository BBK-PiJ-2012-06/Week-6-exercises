public class Mammal extends Animal {
	@Override
	public void reproduce() {
		giveBirth();
	} 
	
	public void giveBirth() {
		System.out.println( species + " is giving birth..." );
	}
}
public abstract class Animal {
	private boolean isAquatic = false;
	private boolean isFlying = false;
	private String species;
	public void call() {
		if(isAquatic)
			System.out.println( species + " will not come...");
		else if(isFlying)
			System.out.println( species + " now flying, will come later when tired...");
		else
			System.out.println( species + " coming" );
	}
	public abstract void reproduce();
	public abstract void makeSound();
}
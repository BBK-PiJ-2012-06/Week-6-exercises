public class Guitar implements MusicalInstrument implements WoodenObject {
	private boolean isBroken = false;
	
	public void play() {
		if(!isBroken)
			System.out.println( "Strum, strum..." );
		else
			System.out.println( "Clunk, clunk..." );
	}
	
	public void burn() {
		System.out.println( "Your guitar is on fire!" );
		isBroken = true;
	}
}
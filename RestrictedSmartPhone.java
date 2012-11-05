public class RestrictedSmartPhone extends SmartPhone {
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	
	@Override
	private void playGame(String game);
	// this won't compile: cannot assign weaker access priveleges
}
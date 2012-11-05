public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher pl = new PhoneLauncher();
		pl.launch();
	}
	
	public void launch() {
		System.out.println( "Testing my new SmartPhone. How exciting..." );
		SmartPhone sp = new SmartPhone("Samsung");
		
		System.out.println( "\nLet's call some people:" );
		sp.call("07929210320");
		sp.call("07929210321");
		sp.call("07929210322");
		sp.call("07929210323");
		sp.call("07929210324");
		sp.call("07929210325");
		sp.call("07929210326");
		sp.call("07929210327");
		sp.call("07929210328");
		sp.call("07929210329");
		sp.call("07929210330");
		sp.call("00111212121");
		
		System.out.println( "\nLet's see who we just called:" );
		sp.printLastNumbers();
		
		System.out.println( "\nLet's set the alarm:" );
		sp.ringAlarm("14:45");
		
		System.out.println( "\nLet's play a game:" );
		sp.playGame("Angry Badgers");
		
		System.out.println( "\nLet's browse the web:" );
		sp.browseWeb("http://www.friendface.com");
		
		System.out.println( "\nLet's find our GPS position: " + sp.findPosition() );
	}
}
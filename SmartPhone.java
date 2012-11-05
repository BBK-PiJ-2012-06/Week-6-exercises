public class SmartPhone extends MobilePhone {
	public void browseWeb(Sring url) {
		System.out.println( "Loading " + url );
	}
	
	public String findPosition() {
		String gps = "This is a made up GPS position: 123456789";
		return gps;
	}
}
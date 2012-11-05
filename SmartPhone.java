public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand) {
		super(brand);
		lastNumbers = new ArrayBlockingQueue<String>(10);
	}
	
	@Override
	public void call(String number) {
		if( number.charAt(0) == '0' && number.charAt(1) == '0' ) {
			System.out.println( "Calling " + number + " through the internet to save money" );
			if( lastNumbers.size() != 10 ) {
			lastNumbers.add(number);
			}
			else {
			String delete = lastNumbers.poll();
			lastNumbers.add(number);
			}
		}
		else {
			super.call(number);
		}
	}
	
	public void browseWeb(String url) {
		System.out.println( "Loading " + url );
	}
	
	public String findPosition() {
		String gps = "This is a made up GPS position: 123456789";
		return gps;
	}
}
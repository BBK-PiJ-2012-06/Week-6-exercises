public class PhoneCaster {
	public static void main(String[] args) {
		PhoneCaster pc = new PhoneCaster();
		pc.launch();
	}
	
	public void launch() {
		MobilePhone myPhone = new SmartPhone("Nokia");
		SmartPhone mySmartPhone = (SmartPhone) myPhone;
		
		testPhone(myPhone);
		testPhone(mySmartPhone);
	}
	
	public void testPhone(Phone phone) {
		phone.call("07712334578");
		System.out.println("myPhone's brand is " + phone.getBrand());
		phone.printLastNumbers();
		phone.ringAlarm("08:00");
		phone.playGame("Angry Badgers");
		phone.browseWeb("www.friendface.com");
		phone.findPosition();
	}
}
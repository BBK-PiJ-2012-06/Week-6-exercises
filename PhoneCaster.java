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
		SmartPhone sphone = (SmartPhone) phone;
		sphone.call("07712334578");
		System.out.println("myPhone's brand is " + sphone.getBrand());
		sphone.printLastNumbers();
		sphone.ringAlarm("08:00");
		sphone.playGame("Angry Badgers");
		sphone.browseWeb("www.friendface.com");
		sphone.findPosition();
	}
}
public class PhoneCaster {
	public static void main(String[] args) {
		PhoneCaster pc = new PhoneCaster();
		pc.launch();
	}
	
	public void launch() {
		MobilePhone myPhone = new SmartPhone("Nokia");
		myPhone.call("07712334578");
		System.out.println("myPhone's brand is " + myPhone.getBrand());
		myPhone.printLastNumbers();
		myPhone.ringAlarm("08:00");
		myPhone.playGame("Angry Badgers");
		
		SmartPhone mySmartPhone = (SmartPhone) myPhone;
		mySmartPhone.browseWeb("www.friendface.com");
		mySmartPhone.findPosition();
	}
}
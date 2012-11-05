import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MobilePhone extends OldPhone {
	private Queue<String> lastNumbers;
	
	public MobilePhone(String brand) {
		super(brand);
		lastNumbers = new ArrayBlockingQueue<String>(10);
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		if( lastNumbers.size() != 10 ) {
			lastNumbers.add(number);
		}
		else {
			String delete = lastNumbers.poll();
			lastNumbers.add(number);
		}
	}
	
	public void printLastNumbers() {
		System.out.println( "Previous 10 numbers called: " + lastNumbers.toString() );
	}
	
	public void ringAlarm(String time) {
		System.out.println("It's " + time + ", wake up!");
	}
	
	public void playGame(String game) {
		System.out.println("Loading " + game);
	}
}
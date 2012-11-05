public class LecturerScript {
	public static void main(String[] args) {
		LecturerScript ls = new LecturerScript();
		ls.launch();
	}
	
	public void launch() {
		Lecturer l = new Lecturer("Bob Hoskins");
		System.out.println( "Lecturer's name: " + l.getName() );
		l.teach("Quantum Electrodynamics");
		l.doResearch("Dental hygeine of Tyrannosaurus Rex");
	}
}
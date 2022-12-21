class CTest extends Thread {
	private String id;
	public CTest(String str) {
		id = str;
	}
	public void run() {
		for (int i=1; i<=5; i++) {
			for (int j=0; j<100000000; j++);
			System.out.println(id + " " + i);
		}
	}
}

public class Class04 {
	public static void main(String args[]) {
		CTest str1 = new CTest("Hello");
		CTest str2 = new CTest("Good bye");
		CTest morning = new CTest("Good morning"); //create object
		str1.run();
		str2.run();
		morning.run(); // call run() using morning object
	}
}
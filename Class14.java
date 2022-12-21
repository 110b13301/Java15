class Prepaid extends Thread { //(a) create class extends Thread
	private static int sum = 200; //(a) balance
	public void run() {
		int fee;
		while (sum > 10) {
			fee = (int) (Math.random() * 100); //(b) randemly spawn fee
			talk(fee);
		}
	}
	public synchronized static void talk(int n) {
		int tmp = sum - n;
		try {
			sleep((int) (1000 * Math.random())); //(c) delay
		}
		catch (InterruptedException e) {
			
		}
		if (tmp > 10) {
			sum = tmp;
			System.out.println("通話費:" + n + "元");
			System.out.println("餘額    :" + sum + "元");
		}
	}
}
public class Class14 {
	public static void main(String[] args) {
		Prepaid p1 = new Prepaid();
		Prepaid p2 = new Prepaid();
		Prepaid p3 = new Prepaid();
		p1.start();
		p2.start();
		p3.start();
	}
}
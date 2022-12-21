import java.util.ArrayList;
class CTest {
	private int id;
	private int id2;
	public CTest(int str, int ss) {
		id=str;
		id2=ss;
	}
	public void run() {
		ArrayList<Integer> all=new ArrayList<>();
		int i, j;
		for (i=id; i<=id2; i++) { //calculate prime number
			for (j=2; j<i; j++) {
				if (i%j==0) {
					break;
				}
			}
			if (j==i) {
				all.add(i);
			}
		}
		System.out.println(id+"~"+id2+":"+all.size());
	}
}
public class Class16 {
	public static void main(String args[]) {
		CTest fir=new CTest(2, 100000);
		CTest sec=new CTest(100000, 200000);
		fir.run();
		sec.run();
	}
}
/*
2到100000的質數數量:9592 <- more than 100000~200000
100000到200000的質數數量:8392 <- faster than 2~100000
 */
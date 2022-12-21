class CTest extends Thread { //(a) create class extends Thread
    private String id; //(a) set id
    public CTest(String str) { //(a) set str
        id=str;
    }
    public void run() {
        for(int i=1;i<=5;i++) {
        	for(int j=0;j<100000000;j++); //(b)delay speed
            System.out.println(id+" "+i);
        }
    }
}

public class Class02 {
    public static void main(String args[]) {
        CTest str1=new CTest("Hello"); //(c) create object
        CTest str2=new CTest("Good bye"); //(c) create object
        str1.run();
        str2.run();
    }
}

/*(d)run result
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Good bye 1
Good bye 2
Good bye 3
Good bye 4
Good bye 5
*/
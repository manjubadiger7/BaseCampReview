
public class Test {
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}
	
	public static void ThreadStatus2() {
		System.out.println("Thread is running22222222...");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(Test::ThreadStatus2);
		t2.start();
	}
}

package thread;

public class Main {

	public static void main(String[] args) {
		MyThread myThread = new MyThread(20);
		
		myThread.start();

	}

}

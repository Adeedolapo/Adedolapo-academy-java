package thread;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main3_9 {

	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));
		
        // Create a t1 and t2 of MyThread class here.
		MyThread3_9 t1 = new MyThread3_9("T1", list);
		MyThread3_9 t2 = new MyThread3_9("T2", list);

        // Start t1 and t2 threads here
		t1.start();
		t2.start();

        // Run the join() method from t1 and t2 threads here
		t1.join();
		t2.join();

        // Print out the list variable here.
		System.out.println("list" + list);
	}

}

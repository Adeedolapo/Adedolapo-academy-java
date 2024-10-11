
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
	public List<Integer> list;
    // Create a constructor to initialize the above instance variable
    public MyThread(String name, List<Integer> list) {
        super(name);
        this.list = list;
    }
    
    // Override the run() method to call the printNumbers() methods.
    @Override
    public void run(){
    	ListUtils.insertNextId(list);
        
    }
}

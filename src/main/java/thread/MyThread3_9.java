package thread;

import java.util.List;
import java.util.Arrays;

public class MyThread3_9 extends Thread{
	
	public List <Integer> list;
	// Create a constructor to initialize the above instance variable
	
    public MyThread3_9(String name,List <Integer> list) {
    	super(name);
        this.list = list;
    }
    
    // Override the run() method to call the printNumbers() methods.
    @Override
    public void run(){
    	
    	ListUtils.insertNextId(list);
    }

}

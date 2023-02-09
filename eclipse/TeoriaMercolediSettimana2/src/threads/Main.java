package threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log=LoggerFactory.getLogger(ThreadTest.class);
		
		ThreadTest t1= new ThreadTest("primo");
		ThreadTest t2= new ThreadTest("secondo");
		
		t1.start();
		//t1.join();
		t2.start();
		
		
		
		
	}

}

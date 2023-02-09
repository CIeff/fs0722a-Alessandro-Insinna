package threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadTest extends Thread {
	
	private String message;
	Logger log=LoggerFactory.getLogger(ThreadTest.class);
	
	public ThreadTest(String msg) {
		this.message=msg;
	}
	
	@Override
	public void run() {	
		try {
		for(int i=0;i<20;i++) {
			log.info(message);
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	
}

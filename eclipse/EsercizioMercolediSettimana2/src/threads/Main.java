package threads;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log=LoggerFactory.getLogger(ThreadTest.class);
		
		ThreadTest t1= new ThreadTest("*");
		ThreadTest t2= new ThreadTest("#");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		int[] randArray= new int[3000];	
		caricaArray(randArray);
		System.out.println(Arrays.toString(randArray));
		//System.out.println(randArray[3000]);
		
		ThreadConta t11=new ThreadConta(randArray,0,999);
		t11.join();
		ThreadConta t12=new ThreadConta(randArray,1000,1999);
		t12.join();
		ThreadConta t13=new ThreadConta(randArray,2000,2999);	
		t13.join();
		
		int somma= t11.conta()+t12.conta()+t13.conta();
		System.out.println("Somma totale-> "+somma);
		
	}
	
	public static int[] caricaArray(int[] arr) {
		for(int x=0;x<arr.length;x++) {
			arr[x]=( (int) (Math.random()*99+1));
		}
		
		return arr;
	}

}

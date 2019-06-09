package Com;



class threadDemoPut implements Runnable {
	
	public int d=0;
	
	public void run() {
		System.out.println("This is a Thread");
	put();
	}
	
		
	void put() {
		try {
		for(int i=0; i<5; i++)
		{
		d += 1;
		System.out.println("This is a put:- "+ d);
		Thread.sleep(1000);
		}
	}
		catch(Exception e1) {
		System.out.println(e1);	
		}
	}
	
	
	}
		
class threadDemoGet implements Runnable {

	void get() {
		try {
		
		for(int i=0; i<5; i++)
		{
		System.out.println("This is a get:- ");
		Thread.sleep(1000);
		}
	}
		catch(Exception e2)
		{System.out.println(e2);
			}
		}
	
	public void run() {
		System.out.println("This is a Thread");
		get();
	}
}
	
	

public class SimpleThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadDemoPut t1 = new threadDemoPut();
		threadDemoGet t2 = new threadDemoGet();
		Thread t = new Thread(t1);
		Thread tt = new Thread(t2);
 t.start();
 try {Thread.sleep(100);} catch (InterruptedException e) {}
 tt.start();
 
	}

}

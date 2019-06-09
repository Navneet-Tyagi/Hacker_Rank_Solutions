package Com;

class Q
{
	int num=0;
	boolean valueset = false;
	
	public synchronized void put(int num)
	{
	while(valueset)
	{
		try {wait();}catch(Exception e) {}
	}
	this.num = num;
	System.out.println("Put:"+num);
	valueset = true;
	notify();
	}
	
	public synchronized void get() 
	{
		while(!valueset)
		{
			try {wait();}catch(Exception e) {}
		}
		System.out.println("Get:"+num);
	valueset=false;
	notify();
	}
	
}

class producer implements Runnable
{
	Q q;
	
	public producer(Q q){
		this.q = q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) 
		{
			q.put(i++);
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		
	}
}

class consumer implements Runnable
{
	Q q;
	
	public consumer(Q q){
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) 
		{
			q.get();
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
		
	}
}



public class MultiThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q q=new Q();
new producer(q);
new consumer(q);

	}

}

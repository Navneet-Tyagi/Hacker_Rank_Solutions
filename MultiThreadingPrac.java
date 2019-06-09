package Com;


class c{
	int num;
	boolean value = false;
	
	public synchronized void put(int num) {
		while(value)
		{
			try{wait();}catch(Exception e) {}
		}
		this.num = num;
		value = true;
		notify();
	}
	
	public synchronized void get()
	{
		while(!value)
		{
			try{wait();}catch(Exception e) {}
		}
		System.out.println(num);
		value = false;
		notify();
	}
}

class producers implements Runnable {
	c c;
	producers(c c){
		this.c = c;
	Thread t= new Thread(this,"Producer");
	t.start();
	}
	
	public void run() {
		int i=0;
		while(true)
		{
			c.put(i++);
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class consumers implements Runnable {
	c c;
	consumers(c c){
		this.c = c;
	Thread t= new Thread(this,"Consumer");
	t.start();
	}
	
	public void run() {
		int i=0;
		while(true)
		{
			c.get();
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}


public class MultiThreadingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c c=new c();

new producers(c);
new consumers(c);
	}

}

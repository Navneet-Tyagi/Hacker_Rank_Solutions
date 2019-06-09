package Com;

class test {
	int count=0;
	
synchronized void test () {
	count++;
	}
}

class testDemo implements Runnable {
	
	test t1 = new test();
	
	public void run() {
		for(int i=1; i<=100; i++) {
			t1.test();
		}
	}
}


/*public class demo {
	
	public static void main(String[] args) {
testDemo td = new testDemo();
Thread t3 = new Thread(td);
Thread t4 = new Thread(td);

		t3.start();
		t4.start();
		
		try {t3.join();
		t4.join();}
		catch(Exception e) {}
		
		System.out.print(td.t1.count);
		
}

	
	
}*/

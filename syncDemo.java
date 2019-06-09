package Com;

class testsync {
	int amt = 1000;
	synchronized void withdraw(int amt) {
		
		System.out.println("This is a withdraw");
		
		if(this.amt < amt) {
			System.out.println("Waiting for deposit");
			try{wait();

			} catch(Exception e) {}
			System.out.println("withdraw completed");
		}
	}
	
	synchronized void deposit(int amt) {
		System.out.println("This is a deposit");
		
		this.amt += amt;
		System.out.println("Deposit Completed");
		try{notify();} catch(Exception e) {}
	}
}

/*public class syncDemo {
	
	public static void main(String args[])
	{
		testsync t = new testsync();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				t.withdraw(15000);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				t.deposit(15000);
			}
		});
		
		t1.start();
		t2.start();
	}

}*/

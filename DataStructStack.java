package Com;

class stack {
	
	int val[] = new int[5];
	int top=0;
	
	void push(int data) {
		if(top>4)
		{
			System.out.println("Stack is full");
		}
		else
		{
		this.val[top] = data;
		top++;
		}
	}
	
	void pop() {
		if(top<=0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
		top--;
		int data = this.val[top];
		val[top] = 0;
		System.out.print(" "+data);
		}
	}
	
	int peek() {
		int d = this.val[top-1];
		return d;
	}
	
	void show() {
		for(int s: val)
		{
			System.out.print(s+" ");
		}
	}
}

public class DataStructStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stack stck = new stack();

stck.push(15);
stck.push(13);
stck.push(18);
stck.push(19);
stck.push(20);

//System.out.println(stck.peek());

stck.pop();
stck.pop();
stck.pop();
stck.pop();
stck.pop();
stck.pop();

System.out.println(" ");
stck.show();


		
	}

}

package Com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class qu {
	int data[] = new int[5];
	int tail;
	int head;
	int size;

	void enqueue(int val) {
		this.data[tail] = val;
		tail = (tail+1)%5;
		size += 1;
}

int dequeue() {
	int da = data[head];
	head = (head+1)%5;
	size -= 1;
	return da;
}

void show() {
	for(int i=0; i<size; i++)
	{
		System.out.print(data[(head+i)%5]+" ");
	}
}

}

public class DataStructQueue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	qu q=new qu();	
	
	q.enqueue(5);
	q.enqueue(3);
	q.enqueue(4);
	q.enqueue(1);
	q.enqueue(2);
	
	q.dequeue();
	q.dequeue();
	
	
	q.enqueue(9);
	q.enqueue(8);
	
	q.show();
	
	
		
	}

}

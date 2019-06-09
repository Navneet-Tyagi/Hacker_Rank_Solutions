package Com;

class Node{
	int data;
	Node next;
}

class LinkedListImplement{
	Node head;
	
	
	
	public void insert(int data) {
		Node n = new Node();
		n.data = data;
		
		if(head==null)
		{
			head = n;
		}
		else
		{
			Node n1 = head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next = n;
		}
	
	}
	
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
		System.out.println(node.data);
		node = node.next;
		}
		System.out.println(node.data);
	}
	
}

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedListImplement lkd = new LinkedListImplement();
lkd.insert(5);
lkd.insert(15);

lkd.show();
		
	}

}

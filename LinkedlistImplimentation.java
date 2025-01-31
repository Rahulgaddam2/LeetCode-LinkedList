package linkedList;

public class LinkedlistImplimentation {
	
	private Node head;
	private Node tail;
	int size;
	
	public LinkedlistImplimentation() {
		this.size =0;
	}
	public void insertfirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail=head;
		}
		
		size+=1;
	}
	
	public void insertlast(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = node;
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("end");
	}

	public void insert(int val,int index) {
		if(index == 0) {
			insertfirst(val);
			return;
		}
		if(index == size) {
			insertlast(size);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val,temp.next);
		temp.next = node;
		
		size++;
	}
	
	public int deletefirst() {
		int val = head.val;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
}

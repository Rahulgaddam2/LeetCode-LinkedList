package linkedList;


public class Leetcode19 {

	public static void main(String[] args) {
		
		
		Leetcode19 Object = new Leetcode19();
		
	    Node head = Object.new Node(6);
	    head.next = Object.new Node(7);
	    head.next.next = Object.new Node(8);
	    head.next.next.next = Object.new Node(9);
	    head.next.next.next.next = Object.new Node(10);
	    
	    

	 Node newhead = Object.removeNthFromEnd(head, 2);
	 
	 display(newhead);
	}
	public class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
		public Node(int val , Node next) {
			this.val = val;
			this.next= next;
		}
		

	}
	public Node removeNthFromEnd(Node head, int n) {
		Node dummy = new Node(-1);
		dummy.next = head;
		
		Node first = dummy;
		Node second = dummy;
		
		for(int i=0;i<n;i++) {
			second = second.next;
		}
		
		while(second.next != null) {
			first = first.next;
			second = second.next;
		}
		
		first.next = first.next.next;
		
		return dummy.next;
	}
	
	public static void display(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " ->");
			temp = temp.next;
		}
		System.out.println("End");
	}


}

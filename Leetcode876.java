package linkedList;


public class Leetcode876 {

	public static void main(String[] args) {
		
		Leetcode876 Object = new Leetcode876();
		
	    Node head = Object.new Node(1);
        head.next = Object.new Node(2);
        head.next.next = Object.new Node(3);
        head.next.next.next = Object.new Node(4);
        head.next.next.next.next = Object.new Node(5);
        
        head = Object.middleNode(head);
        
        display(head);
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
	public Node middleNode(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void display(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("end");
		
	}
}

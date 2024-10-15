package linkedList;

public class Leetcode92 {

	public static void main(String[] args) {

		Leetcode92 Object = new Leetcode92();
		
	    Node head = Object.new Node(1);
        head.next = Object.new Node(2);
        head.next.next = Object.new Node(3);
        head.next.next.next = Object.new Node(4);
        head.next.next.next.next = Object.new Node(5);
        
        head = Object.reverseBetween(head, 2, 4);
        
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
	public Node reverseBetween(Node head, int left, int right) {
		Node dummy = new Node(0);
		dummy.next = head;
		
		Node leftpre = dummy;
		Node currentnode = head;
		
		for(int i=0;i<left-1;i++) {
			leftpre = leftpre.next;
			currentnode = currentnode.next;
		}
		
		Node sublisthead = currentnode;
		Node previousnode = null;
		
		for(int i=0;i<=right-left;i++) {
			Node nextnode = currentnode.next;
			currentnode.next = previousnode;
			previousnode = currentnode;
			currentnode = nextnode;
		}
		
		leftpre.next = previousnode;
		sublisthead.next = currentnode;
		
		return dummy.next;
	}
	public static void display(Node head) {
		Node node = head;
		
		while(node != null) {
			System.out.print(node.val + " -> ");
			node = node.next;
		}
		System.out.println("END");
		
	}
		
}

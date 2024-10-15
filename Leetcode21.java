package linkedList;



public class Leetcode21 {

	public static void main(String[] args) {
		
		Leetcode21 Object = new Leetcode21();
		
		
		
	    Node list1 = Object.new Node(6);
	    list1.next = Object.new Node(7);
	    list1.next.next = Object.new Node(8);
	    list1.next.next.next = Object.new Node(9);
	    list1.next.next.next.next = Object.new Node(10);
	    
	    Node list2 = Object.new Node(1);
	    list2.next = Object.new Node(2);
	    list2.next.next = Object.new Node(3);
	    list2.next.next.next = Object.new Node(4);
	    list2.next.next.next.next = Object.new Node(5);
	    
	    Node head = Object.mergeTwoLists(list1, list2);
	    
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
	public Node mergeTwoLists(Node list1, Node list2) {
		Node result = new Node(-1);
		Node currentnode = result;
		
		
		Node first = list1;
		Node second = list2;
		
		while(first != null && second != null) {
			if(first.val <= second.val) {
				currentnode.next = first;
				first = first.next;
			}else {
				currentnode.next = second;
				second = second.next;
			}
			
			currentnode = currentnode.next;
		}
		
		if(first !=  null) {
			currentnode.next = first;
		}
		if(second != null) {
			currentnode.next = second;
		}
		
		return result.next;
	}
	public static void display(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}

}

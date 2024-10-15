package linkedList;

public class Leetcode160 {

	public static void main(String[] args) {
		
		Leetcode160 Object = new Leetcode160();
		
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
	    
	    Object.getIntersectionNode(list1, list2);
	    
	    System.out.println(Object.getIntersectionNode(list1, list2));
		

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
	 public Node getIntersectionNode(Node headA, Node headB) {
		 int lengthA = getlength(headA);
		 int lengthB = getlength(headB);
		 
		 while(lengthA > lengthB) {
			 lengthA--;
			 headA = headA.next;
		 }
		 
		 while(lengthB > lengthA) {
			 lengthB--;
			 headB = headB.next;
		 }
		 
		 while(headA != headB) {
			 headA = headA.next;
			 headB = headB.next;
		 }
		 return headA;
	 }
	 
	 public int getlength(Node headA) {
		 int length = 0;
		 Node current = headA;
		 
		 while(current != null) {
			 length++;
			 current = current.next;
		 }
		 return length;
	 }

}

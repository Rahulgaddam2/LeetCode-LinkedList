package linkedList;

public class Leetcode83 {

	public static void main(String[] args) {
			
		    Leetcode83 Object = new Leetcode83();
		
		    Node head = Object.new Node(1);
	        head.next = Object.new Node(1);
	        head.next.next = Object.new Node(2);
	        head.next.next.next = Object.new Node(3);
	        head.next.next.next.next = Object.new Node(3);
	        
	        Object.deleteDuplicates(head);
	        
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
	public Node deleteDuplicates(Node head) {
        Node node = head;

        while(node != null && node.next != null ){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
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

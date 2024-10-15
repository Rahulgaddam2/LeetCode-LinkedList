package linkedList;

public class Leetcode206 {

	public static void main(String[] args) {
		
		Leetcode206 Object = new Leetcode206();
		
		ListNode head = Object.new ListNode(1);
		
		head.next = Object.new ListNode(2);
		head.next.next = Object.new ListNode(3);
		head.next.next.next = Object.new ListNode(4);
		head.next.next.next.next = Object.new ListNode(5);
		
		head = Object.reversealinkedList(head);
		
		display(head);
	}
	
	class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val=val;
		}
		public ListNode(int val , ListNode next) {
			this.val = val;
			this.next= next;
		}
	}
	
	public ListNode reversealinkedList(ListNode head) {
		
		if(head == null) {
			return null;
		}
		
		if(head.next == null) {
			return head;
		}
		
		ListNode previousnode =  null;
		ListNode currentnode = head;
		
		while(currentnode != null) {
			ListNode nextnode = currentnode.next;
			currentnode.next = previousnode;
			previousnode = currentnode;
			currentnode = nextnode;
		}
		
		head = previousnode;
		return head;
	}
	
	public static void display(ListNode head) {
		ListNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
			
		}
		System.out.println("null");
	}
	

}

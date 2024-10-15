package linkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedlistImplimentation list = new LinkedlistImplimentation();
		
		list.insertfirst(3);
		list.insertfirst(4);
		list.insertfirst(5);
		
		list.insertlast(10);
		list.insert(15, 1);
		list.display();
		list.deletefirst();

	}

}

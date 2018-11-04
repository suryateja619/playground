/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */
public class DoubleLinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		Node prev;
		
		public Node(int d) {
			data = d;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		if (head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("Previous Node can't be null. Please send the corrct previous node");
			return;
		}
		
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		
		if (new_node.next != null) {
			new_node.next.prev = new_node;
		}
	}
	
	public void insertBefore(Node current_node, int new_data) {
		if (current_node == null) {
			System.out.println("Previous Node can't be null. Please send the corrct previous node");
			return;
		}
		
		Node new_node = new Node(new_data);
		new_node.prev = current_node.prev;
		new_node.next = current_node;
		if (current_node.prev != null) {
			current_node.prev.next = new_node;
		}
		current_node.prev = new_node;
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		}
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = new_node;
		new_node.prev = last;
	}
	
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		if (temp != null && temp.data == key) {
			head = temp.next;
			temp.prev = null;
			return;
		}
		
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if (prev == null) return;
		
		prev.next = temp.next;
		temp.next.prev = prev;
	}
	
	public void printList() {
		Node n = head;
		Node last = null;
		System.out.println("Traversal in forward direction");
		while(n != null) {
			System.out.println(n.data + " ");
			last = n;
			n = n.next;
		}
		System.out.println("Traversal in reverse direction");
		while(last != null) {
			System.out.println(last.data + " ");
			last = last.prev;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList list = new DoubleLinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.prev = list.head;
		second.next = third;
		third.prev = second;
		list.push(5);
		list.insertAfter(second, 7);
		list.insertBefore(third, 4);
		list.append(9);
		list.deleteNode(7);
		list.printList();
		
	}

}

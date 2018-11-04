/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */
public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
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
	}
	
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if (prev == null) return;
		
		prev.next = temp.next;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next = third;
		list.push(5);
		list.insertAfter(second, 7);
		list.append(9);
		list.deleteNode(7);
		list.printList();
		
	}

}

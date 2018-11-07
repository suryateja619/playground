import java.util.NoSuchElementException;

/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */
public class QueueLinkedList<T> {
	
	static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		QueueNode(T data) {
			this.data = data;
		}
	}
		
	private QueueNode<T> first, last;
	
	public void add(T value) {
		QueueNode<T> node = new QueueNode<T> (value);
		if (last != null) {
			last.next = node;
		}
		last = node;
		if (first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if (first == null) throw new NoSuchElementException();
		T data = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if (first == null) throw new NoSuchElementException();
		return first.data;
	}
	
	public Boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<Integer> list = new QueueLinkedList<Integer>();
		System.out.println("Is the stack empty ==> " + list.isEmpty());
		list.add(4);
		list.add(3);
		System.out.println("Removed item is " + list.remove());
		list.add(5);
		System.out.println("Top of the stack is "+ list.peek());
		System.out.println("Is the stack empty ==> " + list.isEmpty());

	}

}

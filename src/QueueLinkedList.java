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
		QueueNode<T> node = new QueueNode(value);
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
		T data = first.data;
		return data;
	}
	
	public Boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

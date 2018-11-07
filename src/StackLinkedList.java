import java.util.EmptyStackException;

/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */
public class StackLinkedList<T> {
	
	static class StackNode<T> {
		private T data;
		private StackNode <T> next;
	
		public StackNode(T data) {
			this.data = data;
		}
	}
	
	private StackNode <T> top;
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T value) {
		StackNode<T> node = new StackNode<T>(value);
		node.next = top;
		top = node;
	}
	
	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public Boolean isEmpty() {
		return top == null;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList<Integer> list = new StackLinkedList<Integer>();
		list.push(5);
	}

}

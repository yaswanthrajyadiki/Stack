class LinkedListStack<T> {
	Node<T> bottom;
	Node<T> top;
	MyStack() {
		bottom = new Node<T>();
		top = new Node<T>();
	}
	
	public void push(T element) {
		Node<T> newNode = new Node<T>();
		newNode.setElement(element);
		if (bottom == null) {
			bottom = newNode;
			top = newNode;
		} else { 
		    newNode.setNextElement(top);
		    top = newNode;
		}
	}
	
	public void pop() {
		Node<T> nextNode = top.getNextElement();
		top = nextNode;
	}

	public T getTop() {
		if (isEmpty()) {
			return null;
		}
		return top.getElement();
	}

	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	public void print() {
		Node<T> printNode = top;
		if (!isEmpty()) {
			while (printNode.getElement() != null){
				System.out.println(printNode.getElement());
				printNode = printNode.getNextElement();
			}
		} else {
			System.out.println("Stack is empty");
		}
		
	}

	public static void main(String[] args) {
		LinkedListStack<Integer> myStack1 = new LinkedListStack<Integer>();
		myStack1.push(1);
		myStack1.push(2);
		myStack1.push(3);
		myStack1.push(4);
		myStack1.push(5);
		myStack1.push(6);
		myStack1.pop();
		System.out.println(myStack1.getTop());
		myStack1.print();
	}
}
class Node<T> {
	T element;
	Node<T> nextElement;

	public void setElement(T element) {
		this.element = element;
	}

	public T getElement() {
		return this.element;
	}

	public void setNextElement(Node<T> nextElement) {
		this.nextElement = nextElement;
	}

	public Node<T> getNextElement() {
		return this.nextElement;
	}
}
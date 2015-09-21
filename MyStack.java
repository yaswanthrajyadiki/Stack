@SuppressWarnings("unchecked")
class MyStack<T> implements StackADT<T> {
	T[] stack;
	int top;
	int size;
	MyStack (int size) {
		this.size = size;
		stack = (T[]) new Object[size];
		top = -1; 
	}

	public void push(T element) {
		if (top < size - 1) {
			top++;
			stack[top] = element;			
		} else {
			System.out.println("Overflow");
		}
	}

	public void pop() {
		if (!isEmpty()) {
			top--;
		} else {
			System.out.println("Underflow");
		}		
	}

	public T getTop() {
		return stack[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void print() {
		if (!isEmpty()) {
			for (int i = 0; i < top + 1; i++) {
				System.out.println(stack[i]);
			}			
		} else {
			System.out.println("Underflow");
		}
	}

	public static void main(String[] args) {
		MyStack<Integer> newStack = new MyStack<Integer>(5);
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.push(4);
		newStack.push(5);
		newStack.push(6);
		newStack.pop();
		System.out.println(newStack.getTop());
		System.out.println(newStack.isEmpty());
		newStack.print();
	}
}
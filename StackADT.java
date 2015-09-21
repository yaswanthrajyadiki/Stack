interface StackADT<T> {
	void push(T element);
	void pop();
	T getTop();
	boolean isEmpty();
}
package hw3;

public interface Queue<E> {

	int size();

	boolean isEmpty();

	void enqueue(E e) throws IllegalStateException;

	E dequeue();

	E first();

}

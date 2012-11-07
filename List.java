public interface List<T> {
	int size();
	void add(T newElement);
	boolean delete(T element);
	T getValue(int index);
	T getFirst();
	T getLast();
	ListElement<T> getFirstElement();
	ListElement<T> getLastElement();
}
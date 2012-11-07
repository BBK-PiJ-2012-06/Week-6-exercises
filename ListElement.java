public class ListElement<T> {
	private T value;
	private ListElement<T> nextElement;
	private ListElement<T> prevElement;
	
	public ListElement(T value) {
		this.value = value;
		nextElement = null;
		prevElement = null;
	}
	
	public T getValue() {
		return value;
	}
	
	public ListElement<T> getNext() {
		return nextElement;
	}
	
	public ListElement<T> getPrev() {
		return prevElement;
	}
	
	public void setNext(ListElement<T> next) {
		nextElement = next;
	}
	
	public void setPrev(ListElement<T> prev) {
		prevElement = prev;
	}
}
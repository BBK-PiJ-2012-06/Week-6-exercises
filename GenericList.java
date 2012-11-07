public class GenericList<T> implements List<T> {
	private int size;
	private ListElement<T> firstElement;
	private ListElement<T> lastElement;
	private ListElement<T> iterator;
	
	public GenericList() {
		firstElement = null;
		lastElement = null;
		size = 0;
		iterator = null;
	}	
	
	public int size() {
		return size;
	}
	
	public T getFirst() {
		return firstElement.getValue();
	}
	
	public T getLast() {
		return lastElement.getValue();
	}
	
	public ListElement<T> getFirstElement() {
		return firstElement;
	}
	
	public ListElement<T> getLastElement() {
		return lastElement;
	}

	public T getValue(int index) {
		iterator = firstElement;
		for(int i=0; i!=index; i++) {
			if(!cycleForwards()) {
				System.out.println("Index out of bounds");
				return null;
			}
		}
		return iterator.getValue();
	}
	
	private boolean cycleForwards() {
		if( iterator.getNext() != null ) {
			iterator = iterator.getNext();
			return true;
		}
		else 
			return false;
	}
	
	private boolean cycleBackwards() {
		if( iterator.getPrev() != null ) {
			iterator = iterator.getPrev();
			return true;
		}
		else 
			return false;
	}
	
	public void add(T newValue) {
		if(firstElement == null) {
			// must be first element
			firstElement = new ListElement<T>(newValue);
			lastElement = firstElement;
		}
		else {
			// go to last element in the list
			ListElement<T> newElement = new ListElement<T>(newValue);
			lastElement.setNext( newElement );
			newElement.setPrev( lastElement );
			lastElement = newElement;
		}
		size++;
	}
	
	public boolean delete(T value) {
		// check first and last elements
		if(firstElement.getValue() == value) {
			firstElement = firstElement.getNext();
			firstElement.setPrev(null);
			return true;
		}
		if(lastElement.getValue() == value) {
			lastElement = lastElement.getPrev();
			lastElement.setNext(null);
			return true;
		}
		iterator = firstElement;
		do{
			if(iterator.getValue() == value) {
				iterator.getNext().setPrev(iterator.getPrev());
				iterator.getPrev().setNext(iterator.getNext());
				return true;
			}
		} while(cycleForwards());
		return false;
	}
}
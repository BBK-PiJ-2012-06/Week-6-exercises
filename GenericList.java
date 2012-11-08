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
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public T getFirst() {
		return firstElement.getValue();
	}
	
	@Override
	public T getLast() {
		return lastElement.getValue();
	}
	
	public ListElement<T> getFirstElement() {
		return firstElement;
	}
	
	public ListElement<T> getLastElement() {
		return lastElement;
	}

	@Override
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
	
	@Override
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
	@Override
	public boolean delete(int index) {
		if(index == 0) {
			firstElement = firstElement.getNext();
			firstElement.setPrev(null);
			size--;
			return true;
		}
		if(index == size-1) {
			lastElement = lastElement.getPrev();
			lastElement.setNext(null);
			size--;
			return true;
		}
		iterator = firstElement;
		for(int i=0; i!=index; i++) {
			if(!cycleForwards()) {
				System.out.println("Index out of bounds");
				return false;
			}
		}
		iterator.getNext().setPrev(iterator.getPrev());
		iterator.getPrev().setNext(iterator.getNext());
		size--;
		return true;
	}
	@Override
	public boolean delete(T value) {
		// check first and last elements
		if(firstElement.getValue() == value) {
			firstElement = firstElement.getNext();
			firstElement.setPrev(null);
			size--;
			return true;
		}
		if(lastElement.getValue() == value) {
			lastElement = lastElement.getPrev();
			lastElement.setNext(null);
			size--;
			return true;
		}
		iterator = firstElement;
		do{
			if(iterator.getValue() == value) {
				iterator.getNext().setPrev(iterator.getPrev());
				iterator.getPrev().setNext(iterator.getNext());
				size--;
				return true;
			}
		} while(cycleForwards());
		return false;
	}
}
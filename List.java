/**
 * A List is a dynamic generic structure that can contain any number
 * elements of type T.
 *
 * New elements can be added to the end of the list, or deleted from 
 * anywhere in the list.
 */
public interface List<T> {
	/**
	 * Get the size of the list.
	 *
	 * @return the size of the list
	 */
	int size();
	
	/**
	 * Add a new element of type T to the end of the list.
	 *
	 * @param the new element to add
	 */
	void add(T newElement);
	
	/**
	 * Deletes the first element found who's value is equal to the parameter given;
	 * returns true if successfully deleted, false if no element is found with the given value.
	 * 
	 * @param the value to be deleted
	 * @return true if delete successful, false otherwise
	 */
	boolean delete(T value);
	
	/**
	 * Deletes the element at a given position in the list; returns true if 
	 * successfully deleted, false if unsuccessful (i.e. the index is out of bounds).
	 * 
	 * @param the index of the element to be deleted
	 * @return true if delete successful, false otherwise
	 */
	boolean delete(int index);
	
	/**
	 * Finds the element at a given postition and returns its value.
	 *
	 * @param the position of the element whose value is to be returned
	 * @return the value of the element at index
	 */
	T getValue(int index);
	
	/**
	 * Returns the value of the first element in the list.
	 *
	 * @return the first element's value
	 */
	T getFirst();
	
	/**
	 * Returns the value of the last element in the list.
	 *
	 * @return the last element's value
	 */
	T getLast();
}
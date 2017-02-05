package ku.util;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayIterator work as a Iterator for array, its contain 3 method next, hasNext, and remove.
 * @author Tharit Pongsaneh
 * @param <T> name give to the array by the user
 */

public class ArrayIterator<T> implements Iterator<T>  {

	/** attribute for the array we want to iterate over */

	private T[ ] array;

	/** attribute for the current cursor that are pointing now */

	private int cursorpoint;

	/** attribute boolean that used for checking either it can do remove method or not */

	private boolean canremove;

	/**
	 * Initialize a new array iterator with the array to process.
	 * @param array is the array to iterate over
	 */

	public ArrayIterator( T[] array ) {
		this.array = array;
		this.canremove = false;
		this.cursorpoint = 0;	
	}

	/**
	 * Return the next non-null element from array, if any.
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException if there are no more elements
	 *        to return.
	 */

	public T next( ) {
		if( this.hasNext() == true ){
			this.cursorpoint++;
			this.canremove = true;
			return this.array[cursorpoint - 1];
		}
		else throw new NoSuchElementException();
	}

	/**
	 * Check that the array is not empty
	 */

	@Override
	public boolean hasNext( ) {
		for( int i = this.cursorpoint ; i < this.array.length ; i++ ){
			if( this.array[i] != null ){
				this.cursorpoint = i;
				return true;
			}
		}
		return false;	
	}

	/**
	 * Remove most recent array by setting it null, it can be called after the method next is called
	 * if it called without calling method next or being called more than once it going to throw 
	 * IllegalStateException
	 */

	public void remove( ) {
		if( this.canremove == true ){
			this.array[ cursorpoint-1 ] = null;
			this.canremove = false;
		}
		else throw new IllegalStateException();
	}

}
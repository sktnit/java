package Sequence;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenList<T> implements Iterable<T> {
	private List<T> list;
	
	EvenList(List<T> list) {
		this.list = list;
	}
	
	public Iterator<T> iterator() {
		return new EvenIterator<T>();
	}
	
	@SuppressWarnings("hiding")
	private class EvenIterator<T> implements Iterator<T> {
		int size = list.size();
		int currentPointer = 0;
		
		public boolean hasNext(){
			return (currentPointer < size);
		}
		
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			@SuppressWarnings("unchecked")
			T val = (T) list.get(currentPointer);
			currentPointer += 2;

			return val;
		}
	}
}


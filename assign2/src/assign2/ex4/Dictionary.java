package assign2.ex4;

import java.util.ArrayList;
import java.util.List;

public class Dictionary<Tuple> {
	private List<Tuple> list = new ArrayList<Tuple>();
	private int size = 0;
	
	public void addEntry(Tuple t) {
		list.add(t);
		size++;
	}
	
	public void removeEntry(Tuple t) {
		list.remove(t);
		size--;
	}
	
	public int getSize() {
		return size;
	}
	
	public Tuple getItem(int i) {
		return list.get(i);
	}

	public boolean isEmpty() {
		return size == 0;
	}
}

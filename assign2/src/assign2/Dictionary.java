package assign2;

import java.util.ArrayList;
import java.util.List;

public class Dictionary<Tuple> {
	private List<Tuple> list = new ArrayList<Tuple>();
	
	public void addEntry(Tuple t) {
		list.add(t);
	}
	
	public void removeEntry(Tuple t) {
		list.remove(t);
	}
}

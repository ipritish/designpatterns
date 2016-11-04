package designpatterns.iterator.inbuilt;

import java.util.Iterator;

public interface Menu {
	
	public Iterator<MenuItem> createIterator();
}

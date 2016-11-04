package designpatterns.iterator.custom;

public class DinerMenuIterator implements Iterator{

	MenuItem[] items;
	int position;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position]  == null){
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	
	

}

public class ArrayList implements List {
	private Object[] arr; 
	private int size; 

	public ArrayList() {
		arr = new Object[10]; 
		size = 0; 
	}

	public void add(Object obj) {
		if (size == arr.length) {
			grow_array(); 
		}
		arr[size] = obj; 
		size++; 
	}

	public void add(int pos, Object obj) {
		if (size == arr.length) {
			grow_array(); 
		}
		for (int i = size; i > pos; i--) {
			arr[i] = arr[i - 1]; 
		}
		arr[pos] = obj; 
		size++; 
	}

	public Object remove(int pos) {
		Object obj = arr[pos]; 
		for (int i = pos; i < size - 1; i++) {
			arr[i] = arr[i + 1]; 
		}
		size--; 
		return obj; 
	}

	public Object get(int pos) {
		return arr[pos]; 
	}

	public int size() {
		return size; 
	}

	private void grow_array() {
		Object[] newArr = new Object[arr.length * 2]; 
		for (int i = 0; i < size; i++) {
			newArr[i] = arr[i]; 
		}
		arr = newArr; 
	}
}
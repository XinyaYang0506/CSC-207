
public class Option<T>{

	private T value;
	
	private boolean hasValue;
	
	public Option() {
		value = null;
		hasValue = false;
	}
	public Option(T value) {
		this.value = value;
		hasValue = true; 
	}
	public boolean isEmpty() {
		return !hasValue;
	}
	public T getValue() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		else {
			return value;
		}
	}
}


public class TestCounter {
	public static void main (String[] args) {
		int a = 7;
		Counter2.increment(6);
		System.out.println(a);
		Counter1 test = new Counter1(0);
		Counter1.increment();
		System.out.println(test.value);
	}
}

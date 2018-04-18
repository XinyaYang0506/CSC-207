
public class Program {
public static void main (String[] args) {
	Option<Integer> o1 = new Option<>();
	Option<Integer> o2 = new Option<>(5);
	System.out.println(o2.getValue());
}
}

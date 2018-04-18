public class Program{
	public static void change1(int x ) {
		x = 5;
	}
	public static void change2(Cell c) {
		c.x = 5;
	}
	public static void change3(Cell c) {
		System.out.println(c);
		c.x = 5;
		System.out.println(c);
		c = new Cell(0);
	
	}
	
	public static void main (String[] args) {
		 int a = 71;
		 Cell c = new Cell(50);
		 
		 change1(a);
		 System.out.println(a);
		 
		change2(c);
		System.out.println(c.x);
		 
		System.out.println(c);
		change3(c);
		System.out.println(c);
		System.out.println(c.x);
		
	}
}
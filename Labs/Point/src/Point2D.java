
public class Point2D {
	public int x;
	public int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D () {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D add(int dx, int dy) {
		Point2D added = new Point2D();
		added.x = this.x + dx;
		added.y = this.y + dy;
		return added;
	}
	
	public void translate(Point2D point) {
		this.x = this.x + point.x;
		this.y = this.y + point.y;
	}
	
	public double distance(int x, int y) {
		double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		return distance;
	}
	
	public String toString() {
		String point = new String();
		point = point.concat("(" + String.valueOf(this.x) + "," + String.valueOf(this.y) + ")");
		return point;
	}
	
	
	public static void main(String[] args) {
		Point2D origin = new Point2D();
		Point2D second = new Point2D(5,3);
		System.out.println(origin.add(1, 2));
		System.out.println(origin.distance(3, 4));
		origin.translate(second);
		System.out.println(origin);
		
	}
}

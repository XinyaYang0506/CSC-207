import java.util.Scanner;

public class fizzbuzz {
	
	public static void fizz(String response) {
		for (int i = 0; i <= Integer.parseInt(response); i++){
			if ((i % 3 == 0) && (i % 5 == 0))
			System.out.println("fizzbuzz");
			else if (i % 3 == 0)
				System.out.println("fizz");
			else if (i % 5 == 0)
				System.out.println("fuzz");
			else
				System.out.println(i);
	}
	}
		
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String res = in.nextLine();
		fizz(res);
		}
}

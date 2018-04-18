
public class StringExercises {
	public static String intersperse(String[] arr) {
		String s= "";
		for (int i = 0; i < (arr.length - 1); i++) {
			s = s.concat(arr[i]);
			s = s.concat(",");
		}
		s = s.concat(arr[arr.length - 1]);
		return s;
	}
	
	public static boolean forgivingPrompt(String question) {
		while (true) {
			
		if (question.equalsIgnoreCase("Y") ||
			question.equalsIgnoreCase("Yes") ||
			question.equalsIgnoreCase("Yep")) {
			return true;
		} 
		else if
			(question.equalsIgnoreCase("N") ||
			 question.equalsIgnoreCase("No") ||
			 question.equalsIgnoreCase("Nope")) {
			return false;
		}
		else {
			System.out.println("Reply either positively/negatively");
		//scan new string and save it to question
		}}
	}
	
	public static void main(String[] args) {
		String[] arr = new String[] {"ab", "cd"};
		String test = intersperse(arr);
		System.out.println(test);
		forgivingPrompt("Ya");
	}
}

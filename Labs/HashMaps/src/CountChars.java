import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountChars {

	public static void main (String[] args) throws FileNotFoundException {
		File input = new File("book.txt");
		Scanner in = new Scanner(input);
		TreeSet<Character> chars = new TreeSet<>();
		
		while (in.hasNext()) {
			in.useDelimiter("");
			chars.add((Character)in.next().charAt(0));
		}
		
		
		System.out.println("There are " + chars.size() + " unique characters in Republic.");
		System.out.print("There are: ");
		for (Character i : chars) {
			System.out.print(i + ":" + (int)i + " ");
		}
		in.close();
		
		in = new Scanner(input);
		int occurences[] = new int[(int)chars.last()];
		while (in.hasNext()) {
			in.useDelimiter("");
			Character c = (Character)in.next().charAt(0);
			occurences[(int)c-1]++;
		}
		in.close();
		
		System.out.println("Occurences of each character:");
		for (int i=0; i<occurences.length; i++) {
			if (occurences[i] != 0) {
				System.out.println((char)i + ":" + occurences[i]);
			}
		}
	}
	
	public static TreeSet<Character> countUniqueChars (File input) throws FileNotFoundException {
		Scanner in = new Scanner(input);
		TreeSet<Character> chars = new TreeSet<>();
		
		while (in.hasNext()) {
			in.useDelimiter("");
			chars.add((Character)in.next().charAt(0));
		}
		in.close();
		
		return chars;
	}
	
	public static int[] countOccurences (File input, int length) throws FileNotFoundException {
		Scanner in = new Scanner(input);
		int occurences[] = new int[length];
		while (in.hasNext()) {
			in.useDelimiter("");
			Character c = (Character)in.next().charAt(0);
			occurences[(int)c-1]++;
		}
		in.close();
		
		System.out.println("Occurences of each character:");
		for (int i=0; i<occurences.length; i++) {
			if (occurences[i] != 0) {
				System.out.println((char)(i+1) + ":" + occurences[i]);
			}
		}
		return occurences;
	}
}

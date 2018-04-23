import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterCounter {
	private PairSpecial letterMap[];

	public LetterCounter() {
		this.letterMap = new PairSpecial[100] ;
	}

	boolean hasKey(char ch) {
		PairSpecial current = letterMap[((int)ch) % 100];
		while (current != null) {
			if (current.entry == ch) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void put(char ch, int v) {
		PairSpecial cur = letterMap[((int)ch) % 100];
		boolean check = false;
		while (cur.next != null) {
			if (cur.next.entry == ch) {
				cur.next.count = v;
				check = true;
			} else {
				cur = cur.next;
			}
		}
		if (check == false) {
			cur.next = new PairSpecial(ch, v);
		}

	}

	public void increment(char ch) {
		//compute the index
		PairSpecial cur = letterMap[((int)ch) % 100];
		boolean check = false;
		if (cur != null) {
			if (cur.entry == ch) {
				cur.count = cur.count+1;
				check = true;
			}

			while (cur.next != null) {
				if (cur.entry == ch) {
					cur.count = cur.count+1;
					check = true;
				}
				cur = cur.next;

			}

			if (check == false) {
				cur.next = new PairSpecial(ch, 1);
			}
		} else {
			letterMap[((int)ch) % 100] = new PairSpecial(ch, 1);
		}

	}


	public int get(char ch) throws IllegalArgumentException{
		PairSpecial cur = letterMap[((int)ch) % 100];
		while (cur != null) {
			if (cur.entry == ch) {
				return cur.count;
			}
			cur = cur.next;
		}
		throw new IllegalArgumentException();
	}

	public static void main(String[] args) throws FileNotFoundException {
		LetterCounter letter = new LetterCounter();
		File input = new File("test.txt");
		Scanner in = new Scanner(input);

		while (in.hasNext()) {
			in.useDelimiter("");
			letter.increment(in.next().charAt(0));
		}
		for (int i = 0; i < 100; i++) {
			for (PairSpecial cur = letter.letterMap[i]; cur != null; cur = cur.next) {
				System.out.println(cur.entry + " : " + cur.count);
			}
		}
		in.close();

	}


}

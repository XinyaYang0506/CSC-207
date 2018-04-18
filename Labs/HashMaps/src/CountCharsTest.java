import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;


import org.junit.Test;

public class CountCharsTest {

	@Test
	public void testCountUniqueChars() throws FileNotFoundException {
		File input = new File("test.txt");
		TreeSet<Character> output = CountChars.countUniqueChars(input);
		assertEquals(output.size(), 6);
		Character expected = 'a';
		for (Character c : output) {
			assertEquals(c, expected);
			expected++;
		}
	}
	
	@Test
	public void testCountOccurences() throws FileNotFoundException {
		File input = new File("test.txt");
		TreeSet<Character> set = CountChars.countUniqueChars(input);
		int output[] = CountChars.countOccurences(input, (int)set.last());
		assertEquals(output.length, 102);
		for (int i =0; i < 96; i++) {
			assertEquals(output[i], 0);
		}
		for (int i =96; i < 102; i++) {
			assertEquals(output[i], 1);
		}
	}
}

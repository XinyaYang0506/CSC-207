import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.stream.Stream;

import org.junit.Test;

public class FilterTest {

	@Test
	public void test() {
		LinkedList<Integer> score = new LinkedList<>();
		score.add(80);
		score.add(75);
		score.add(100);
		Stream<Integer> outcome = Filter.scores(score); 
		outcome.forEach(s -> System.out.println(s));
	} 
	@Test
	public void test2() {
		LinkedList<Double> reading = new LinkedList<>();
		reading.add(.4);
		reading.add(.2);
		reading.add(.8);
		Stream<Double> outcome2 = Filter.readings(reading); 
		outcome2.forEach(s -> System.out.println(s));
	}
	
	@Test
	public void test3() {
		LinkedList<String> name = new LinkedList<>();
		name.add("Xinya");
		name.add("Jamieadfgafdga");
		Stream<String> outcome3 = Filter.names(name); 
		outcome3.forEach(s -> System.out.println(s));
	}

}

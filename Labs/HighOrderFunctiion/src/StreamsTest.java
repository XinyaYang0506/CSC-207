import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;


public class StreamsTest {

	@Test
	public void test() {
		LinkedList<Integer> score = new LinkedList();
		score.add(80);
		score.add(75);
		score.add(100);
		Stream<Double> outcome = Streams.scores(score); 
		outcome.forEach(s -> System.out.println(s));
	} 
	@Test
	public void test2() {
		LinkedList<Double> reading = new LinkedList<>();
		reading.add(.4);
		reading.add(.2);
		reading.add(.8);
		Stream<Double> outcome2 = Streams.readings(reading); 
		outcome2.forEach(s -> System.out.println(s));
	}
	
	@Test
	public void test3() {
		LinkedList<String> name = new LinkedList<>();
		name.add("Xinya");
		name.add("Jamie");
		Stream<String> outcome3 = Streams.names(name); 
		outcome3.forEach(s -> System.out.println(s));
	}
}

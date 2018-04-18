import java.util.LinkedList;
import java.util.stream.Stream;

public class Streams {
	
	public static Stream<Double> scores(LinkedList<Integer> list){
		Stream<Integer> score = list.stream();
		Stream<Double> score2 = score.map(s -> s/100.0);
		
		return score2; 
	}
	
	public  static Stream<Double> readings(LinkedList<Double> list){
		Stream<Double> reading = list.stream();	
		Stream<Double> reading2 = reading.map(s -> s+.025);
		
		return reading2;
	}
	
	public static Stream<String> names(LinkedList<String> list){
		Stream<String> names = list.stream();	
		Stream<String> names2 = names.map(s -> s.substring(0, 1));
		
		return names2;
	}
}

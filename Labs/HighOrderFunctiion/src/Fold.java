import java.util.LinkedList;
import java.util.stream.Stream;

public class Fold {

	public static Stream<Integer> scores(LinkedList<Integer> list){
		Stream<Integer> score = list.stream();
		Stream<Integer> score2 = score.reduce();
		
		return score2; 
	}
	
	public static Stream<Double> readings(LinkedList<Double> list){
		Stream<Double> reading = list.stream();	
		Stream<Double> reading2 = reading.filter(s -> s > .0001);
		
		return reading2;
	}
	
	public static Stream<String> names(LinkedList<String> list){
		Stream<String> names = list.stream();	
		Stream<String> names2 = names.filter(s -> s.length() > 10);
		
		return names2;
	}
}

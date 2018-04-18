
import java.util.LinkedList;
import java.util.List;

public class Map {

	
	public List<Double> scores(LinkedList<Integer> list){
		List<Double> myList = new LinkedList<Double>(); 
		
		for(int i=0; i< list.size(); i++) {
			myList.add((double)list.get(i)/100); 
		}
		
		return myList; 
	}
	
	public List<Double> readings(LinkedList<Double> list){
		List<Double> myList = new LinkedList<Double>(); 
		
		for(int i=0; i< list.size(); i++) {
			myList.add((double)list.get(i) + .025); 
		}
		
		return myList; 
	}
	
	public List<Character> names(LinkedList<String> list){
		List<Character> myList = new LinkedList<>(); 
	
		
		for(int i=0; i< list.size(); i++) {
			myList.add(list.get(i).charAt(0)); 
		}
		
		return myList; 
	}
	
}

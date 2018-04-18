package Lab;

public abstract class Employee {
	  protected String name;
	  protected String id;
	
	  public String getName() {
		  return name; 
	  }
	    public String getId() {
	    	return id; 
	    }
	    public abstract int getSalary();
	    public abstract String makeWorkNoise();
}

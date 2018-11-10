package lambdaExpressions;

public interface MyNum {
		
	
	double getValue();
	default void print() {
		System.out.println(this.getValue());
	}

}

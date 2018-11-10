package Exceptions;

public class Exceptions1 {
	
	public static void main(String[] args) {
		
	
	
	double a = 15;
	double b= 0;
	double c[]= {1};
	
	try {
		c[43] = 5;
		System.out.println("questo non dovrebbe essere scritto");
	}catch( ArrayIndexOutOfBoundsException e) {
		System.out.println("Eccezione"+ e.getMessage());
		
		} 
	
	finally { System.out.println("finally");}
	}
}

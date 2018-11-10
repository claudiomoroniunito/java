package Exceptions;

import java.util.Scanner;

public class Exception2 {
	
	
	public static void ExceptionThrower(double[] array) throws ArrayIndexOutOfBoundsException {
	System.out.println("dentro ExceptionThrower");
	throw new ArrayIndexOutOfBoundsException();
		}
	
	public static void main(String[] args) {
		double array[] = {1,2,3,4,5};
		try {
		Exception2.ExceptionThrower(array);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught" + e.getMessage());
		}
		
		
		
	}

}

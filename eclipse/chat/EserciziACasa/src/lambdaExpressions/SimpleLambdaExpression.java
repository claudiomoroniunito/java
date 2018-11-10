package lambdaExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleLambdaExpression{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyNum mynum;
MyNum yourNum;
Product uno;
HelloWorld hell;
Generic<Integer> genericInt;
Generic<String> genericString;
mynum = ()-> 12;
yourNum = ()->13;
mynum.print();
yourNum.print();
uno = (a,b)->{
	return a*b;
	};
System.out.println("Product: " + uno.Prodotto(5, 3));
hell = ()-> {
	System.out.println("Hello in Lambda's World");
	return;
};
hell.Hello();
genericInt = (Integer n) ->{ return n+1;};
genericString = (String a) -> {return a +" Bene, grazie!";};

System.out.println(" genericInt.func(5)= "+genericInt.func(5)+ "\n" + "genericString.func(Come Stai?) "+genericString.func("Come Stai?" ));
	
}
	}



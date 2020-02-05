import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Write the first number :");
		
		String userInput = reader.readLine();
		System.out.println(userInput);
		
		System.out.print("Write the second number : ");
		String userInput2 = reader.readLine();
		System.out.println(userInput2);
		
		int value = Integer.parseInt(userInput);
		int value2 = Integer.parseInt(userInput2);
		
		int a = value + value2;
		int b = value - value2;
		int c = value * value2;
		int d = value / value2;
		int e = value % value2;
		
		System.out.println(value + " + " + value2 +" = " + a);
		System.out.println(value + " - " + value2 +" = " + b);
		System.out.println(value + " * " + value2 +" = " + c);
		System.out.println(value + " / " + value2 +" = " + d);
		System.out.println(value + " % " + value2 +" = " + e);
		
	}

}

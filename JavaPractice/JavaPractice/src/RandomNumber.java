import java.io.*;

public class RandomNumber {
	public static int generateRandomInteger(int from, int to) {
		return(int)(Math.random()* to + from);
	}

	public static void main(String[] args) throws IOException{
		
		int guesses;
		int generatedNumber = generateRandomInteger(1,100);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("How many guesses do you want ?");
		String userInput = reader.readLine();
		guesses = Integer.parseInt(userInput);
		
		while(guesses > 0) {
			
			System.out.println("Your guess :");
			int userGuess = Integer.parseInt(reader.readLine());
			System.out.println(userGuess);
			
			if(userGuess != generatedNumber) {
				if(userGuess < generatedNumber) {
					System.out.println("Generated number is higher");
					guesses--;
				}else {
					System.out.println("Generated number is smaller");
					guesses--;
				}
			}if(guesses == 0) {
				System.out.println("YOU LOSE !");
			}if(userGuess == generatedNumber) {
				System.out.println("YOU WIN !");
			}
		} 	
	}
}

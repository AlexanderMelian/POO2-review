package review;

import java.util.Scanner;

public class RandomNumber {
	String nRandom;
	
	public RandomNumber() {
		
	}
	public RandomNumber(String nRandom) {
		this.nRandom = nRandom;
	}
	
	public void guessNumber() {
		int count = 1;
		Scanner myScanner = new Scanner(System.in);
		String uInput;
		for(;;count +=1) {
			uInput = myScanner.nextLine();
			if(uInput.equals("*")) {
				break;
			}else {
				if(uInput.equals(nRandom)) {
					System.out.print(count);
				}
			}
		}
		myScanner.close();
		System.out.println(nRandom);
	}
}

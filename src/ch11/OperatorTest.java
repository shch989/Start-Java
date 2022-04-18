package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
//		int lastScore = ++gameScore; // gameScore += 1; gmaeScore = gameScore + 1;
		int lastScore = gameScore++; // gameScore를 넣은 뒤 ++
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}

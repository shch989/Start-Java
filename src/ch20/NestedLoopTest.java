package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan = 2;
		int count = 1;
		
		for (dan = 2; dan <= 9; dan++) {
			
			System.out.println("=== " + dan + "´Ü " + "===");
			
			for(count = 1; count <= 9; count++) {
				
				System.out.println(dan + " x " + count + " = " + dan * count);
				
			}
		}
		
	}

}

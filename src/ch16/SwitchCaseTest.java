package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();	
		
		// 화살표 기능은 java 14 버전부터 지원
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> 
				31;
				
			case 4, 6, 9, 11 ->
				30;
			
			case 2 -> 
				28;
		
			default-> {
				System.out.println("존재하지 않는 달입니다."); // 다른 수행문
				yield -1; // 다른 수행문이 있다는 것을 의미
			}
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}

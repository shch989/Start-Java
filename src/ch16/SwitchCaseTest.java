package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();	
		
		// ȭ��ǥ ����� java 14 �������� ����
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> 
				31;
				
			case 4, 6, 9, 11 ->
				30;
			
			case 2 -> 
				28;
		
			default-> {
				System.out.println("�������� �ʴ� ���Դϴ�."); // �ٸ� ���๮
				yield -1; // �ٸ� ���๮�� �ִٴ� ���� �ǹ�
			}
		};
		
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}

}
import java.util.Scanner;

import javax.swing.Spring;

public class world8 {

	public static void main(String[] args) {
		
		
		System.out.print("오늘은 몇월인가요?>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		switch (input) {
		case 1 :case 2: case 3:
		System.out.println("입력하신 달은 봄 입니다.");
		break;
		case 4: case 5: case 6:
		System.out.println("입력하신 달은 여름 입니다");
		break;
		case 7: case 8: case 9:
		System.out.println("입력하신 달은 가을 입니다.");
		break;

		default:
		case 10: case 11: case 12://생략가능함
		System.out.println("입력하신 달은 겨울 입니다.");
			break;
		
		}
		
		}
		
		
		
		
		
		

		
		
		
		
		
		
	
	
	}


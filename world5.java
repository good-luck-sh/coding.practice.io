
import java.util.Scanner;



public class world5 {

	public static void main(String[] args) {
		int score = 0;
		char ch =' ';
		String a = " ";
	
		System.out.print("ȭ�鿡 ������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90){
			System.out.printf("����� ������ %d�Դϴ�.%n", score);
			System.out.println("������"+'A'+"�Դϴ�");
			if (score > 95) {
				System.out.println('A'+"+");
				
			}if (score >= 90) {
				System.out.println('A'+"-");
				
			}
			
					
		}else if (score >= 80) {
			System.out.printf("����� ������ %d�Դϴ�.%n",score);
			System.out.println("������"+'B'+"�Դϴ�");
			if (score > 85) {
				System.out.println('B'+"+");
				
			}if (score >= 80) {
				System.out.println('B'+"-");
				
			}
			
			
		}else if (score >= 70) {
			System.out.printf("����� ������ %d�Դϴ�.%n",score);
			System.out.println("������"+'C'+"�Դϴ�.");
			if (score > 75) {
				System.out.println('C'+"+");
				
			}if (score >=70) {
				System.out.println('C'+"-");
				
			}
		}else if (score >= 60) {
			System.out.printf("����� ������ %d�Դϴ�.%n",score);
			System.out.println("������"+'D'+"�Դϴ�.");
			if (score >65) {
				System.out.println('D'+"+");
				
			}
			if (score >=60) {
				System.out.println('D'+"-");
				
			} 
		}
		else {
			System.out.printf("����� ������ %d�Դϴ�.%n",score);
			System.out.println("������"+'F'+"�Դϴ�.");
			if (score <59) {
				System.out.println("�� �����̴�.������̶�� ������.������.");
				
			}

		}
		
		
		
	}
	}
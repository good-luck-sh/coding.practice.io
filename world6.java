
import java.util.Scanner;



public class world6 {

	public static void main(String[] args) {
		int score = 0;
		char ch =' ';
		String a = " ";
	
		System.out.print("ȭ�鿡 ������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90){
			ch = 'A';
			if (score >=95) {
				a = "+";
				
			}if (score >= 90) {
				a = "-";
				
			}
			
					
		}else if (score >= 80) {
			ch = 'B';
			if (score >=85) {
				a = "+";
				
			}if (score >= 80) {
				a = "-";
				
			}
			
			
		}else if (score >= 70) {
			ch = 'C';
			if (score >=75) {
				a = "+";
				
			}if (score >=70) {
				a = "-";
				
			}
		}else if (score >= 60) {
			ch = 'D';
			if (score >=65) {
				a = "+";
				
			}
			if (score >=60) {
				a = "-";
				
			} 
		}
		else {
				ch = 'F';
				System.out.println("�� �����̴�.������̶�� ������.������.");
				
			}
		System.out.println("����� ������"+ch+a+"�Դϴ�.");
		}
		
		
		
	}
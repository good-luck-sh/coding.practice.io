
import java.util.Scanner;



public class world7 {

	public static void main(String[] args) {
		int num = 0;
		char grade = ' ',Opt='0';
		System.out.print("���� ������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		num = scanner. nextInt();
		
		if (num>=90) {
			
			grade = 'A';
			
			if (num>=95) {
				Opt='+';
				
				
			} else {
				Opt ='-';
			}
		}
		else if(num>=80) {
			grade='B';
			if (num>=85) {
				Opt = '+';
			} else {
				Opt ='-';

			}
		}
		else if (num>=70) {
			
			grade = 'C';
			
			if (num>=75) {
				Opt='+';
				
			} else {
				Opt='-';
			}

		}
		else if (num>=60){
			grade = 'D';
			if (num>=65) {
				Opt='+';
				
			} else {
				Opt='-';

			}
			
		}
			
			else {
				grade = 'F';
				Opt = '0';
		}
		
		
		System.out.printf("����� ������ %d�Դϴ�.%n����� ������ %c%c�Դϴ�.",num,grade,Opt);
			}

}
		

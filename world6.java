
import java.util.Scanner;



public class world6 {

	public static void main(String[] args) {
		int score = 0;
		char ch =' ';
		String a = " ";
	
		System.out.print("화면에 점수를 입력하세요");
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
				System.out.println("넌 과락이다.재수강이라는 뜻이지.하하하.");
				
			}
		System.out.println("당신의 학점은"+ch+a+"입니다.");
		}
		
		
		
	}
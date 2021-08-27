
import java.util.Scanner;



public class world5 {

	public static void main(String[] args) {
		int score = 0;
		char ch =' ';
		String a = " ";
	
		System.out.print("화면에 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90){
			System.out.printf("당신의 점수는 %d입니다.%n", score);
			System.out.println("학점은"+'A'+"입니다");
			if (score > 95) {
				System.out.println('A'+"+");
				
			}if (score >= 90) {
				System.out.println('A'+"-");
				
			}
			
					
		}else if (score >= 80) {
			System.out.printf("당신의 점수는 %d입니다.%n",score);
			System.out.println("학점은"+'B'+"입니다");
			if (score > 85) {
				System.out.println('B'+"+");
				
			}if (score >= 80) {
				System.out.println('B'+"-");
				
			}
			
			
		}else if (score >= 70) {
			System.out.printf("당신의 점수는 %d입니다.%n",score);
			System.out.println("학점은"+'C'+"입니다.");
			if (score > 75) {
				System.out.println('C'+"+");
				
			}if (score >=70) {
				System.out.println('C'+"-");
				
			}
		}else if (score >= 60) {
			System.out.printf("당신의 점수는 %d입니다.%n",score);
			System.out.println("학점은"+'D'+"입니다.");
			if (score >65) {
				System.out.println('D'+"+");
				
			}
			if (score >=60) {
				System.out.println('D'+"-");
				
			} 
		}
		else {
			System.out.printf("당신의 점수는 %d입니다.%n",score);
			System.out.println("학점은"+'F'+"입니다.");
			if (score <59) {
				System.out.println("넌 과락이다.재수강이라는 뜻이지.하하하.");
				
			}

		}
		
		
		
	}
	}
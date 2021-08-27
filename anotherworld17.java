import java.util.Scanner;



public class anotherworld17 {

	public static void main(String[] args) {
		
		int num = 0, answer = 0;
		Scanner scanner = new Scanner(System.in);//시스템입력과 
		num =(int)(Math.random()*100)+1;//랜덤은 위쪽에 배열이 되어야한다.
		
		do {
			System.out.println("1과 100사이의 정수를 입력해보세요>");
			answer = scanner.nextInt();
			
		
			if (num>answer) {
				System.out.println("더 큰 값을 입력하세요");
			}else if(num<answer) {
					System.out.println("더 작은 값을 입력하세요");
					}
		}while (num!=answer);

			System.out.println("정답입니다.");
	
	}	
	}


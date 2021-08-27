import java.util.Scanner;

public class world3 {

	public static void main(String[] args) {
	
		 System.out.printf("화면에 '0'이란 숫자를 입력하세요>");
		 Scanner scanner = new Scanner(System.in);
		 
		 int input= scanner.nextInt();
		 
		 if (input<=0) {
			 System.out.println("입력하신 숫자가 '0' 입니다.");
		
				 
			}
			 else  { 
			System.out.println("입력하신 숫자는 '0'이 아닙니다.");
		
			}
		}
		 
		 
		 
		 
	}

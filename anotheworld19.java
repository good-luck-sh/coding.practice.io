import java.util.Scanner;

public class anotheworld19 {

	public static void main(String[] args) {
		int num = 0, menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {//무한반복할내용
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.print("원하는 메뉴를 선택하세요.(종료:0번)>");
			
			String tmp = scanner.nextLine();//입력값을 tmp에 저장
			menu = Integer.parseInt(tmp);//문자열을 숫자로 저장 
			
			if (menu==0) {//menu가 0번 or 0초과 4미만이 아닌경우를 작성
				System.out.println("프로그램이 종료되었습니다.");
				break;}
				else if (!(0<menu&&menu<4)) {
					System.out.println("메뉴를 잘못선택하셨습니다.(종료는:0번)");
				
				}
			System.out.println("선택하신 메뉴는"+menu+"번입니다.");//위에 2개외에 1~3선택시 나오는값
			
			}
			
		}
		
		
		
		
		
		
		}
	

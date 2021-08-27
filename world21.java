import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class world21 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner =new Scanner(System.in);
		loop1: while (true) {
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.print("원하시는 메뉴(1~3)를 선택하세요(종료:0)>");
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu==0) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;}
			else if (!(0<menu&&menu<4)) {
				System.out.println("잘못된 선택입니다.다시선택하세요 (종료:0)>");
				continue;				
			}
//			System.out.print("선택한 메뉴는"+menu+"입니다.");
//		
			while (true) {
				
			
				String tmp1 = scanner.nextLine();
				num = Integer.parseInt(tmp1);
				System.out.println("계산할 값을 입력하세요.(계산종료:0,전체종료:99)>");
				
				
				if (num==0) 
					System.out.println("계산을 종료하겠습니다.");
					break;
					
				if(num==99) 	 
					break loop1;			
		

					switch (menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2 : 
						System.out.println("result="+Math.sqrt(num));
						break;
					case 3 : 
						System.out.println("result="+Math.log(num));
						break;
//					
//					default:
//						break;
					}
			}
	}
}
}
		


				
	
		
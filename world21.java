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
			System.out.print("���Ͻô� �޴�(1~3)�� �����ϼ���(����:0)>");
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu==0) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;}
			else if (!(0<menu&&menu<4)) {
				System.out.println("�߸��� �����Դϴ�.�ٽü����ϼ��� (����:0)>");
				continue;				
			}
//			System.out.print("������ �޴���"+menu+"�Դϴ�.");
//		
			while (true) {
				
			
				String tmp1 = scanner.nextLine();
				num = Integer.parseInt(tmp1);
				System.out.println("����� ���� �Է��ϼ���.(�������:0,��ü����:99)>");
				
				
				if (num==0) 
					System.out.println("����� �����ϰڽ��ϴ�.");
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
		


				
	
		
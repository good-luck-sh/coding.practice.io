import java.util.Scanner;

public class anotheworld19 {

	public static void main(String[] args) {
		int num = 0, menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {//���ѹݺ��ҳ���
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.print("���ϴ� �޴��� �����ϼ���.(����:0��)>");
			
			String tmp = scanner.nextLine();//�Է°��� tmp�� ����
			menu = Integer.parseInt(tmp);//���ڿ��� ���ڷ� ���� 
			
			if (menu==0) {//menu�� 0�� or 0�ʰ� 4�̸��� �ƴѰ�츦 �ۼ�
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;}
				else if (!(0<menu&&menu<4)) {
					System.out.println("�޴��� �߸������ϼ̽��ϴ�.(�����:0��)");
				
				}
			System.out.println("�����Ͻ� �޴���"+menu+"���Դϴ�.");//���� 2���ܿ� 1~3���ý� �����°�
			
			}
			
		}
		
		
		
		
		
		
		}
	

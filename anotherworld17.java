import java.util.Scanner;



public class anotherworld17 {

	public static void main(String[] args) {
		
		int num = 0, answer = 0;
		Scanner scanner = new Scanner(System.in);//�ý����Է°� 
		num =(int)(Math.random()*100)+1;//������ ���ʿ� �迭�� �Ǿ���Ѵ�.
		
		do {
			System.out.println("1�� 100������ ������ �Է��غ�����>");
			answer = scanner.nextInt();
			
		
			if (num>answer) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}else if(num<answer) {
					System.out.println("�� ���� ���� �Է��ϼ���");
					}
		}while (num!=answer);

			System.out.println("�����Դϴ�.");
	
	}	
	}


import java.util.Scanner;

public class world17 {

	public static void main(String[] args) {
		
	int num = 0, k =0;
	
	Scanner scanner = new Scanner(System.in);//��°��� �ý��ۿ� ����
	k = (int)(Math.random()*100)+1;//1~100������ ���� �����ϰ� ������ ����
	
	do {
		System.out.println("1�� 100������ ������ �Է��ϼ���>");
		num = scanner.nextInt();//�ý����� ���ڸ� num ������
		
		if(num>k) {
		System.out.println("�� ���� ���ڷ� �����غ����� ");}
		
		else if (num<k) {
		System.out.println("�� ū ���ڷ� �����غ����� ");
		
		}
	}while(num!=k);
		System.out.println("�����Դϴ�.");
	}
}



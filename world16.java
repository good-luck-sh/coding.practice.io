import java.util.Scanner;
import java.util.function.IntConsumer;

import javax.swing.Spring;

public class world16 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���(��:12345>)");
		
		int sum = 0, num =0;//�ʱ�ȭ
		
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();//�Է°� ���ڿ��� ���
		num = Integer.parseInt(x);//���ڿ��� num���� ���
		
		while (num!=0) {//num�� 0�̾ƴҶ�����
			
			sum += num%10; //sum=sum+num%10. %10�����ϸ� �������ڸ��ϳ���������
			System.out.printf("sum=%3d , num=%d%n",sum,num);
			num /=10;// num= num/10 �̰Ժ����� �������͸� ���� �߿�! 
			
			
		}
		
		System.out.println("���ڸ����� ��="+sum);//�������� sum�� ����ģ�Ŵϱ� num���� sum���־����
		
	
		}
	
		
		}

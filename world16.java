import java.util.Scanner;
import java.util.function.IntConsumer;

import javax.swing.Spring;

public class world16 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요(예:12345>)");
		
		int sum = 0, num =0;//초기화
		
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();//입력값 문자열에 출력
		num = Integer.parseInt(x);//문자열은 num값에 출력
		
		while (num!=0) {//num이 0이아닐때까지
			
			sum += num%10; //sum=sum+num%10. %10으로하면 마지막자리하나씩나눠짐
			System.out.printf("sum=%3d , num=%d%n",sum,num);
			num /=10;// num= num/10 이게빠지면 마지막것만 나옴 중요! 
			
			
		}
		
		System.out.println("각자리수의 합="+sum);//마지막에 sum이 다합친거니까 num말고 sum을넣어야함
		
	
		}
	
		
		}

import java.util.Scanner;

public class world17 {

	public static void main(String[] args) {
		
	int num = 0, k =0;
	
	Scanner scanner = new Scanner(System.in);//출력값을 시스템에 저장
	k = (int)(Math.random()*100)+1;//1~100까지의 값을 랜덤하게 정수에 저장
	
	do {
		System.out.println("1과 100사이의 정수를 입력하세요>");
		num = scanner.nextInt();//시스템의 숫자를 num 에저장
		
		if(num>k) {
		System.out.println("더 작은 숫자로 도전해보세요 ");}
		
		else if (num<k) {
		System.out.println("더 큰 숫자로 도전해보세요 ");
		
		}
	}while(num!=k);
		System.out.println("정답입니다.");
	}
}



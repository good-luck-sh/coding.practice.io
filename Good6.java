
import java.util.Scanner;

public class Good6 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	  System.out.println("여기에 표시되는 말은 무엇인가 로봇.>");
	  String input = scanner.nextLine();
	
	  int num =Integer.parseInt(input);
	  System.out.println("네, 요청사항의 결과는:"+num);
	  System.out.printf("num=%d%n",num);
	  
	 

	}

}

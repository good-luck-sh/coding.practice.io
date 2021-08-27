
public class Good4 {

	public static void main(String[] args) {
		String url="www.lionpower.tistory.com"; //날아라 쩡글이의 티스토리
		
		double d = 1.2345678999999;
		System.out.printf("d=%10.7f%n",d); //전체 10자리중에 7자리만 출력
		System.out.printf("[%s]%n",url);//문자열로 출력
		System.out.printf("[%.8s]%n",url);	//전체중 8자리까지만 출력
	}

}

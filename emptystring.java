import java.io.File;

import com.sun.org.apache.xml.internal.security.Init;

class emptystring{
	public static void main(String[]arg) {
		//길이가 0인 char의 배열을 생성한다. 
	char[] cArr = new char[0];//0과 동일한 값이다. 
	String s = new String(cArr);//배열을 넣게 될경우 char[]값이 입력되게 된다. 
	
	System.out.println("cArr.length="+cArr.length);
	System.out.println("@@@"+s+"@@@");//지금나오는 값은 0이다. 
	
	
	char[] CArr = new char[5];//칸이 5인 배열에 0의값을 입력함 
	String t = new String(CArr);//칸이 5개인 배열을 입력
	
	System.out.println("CArr.length="+CArr.length);
	System.out.println("@@@"+t+"@@@");//출력시 t의 값은 칸이 5개인 배열이 들어간걸 확인할 수 있음
	//이 이후로는 메서드 구현 하기 위한 코딩
	String File= "hello" ;
	boolean a = File.endsWith("text");
	System.out.println("boolean test:"+a);
	
	String not ="Hello";
	boolean b = not.equalsIgnoreCase("hELLO");
	boolean B = not.equalsIgnoreCase("hELLO");
	System.out.println("boolean test:"+b);
	System.out.println("boolean test:"+B);
	System.out.println(" ");
	
	
	
	
	
	}
}
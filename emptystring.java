import java.io.File;

import com.sun.org.apache.xml.internal.security.Init;

class emptystring{
	public static void main(String[]arg) {
		//���̰� 0�� char�� �迭�� �����Ѵ�. 
	char[] cArr = new char[0];//0�� ������ ���̴�. 
	String s = new String(cArr);//�迭�� �ְ� �ɰ�� char[]���� �Էµǰ� �ȴ�. 
	
	System.out.println("cArr.length="+cArr.length);
	System.out.println("@@@"+s+"@@@");//���ݳ����� ���� 0�̴�. 
	
	
	char[] CArr = new char[5];//ĭ�� 5�� �迭�� 0�ǰ��� �Է��� 
	String t = new String(CArr);//ĭ�� 5���� �迭�� �Է�
	
	System.out.println("CArr.length="+CArr.length);
	System.out.println("@@@"+t+"@@@");//��½� t�� ���� ĭ�� 5���� �迭�� ���� Ȯ���� �� ����
	//�� ���ķδ� �޼��� ���� �ϱ� ���� �ڵ�
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
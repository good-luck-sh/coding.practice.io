
class equalstostring{
	public static void main(String[]arg) {
		String str1 = "abc";//str1�� ���� �����ϰ� �Է��� ��
		String str2 = "abc";//�ּҰ��� ������ str�� �ۼ���
		System.out.println("String str1 =\"abc\";");
		System.out.println("String str2=\"abc\";");
		System.out.println("str1==str2 ? " + (str1==str2));//== ��ġ���� Ȯ��
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));//���ڿ��� �������� Ȯ��
		System.out.println( );//��ĭ ���� ���
		
		String str3 = new String("abc");//str3�� str4�� new�����ڷ� �ٸ��ּҰ��� �Է���
		String str4 = new String("abc");
		System.out.println("String str3 = new String(\"abc\");");
		//���ؾ˰��� �������� ����� ������ Ǯ �� Ȯ����, ��ȣ�� ������ \"�� �Է��ؾ��Ѵ�.
		System.out.println("String str4 = new String(\"abc\");");
		System.out.println("str3==str4 ?"+(str3==str4));//�ּҰ��� �������� Ȯ��
		System.out.println("str3.equals(str4)"+str3.equals(str4));
		//�ּҰ��� �������� , �������ڿ����� Ȯ���ϱ� ���Ͽ� �ۼ��� �ڵ�.
		
	
	
	
	}
}


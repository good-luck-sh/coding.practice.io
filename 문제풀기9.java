class ����Ǯ��9{
public static boolean isNumber(String str) {
	//1.�־��� ���ڿ��� null, ""�̶�� ��ȯ
	if(str==null||str=="")
		return false;
	//���ڷθ� �̷����� ��� true�� ��ȯ �ƴ϶�� false�� ��ȯ
	
	for(int i = 0; i< str.length() ; i++) {
		char j =str.charAt(i);
		if(j<'0' && j<'9') {
			return false;}

	}
			return true;
	}

	
	
	
public static void main(String[]args) {
	String str ="123";
	System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
	str = "456";
	System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
			
	
}

}

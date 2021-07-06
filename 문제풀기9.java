class 문제풀기9{
public static boolean isNumber(String str) {
	//1.주어진 문자열이 null, ""이라면 반환
	if(str==null||str=="")
		return false;
	//숫자로만 이뤄졌을 경우 true로 반환 아니라면 false로 반환
	
	for(int i = 0; i< str.length() ; i++) {
		char j =str.charAt(i);
		if(j<'0' && j<'9') {
			return false;}

	}
			return true;
	}

	
	
	
public static void main(String[]args) {
	String str ="123";
	System.out.println(str+"은 숫자입니까?"+isNumber(str));
	str = "456";
	System.out.println(str+"은 숫자입니까?"+isNumber(str));
			
	
}

}

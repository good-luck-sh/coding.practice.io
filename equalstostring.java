
class equalstostring{
	public static void main(String[]arg) {
		String str1 = "abc";//str1의 값이 동일하게 입력을 함
		String str2 = "abc";//주소값이 동일한 str을 작성함
		System.out.println("String str1 =\"abc\";");
		System.out.println("String str2=\"abc\";");
		System.out.println("str1==str2 ? " + (str1==str2));//== 동치인지 확인
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));//문자열이 동일한지 확인
		System.out.println( );//한칸 띄어쓰기 출력
		
		String str3 = new String("abc");//str3과 str4를 new연산자로 다른주소값에 입력함
		String str4 = new String("abc");
		System.out.println("String str3 = new String(\"abc\");");
		//백준알고리즘 강아지와 고양이 문제를 풀 때 확인한, 부호를 쓰려면 \"를 입력해야한다.
		System.out.println("String str4 = new String(\"abc\");");
		System.out.println("str3==str4 ?"+(str3==str4));//주소값이 동일한지 확인
		System.out.println("str3.equals(str4)"+str3.equals(str4));
		//주소값이 동일한지 , 같은문자열인지 확인하기 위하여 작성한 코드.
		
	
	
	
	}
}




class Date { int x;};//Date에 대한 객체 생성,클래스변수 


class hellp{
	public static void main(String[]args) {
		Date d = new Date();//객체생성  (1번작동) 
		d.x = 10;
		System.out.println("main() : x ="+d.x);
	
		
		change(d.x);//(3번작동) 
		System.out.println("After change(d.x)");
		System.out.println("main():x="+d.x);//결과값이 도출 
		
		
	}
	
	static void change(int x) {//기본형 매개 변수 = > x에 대한 설정함 (2번작동)
		x = 1000;
		System.out.println("change () : x ="+x);
	}

	
}
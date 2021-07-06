
class apple { int x ; }//클래스변수 
class hellp2{
	public static void main(String[]args) {
		apple b = new apple();//인스턴스화를 시키기위하여 참조 변수 
		b.x = 10;// (1번 ) 인스턴스.클래스 = 출력값 으로 선언해야 에러가 생기지않는다 
		System.out.println("main(): x ="+b.x);
		
		change(b);// 참조형 매개 변수를 바꾸겠다(3번)
		
		System.out.println("After change (b) ");
		System.out.println("main () : x ="+b.x);
	
	}
	
	static void change (apple b) {//참조형 매개 변수 설정(2번)
		b.x=1000;
		System.out.println("change ():x = "+b.x);
		
	}
}
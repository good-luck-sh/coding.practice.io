

class bit { int x;}//클래스변수에 대한 지정
class hellp3 {
	public static void main (String[]args) {
		bit y = new bit();//참조변수 인스턴스화 선언
		y.x= 10;// 참조변수 설정 1번, 따로 기본값이 무엇인지 적지 않아도 출력이 가능
		//이유는 y.x(int)부분이라고 설정하고 있음
		
		bit d2 = copy(y);//tmp 값을 d2에 설정함 
		System.out.println("y.x= "+y.x);
		System.out.println("d2= "+d2.x);
		
		
	}
	static bit copy (bit y) {
		bit tmp = new bit();
		
		tmp.x = y.x;
		return tmp;
		
	}
}
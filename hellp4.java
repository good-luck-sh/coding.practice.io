

class hiphop {
	long a,b ;//iv를 선언함 
	long add() { return a+b;}
	long subtract() { return a-b;}
	long multplay() { return a*b;}
	double divide() { return a/b;}
	//인스턴스 변수 a,b만을 이용해서 작업하므로 매개 변수가 필요없다. 
	
	static long add(long c, long d) {return c+d;}
	static long subtract(long c, long d) {return c+d;}
	static long multplay(long c, long d) {return c+d;}
	static double divide(double c , double d) {return c/d;}
}  //인스턴스와 관계없이 매개변수만으로 작업이 가능하다.


class hellp4 {
	public static void main (String[]args) {
		//클래스에서도 호출,인스턴스 생성없이 호출가능 
		System.out.println(hiphop.add(900,50));//호출할때는 작성 
		System.out.println(hiphop.subtract(200,700));
		System.out.println(hiphop.divide(274.5, 2432.2));
		System.out.println(hiphop.multplay(2384,213));
		//클래스 메서드의 경우 한가지한가지의 출력값을 설정할때 좋다 
		System.out.println();
		System.out.println();
		
		hiphop x = new hiphop();//인스턴스를 생성한다.
		x.a = 2341;
		x.b = 584;
		
		System.out.println(x.add());
		System.out.println(x.divide());
		System.out.println(x.multplay());
		System.out.println(x.subtract());
	}//인스턴스메서드의 경우 필요한 출력값에 대해서 전체 설정시에 좋다.
}
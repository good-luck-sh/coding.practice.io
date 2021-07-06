package cjcj;


class parent3 {//클래스의 정의
	public void method1(){
		System.out.println("method1() in parent3");
	}
}
interface parent2{//추상메서드들의 집합인 인터페이스작성
	 public default void mathod2() {//디폴트 메서드(public)은 생략가능
		 System.out.println("method2() in myinterface");
	 }
	 public default void mathod3() {
		 System.out.println("method3() in myinterface");
	 }
	 
	 public static void staticmethod() {//static의 메서드 (public)생략가능
		 System.out.println("staticmethod() in myinterface");
	 }
}

interface myinterface2 {//인터페이스 작성
	public default void method1() {
		System.out.println("method1() in myinterface2");
	}
	public static void staticmathod() {
		System.out.println("staticmethod() in myinterfacemathod2");
	}
}

class child3 extends parent3 implements myinterface2,parent2{//parent3의 자손이면서 interface 다중상속 , 이부분을 표현한예정
	public void mathod1() {//interface와 class에게 상속된 부분 , 표시만 안될뿐이지 parent2에게 상속을 받고 있다. 
		System.out.println("method1() in child3");//오버라이딩
	}
}

class hellp13{
	public static void main(String[]args) {//main 메서드
	 child3 h = new child3();//표현할 클래스의 생성
	 h.method1();//child3의 메서드
	 h.mathod2();//인터페이스에게 상속받은 메서드
	 myinterface2.staticmathod();//인터페이스에게 상속받은 메서드
	 parent2.staticmethod();
	//인터페이스에게 상속받은 메서드, 이를 통하여 다중상속이 가능하다는 부분 알 수 있음.문제풀기5.java
	}
}
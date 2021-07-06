package cjcj;
class hellp14{
class instanceinner {//인스턴스 클래스
	int iv = 100;//인스턴스의 생성화 
//	static int cv = 100;// static는 인스턴스 안에 작성할수 없다.
	final static int CONST=100;//final인 상수는 가능 , 상수는 작성할때 대문자로 작성하는 것이 룰! 
}

static class staticinner {//class클래스
	int tv = 200;
	static int cv = 200;
}


void mymethod() {// 메서드 ,지역변수가 들어가있음
	class localinner{//지역변수의 작성,마찬가지로 static을 작성할수없다.
		int iv = 300;
		final int CONST=300;//상수는 가능하다.
	}}

public static void main(String[]args) {//inner클래스 안에서 존재하는 메인 메서드, 출력할 값
	System.out.println(instanceinner.CONST);
	System.out.println(staticinner.cv);
//	System.out.println(localinner)//지역변수는 메서드가 끝나면 끝이나기때문에 불러올수 없다.
}}

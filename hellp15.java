package cjcj;



class hellp15{//표현하기 위한 클래스,메인클래스
public static void main(String[]arg) {//표현하고자하는 부분을 생성한다고 생각할 것.
	OUter e =new OUter();//외부클래스를 생성화한다.
	OUter.INner m = e.new INner();//외부클래스를 작성하며 내부클래스를 작성한다.
	m.mathod();//내부클래스의 메서드 
		}
	
}

class OUter{//외부클래스
	int value = 10;//외부클래스의 초기화
	class INner{//내부클래스
		int value = 20;//내부클래스의 초기화
		void mathod() {//메서드
			int value = 30 ;//지역변수의 초기화
			System.out.println(value);//지역변수
			System.out.println(this.value);//내부클래스 , 내부클래스는 this를 붙인다.
			System.out.println(OUter.this.value);//외부클래스 , 외부클래스이름과this.이름을 붙인다.
			
		}
	}
}
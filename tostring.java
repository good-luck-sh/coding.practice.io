import java.util.Objects;

class Card{//전체적인 부여된 class 값
	String kind;//문자열 kind
	int number;//숫자로 number설정

	

	
	Card(){//카드값을 불러오기 
	this("SPADE",1);//생성자에서 다른 생성자 호출하기 this값을 사용함. 
}
	Card(String kind,int number){
		this.kind = kind;//객체 스스로를 지칭하는 값 <조상을 지칭시 :super>
		this.number=number;//객체 스스로를 지칭하는 값
	}
	
	public String toString() {//오버라이딩하여 card의 인스턴트값을 문자열로 반환함.
		return "kind:"+kind+",number:"+number;
	}
//	
//	private boolean equals (object obj) {//만약 equals로 값을 동일하게 만들어줬을 경우 
//		if(!(obj instanceof Card))// instanceof로 조상이 맞는지 확인하여야하고
//			return false;
//			Card c2 = (Card)obj;//obj의 경우 형변환을 해주어야한다. 
//	}
//	private int hashcode() {//
//		return Objects.hashCode(kind);
//	}


public class tostring{
	public static void main(String[]arg) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	}}



 class jjungle {
//	jjungle(){}//원래는 기본생성자
	String color;//색상
	String kind;//종류
	String food;//음식에대한 진심
	double kg; //몸무게
	
	public jjungle (String color, String kind, String food, double kg) {
		this.color =color;//iv와 lv (iv앞에 this로 인스턴스라는 것을 표현함)
		this.kind =kind;
		this.food = food;
		this.kg = kg;
		//객체생성(public한 부분으로 객체생성을 해줘야 나머지도 인식이 가능함)
		
	}
	
	 jjungle() {
		 this("brown", "치와와", "true", 4.40);	
	}//jjungle을 사용하지않고,this를 사용함
	
	jjungle(String color){//쩡글을 한번더 불러내기 위하여 (문자열로 된 색상에 대하여 입력)
		this(color,"치와와","true",4.40);
	}
}
class hellp7{
	public static void main(String[] args) {
		jjungle a = new jjungle();
		jjungle b = new jjungle("brown");//색상에 대한 입력값을 작성하면서 부름
	System.out.println("쩡글이 이리와~색상은="+a.color+" ,"+"댕댕이 종은 = "+a.kind+" ,"+"음식에 대한 진심은"+a.food+" ,"+"몸무게는"+a.kg);
	System.out.println("쩡글이 다시 이리와~색상은="+b.color+" ,"+"댕댕이 종은 = "+b.kind+" ,"+"음식에 대한 진심은"+b.food+" ,"+"몸무게는"+b.kg);
		
	}
}
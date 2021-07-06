class car{
	String color;//색상
	String gearType;//변속기의 유무 -auto, manual
	int door;//문 갯수 
	
	car(){}//클래스의 생성자를 입력해준다 (끝에 ;안써도됨)
	
	car(String c, String g,int a ){//매개변수가 있는 생성자
	color  = c;
	gearType = g;
	door = a;
	}
}
class hellp6{
	public static void main(String[] args) {
		car c1 = new car();//객체 생성
		c1.color = "white";//문자열이라 ""사용
		c1.gearType = "auto";
		c1.door = 4;
		car c2 = new car("black","manual",4);//위에문장을 한문장으로 단순화함 
		System.out.println("c1.color="+c1.color+" "+"gearType="+c1.gearType+" "+"door="+c1.door);
		System.out.println("c2.color="+c2.color+" "+"gearType="+c2.gearType+" "+"door="+c2.door);
		
		
	}
}
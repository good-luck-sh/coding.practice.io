package cjcj;
class car {
	boolean power; 
	String color;
	int door; // open, close
	
	void drive() {//운전하는 기능 
		System.out.println("drive. brrrrrrrrrr~~~~~~");
	}
	void stop() {//멈추는 기능
		System.out.println("all stop pip");
	}

}
class mornig extends car{
	void background() {
		System.out.println("watershower system On");
	}
	
}

public class hellp9{
	public static void main(String[]args) {
		
		mornig s = new mornig();
		car i = new car();
		mornig b = null;
		car c = null;
		

		
		i.drive();
		s.background();
//		s = (mornig)i;
		c = s;//조상이 자손을 형변환하는 것은 자동 가능 ,null 값인 조상 = 자손
		s = (mornig)c;//형변환을 걸어주면 형변환 가능 ,자손 = null값인 조상
		c.drive();
		s.background();
		
		

	}
}

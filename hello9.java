class tv{//같은 패키지 안의 제어자인 defult의 class
	boolean power;//전원상태 poewr on off (속성/표면)
	int channel;//채널이 있다 (속성/표면)
	
	void power() {power =! power;} //true 와 untrue의 형태 (기능/행동)
	void channelUP() {++channel;  }//채널++(기능/행동)
	void channelDOWN() {--channel;  }//채널 --(기능/행동)  
	
	}
 class smarttv extends tv{//tv에게 상속받는 smarttv
	 boolean caption;//캡션상태 on,off
	 void displaycaption(String text) {//메서드 displaycaption은 문자열을 만듬
		 if (caption) {//만약 caption이 true라면
			 System.out.println(text);//text를 println하세요.
			
		}
	 }
}
 
 public class hellp9 {//접근제어자가 모두인 class (중심 class라서 제목의 이름을 붙임
	public static void main(String[] args) {//접근제어자 = 공통,main메서드
		smarttv t = new smarttv();//자식클래스를 선언한다. 
		t.channel= 10;//채널을 선언함 ,조상class에게 상속받은 메서드
		t.channelUP();//채널 높이는 메서드의 선언,조상class에게 상속받은 메서드
		System.out.println(t.channel);//현재 t의 채널을 println하라 
		t.displaycaption("Hello,world");//true인지 몰라서 println안됨 
		t.caption = true;//캡션상태가(자막) ture임 
		t.displaycaption("Hello,world");//println됨
		
		
		
		
	}

	}
	 

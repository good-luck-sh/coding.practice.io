//import java.util.Arrays;

class student {
	 String name;//생성하고 
	 int ban;
	 int no;
	 int kor;
	 int eng;
	 int math;
	 int total;	
	 float average;

	student(){}//class문제풀이와 연결해줄 기본연산자.
	
	student(String name, int ban, int no, int kor, int eng, int math){//계산할부분작성
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;}
	
		int total () { 
				return kor+eng+math;
				
		}
		float average() {
				return (int) (total()/3*10+0.5f)/10f;
		
	}
		public String info () {
			return name+
					","+ban+
					","+kor+
					","+eng+
					","+math+
					","+total()+
					","+average();
		}
}

class 문제풀기6{
	
	 public static void main(String[]args) {//표현
		 
		 
		student a = new student();
		a.name = "홍길동";
		a.ban = 1;
		a.no=1;
		a.kor = 100;
		a.eng = 60;
		a.math = 76;
		
		
		System.out.println("이름:"+a.name);
		System.out.println("총점:"+a.total());
		System.out.println("평균:"+a.average());
	 }
	 
}

//import java.util.Arrays;

class student {
	 String name;//�����ϰ� 
	 int ban;
	 int no;
	 int kor;
	 int eng;
	 int math;
	 int total;	
	 float average;

	student(){}//class����Ǯ�̿� �������� �⺻������.
	
	student(String name, int ban, int no, int kor, int eng, int math){//����Һκ��ۼ�
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

class ����Ǯ��6{
	
	 public static void main(String[]args) {//ǥ��
		 
		 
		student a = new student();
		a.name = "ȫ�浿";
		a.ban = 1;
		a.no=1;
		a.kor = 100;
		a.eng = 60;
		a.math = 76;
		
		
		System.out.println("�̸�:"+a.name);
		System.out.println("����:"+a.total());
		System.out.println("���:"+a.average());
	 }
	 
}

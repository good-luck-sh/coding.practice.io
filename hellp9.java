package cjcj;
class car {
	boolean power; 
	String color;
	int door; // open, close
	
	void drive() {//�����ϴ� ��� 
		System.out.println("drive. brrrrrrrrrr~~~~~~");
	}
	void stop() {//���ߴ� ���
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
		c = s;//������ �ڼ��� ����ȯ�ϴ� ���� �ڵ� ���� ,null ���� ���� = �ڼ�
		s = (mornig)c;//����ȯ�� �ɾ��ָ� ����ȯ ���� ,�ڼ� = null���� ����
		c.drive();
		s.background();
		
		

	}
}

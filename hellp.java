

class Date { int x;};//Date�� ���� ��ü ����,Ŭ�������� 


class hellp{
	public static void main(String[]args) {
		Date d = new Date();//��ü����  (1���۵�) 
		d.x = 10;
		System.out.println("main() : x ="+d.x);
	
		
		change(d.x);//(3���۵�) 
		System.out.println("After change(d.x)");
		System.out.println("main():x="+d.x);//������� ���� 
		
		
	}
	
	static void change(int x) {//�⺻�� �Ű� ���� = > x�� ���� ������ (2���۵�)
		x = 1000;
		System.out.println("change () : x ="+x);
	}

	
}

class apple { int x ; }//Ŭ�������� 
class hellp2{
	public static void main(String[]args) {
		apple b = new apple();//�ν��Ͻ�ȭ�� ��Ű�����Ͽ� ���� ���� 
		b.x = 10;// (1�� ) �ν��Ͻ�.Ŭ���� = ��°� ���� �����ؾ� ������ �������ʴ´� 
		System.out.println("main(): x ="+b.x);
		
		change(b);// ������ �Ű� ������ �ٲٰڴ�(3��)
		
		System.out.println("After change (b) ");
		System.out.println("main () : x ="+b.x);
	
	}
	
	static void change (apple b) {//������ �Ű� ���� ����(2��)
		b.x=1000;
		System.out.println("change ():x = "+b.x);
		
	}
}
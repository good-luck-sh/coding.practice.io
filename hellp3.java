

class bit { int x;}//Ŭ���������� ���� ����
class hellp3 {
	public static void main (String[]args) {
		bit y = new bit();//�������� �ν��Ͻ�ȭ ����
		y.x= 10;// �������� ���� 1��, ���� �⺻���� �������� ���� �ʾƵ� ����� ����
		//������ y.x(int)�κ��̶�� �����ϰ� ����
		
		bit d2 = copy(y);//tmp ���� d2�� ������ 
		System.out.println("y.x= "+y.x);
		System.out.println("d2= "+d2.x);
		
		
	}
	static bit copy (bit y) {
		bit tmp = new bit();
		
		tmp.x = y.x;
		return tmp;
		
	}
}
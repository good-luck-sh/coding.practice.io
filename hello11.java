class point {
	int x ,y;
	point(int x, int y){//�������� �⺻�����ڸ� �����Ϸ��� ȣ���� super();//object();
		this.x = x;//�ν��Ͻ�ȭ�� �����ϱ� ���� class�� this
		this.y = y;//�ν��Ͻ�ȭ�� �����ϱ� ���� class�� this
	}
}
class point3D extends point{
	int z;
	point3D(int x, int y,int z){//���2����+ �ڼ� 1�� 
		super(x, y);//������ �����ڸ� ȣ����
		this.z= z;
	}
}
public class hellp11{
	public static void main(String[] args) {
		point3D o = new point3D(1,2,4);
		System.out.println("x="+o.x+" "+"y="+o.y+" "+"z="+o.z);
		
	}
}
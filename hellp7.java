
 class jjungle {
//	jjungle(){}//������ �⺻������
	String color;//����
	String kind;//����
	String food;//���Ŀ����� ����
	double kg; //������
	
	public jjungle (String color, String kind, String food, double kg) {
		this.color =color;//iv�� lv (iv�տ� this�� �ν��Ͻ���� ���� ǥ����)
		this.kind =kind;
		this.food = food;
		this.kg = kg;
		//��ü����(public�� �κ����� ��ü������ ����� �������� �ν��� ������)
		
	}
	
	 jjungle() {
		 this("brown", "ġ�Ϳ�", "true", 4.40);	
	}//jjungle�� ��������ʰ�,this�� �����
	
	jjungle(String color){//�ı��� �ѹ��� �ҷ����� ���Ͽ� (���ڿ��� �� ���� ���Ͽ� �Է�)
		this(color,"ġ�Ϳ�","true",4.40);
	}
}
class hellp7{
	public static void main(String[] args) {
		jjungle a = new jjungle();
		jjungle b = new jjungle("brown");//���� ���� �Է°��� �ۼ��ϸ鼭 �θ�
	System.out.println("�ı��� �̸���~������="+a.color+" ,"+"����� ���� = "+a.kind+" ,"+"���Ŀ� ���� ������"+a.food+" ,"+"�����Դ�"+a.kg);
	System.out.println("�ı��� �ٽ� �̸���~������="+b.color+" ,"+"����� ���� = "+b.kind+" ,"+"���Ŀ� ���� ������"+b.food+" ,"+"�����Դ�"+b.kg);
		
	}
}
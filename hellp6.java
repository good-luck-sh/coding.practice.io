class car{
	String color;//����
	String gearType;//���ӱ��� ���� -auto, manual
	int door;//�� ���� 
	
	car(){}//Ŭ������ �����ڸ� �Է����ش� (���� ;�Ƚᵵ��)
	
	car(String c, String g,int a ){//�Ű������� �ִ� ������
	color  = c;
	gearType = g;
	door = a;
	}
}
class hellp6{
	public static void main(String[] args) {
		car c1 = new car();//��ü ����
		c1.color = "white";//���ڿ��̶� ""���
		c1.gearType = "auto";
		c1.door = 4;
		car c2 = new car("black","manual",4);//���������� �ѹ������� �ܼ�ȭ�� 
		System.out.println("c1.color="+c1.color+" "+"gearType="+c1.gearType+" "+"door="+c1.door);
		System.out.println("c2.color="+c2.color+" "+"gearType="+c2.gearType+" "+"door="+c2.door);
		
		
	}
}
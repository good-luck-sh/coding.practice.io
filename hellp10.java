package cjcj;


class product {//�ֵ� class�ϳ� 
	int price;//������ ����
	int bonuspoint;//���ʽ�����Ʈ
	int tax;//������ �ִ�
	product(int price){//������ �����Ѵٸ�
		this.price+=price;
		bonuspoint+= (int)(price/10.0);//���ʽ� ����Ʈ�� ������ 10%�̸� ������ ǥ��
		tax+=(int)(price/10.0);

	}

}
class tv extends product{//product�� �ڼ� tv
	tv(){//����������� price�� �����Ѵ�. 
		super(100);	}//tv�� ������ 100�������� �Ѵ�. 
	
	public String toString() { return "tv";}//tv��� ���ڿ��� ��ȯ�Ѵ�.
	//object Ŭ������ string�� �������̵��Ѵ�(�ڼտ��� �����Ѵ�)
}
class computer extends product{//product���ڼ� computer
	computer (){//����������� price�� ����
		super(300);//computer�� ������ 300�������� �Ѵ�. 
	}
	public String toString() { return "computer"; }//computer��� ���ڿ��� ��ȯ�Ѵ�. 
	//���� ���������� objectŬ������ string�� �������̵��Ѵ�. ->���������� ��ӺҰ��ϸ�, ū������ ����ϰ� �������� ���԰�����̷���


	}

class buyer{//������!, �ൿ�� �� ������ �κп� ���ؼ� �ϳ� ����
	int money= 1000;//������ �ִ� ���� �ݾ� 1000���� class�׸� �ʱ�ȭ�� 
	int bonuspoint = 0;///����Ʈ�� 0���� ������ �ִ�. class�׸� �ʱ�ȭ��  
	int valueaddtax =0;//�ΰ���ġ���� 0���̴�.class�׸��� �ʱ�ȭ�� 
	void buy (product c) {//�ż����׸� �����ϴ� : product�� ���� ���� ������ 
		if (money < c.price) {//���� ���� product�ǰ��ݺ��� ���ٸ� /product�� ���� c�� �����߱� ������ c.price�� 
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

	
		money -= c.price;//money���� ��� �Ҳ��� product c�� ��ȯ�Ͽ� �ݾ�����
		money -= c.tax;//money���� tax���� �Բ� �����ٰ� ������
		bonuspoint +=c.bonuspoint;//���ʽ�����Ʈ�� ����
		valueaddtax+= c.tax;//�ΰ���ġ���� ������. 
		
		System.out.println(c+"�� �����ϼ̽��ϴ� ");//product�ȿ� price�� bonus�� �����⶧���� product�� ��ȯ��
		//buyer�ȿ��� ǥ���� �� �ִ� �κ��� ǥ���� ��. ������ ��, �̷� ������� �����ϸ� �� ��.
	
		
		
	}
}
public class hellp10{
	public static void main (String[]args) {
		buyer e = new buyer();//�ൿ�� �� ���� ���ؼ� �ϳ� ������
//		Scanner scanner= new Scanner(System.in);//���߿� ������ ���� �κ�
		
		e.buy(new tv());//tv�� ����̴�. 
		e.buy(new computer());//computer�� ����̴�. 
		
		System.out.println("���糲������"+e.money+"�Դϴ�.");
		System.out.println("���� ���ʽ������� "+e.bonuspoint+"�Դϴ�.");
		System.out.println("���� �ΰ���ġ�� ������"+e.valueaddtax+"�Դϴ�.");
	}
}

package cjcj;

import java.util.Arrays;

class product2{

	int price;//����
	int bonuspoint;//���ʽ�����Ʈ
	int valuetax;//����
	int sale;//���ΰ���
	
	product2(int price){
		this.price = price;
		sale = (int)(price/50.0);
		bonuspoint = (int)(sale/5.0);
		valuetax = (int)(price/10.0);
	}
	 product2 () {}//�⺻������ 
	 }

class dvd extends product2{
	 dvd() {super(200);}//price�� ���� 300���� ������,�ڼ�Ŭ������ ��������
	 public String toString() {return "dvd";}//���ڰ��� return�Ѵ�. object�� Ŭ������������ͼ� �ۼ�	

	}
class tv1 extends product2{
	tv1() {super(300);}
	public String toString() {return"tv";}
}
class audio extends product2{
	audio(){super(80);}
	public String toString() {return "audio";}
	}
class computer1 extends product2{
	computer1() {super(150);}
	public String toString() {return "computer";}
		
}
class buyer2 {
	int money = 2500;//buyer2�� ������ �ִ� ��,�׵����� �ʱ�ȭ
	int bonuspoint = 0;//���ʽ�����Ʈ�� �ʱ�ȭ
	int sale = 0;//buyer�� �ް� �ִ� ������ ������ �ʱ�ȭ,class buyer�� �ۼ��Ϸ��� �Ʒ����� �ٽ� �ʱ�ȭ�������.�ڼհ��谡 �ƴϱ⶧��
	int valuetax = 790;//������� �����ϴ� �ΰ����� 
	product2[] cart=new product2[10];//Ŭ���� product2�� ���ִ� īƮ�ȿ� 10���� ������ ������ �ۼ�
	int i =0;//i�� ���ؼ� �ʱ�ȭ
	
	void buy(product2 p){//class product2�� �� �޼��带 �ۼ���
		if (money<p.price) {//���� //product2�� price���� money�� �۴ٸ��� �ǹ� product�� �������� p�� ����
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;//return���� �־�� ����� ������.
		}
	
		money -=p.price;
		sale =p.sale;
		valuetax +=p.valuetax;
		bonuspoint=p.bonuspoint;
		cart[i++] = p;//product cart�ȿ� ���� ���� ����Ѵ�. ++�� �̿��Ͽ� �ϳ����߰��Ѵ�.
		System.out.print(p.price+"������ ��ǰ��");
		System.out.println(p+"�� �����ϼ̽��ϴ�.");//�׸��� ���� i���� ���� ����if���� ����
		System.out.println("�ش��ϴ� ������"+p.valuetax+"�Դϴ�.");
		System.out.println("�ش��ϴ� ���ʽ� ����Ʈ��"+p.bonuspoint+"�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� ������"+p.sale+"�Դϴ�.");
	
		}
		void summary () {// ��������ǰ�� ���ؼ� ������ �������
			int sum = 0;//������ ���� �ݾ�
			String itemlist = "";//�����۸���Ʈ�� ���ؼ� "" �ʱ�ȭ�Ѵ�.string=""
			int tax = 0;//�ʱ�ȭ
			int goodsale = 0;//�ʱ�ȭ
			int total = 0;//�ʱ�ȭ
			
			
			
			for (int i = 0; i < cart.length; i++) {//cart�� ���̸� i�� �����Ѵ�. ~ ���ȹ��ȿ� 
				if (cart[i]==null) break;//if���� �ۼ�, cart�ȿ� ��������(null) break�Ѵ�.
				sum += cart[i].price;//sum�� �� ����
				itemlist += (i==0)?""+cart[i]:","+cart[i];//�����۸���Ʈ���� i��0�̸�?','������������,�ƴ϶�� ,����������.�������� ,�� ���ֱ� ����
				tax +=cart[i].valuetax;//tax�� �� ����
				goodsale += cart[i].sale;//sale�� �� ����
				total = (sum+tax)-goodsale;//total���� �����Ѵ�. ��ǰ����+�ΰ��� -���αݾ�����
					
				}
				System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
				System.out.println("�����Ͻ� ��ǰ�� "+itemlist+"�Դϴ�");
				System.out.println("�����Ͻ� �ΰ����� �ݾ���"+tax+"�Դϴ�.");
				System.out.println("�����Ͻ� ��ǰ�� ������"+goodsale+"�Դϴ�.");
				System.out.println("���ž��ϴ� �ݾ���"+total+"�Դϴ�.");
			}
}

	class hellp11 {//���� ���� Ŭ����
		public static void main(String[]args) {
			buyer2 p= new buyer2();//��ü����
			p.buy(new tv1());
			p.buy(new dvd());
			p.buy(new audio());
			p.buy(new computer1());
			p.summary();
		}
	}

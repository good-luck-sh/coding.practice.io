package cjcj;


class parent3 {//Ŭ������ ����
	public void method1(){
		System.out.println("method1() in parent3");
	}
}
interface parent2{//�߻�޼������ ������ �������̽��ۼ�
	 public default void mathod2() {//����Ʈ �޼���(public)�� ��������
		 System.out.println("method2() in myinterface");
	 }
	 public default void mathod3() {
		 System.out.println("method3() in myinterface");
	 }
	 
	 public static void staticmethod() {//static�� �޼��� (public)��������
		 System.out.println("staticmethod() in myinterface");
	 }
}

interface myinterface2 {//�������̽� �ۼ�
	public default void method1() {
		System.out.println("method1() in myinterface2");
	}
	public static void staticmathod() {
		System.out.println("staticmethod() in myinterfacemathod2");
	}
}

class child3 extends parent3 implements myinterface2,parent2{//parent3�� �ڼ��̸鼭 interface ���߻�� , �̺κ��� ǥ���ѿ���
	public void mathod1() {//interface�� class���� ��ӵ� �κ� , ǥ�ø� �ȵɻ����� parent2���� ����� �ް� �ִ�. 
		System.out.println("method1() in child3");//�������̵�
	}
}

class hellp13{
	public static void main(String[]args) {//main �޼���
	 child3 h = new child3();//ǥ���� Ŭ������ ����
	 h.method1();//child3�� �޼���
	 h.mathod2();//�������̽����� ��ӹ��� �޼���
	 myinterface2.staticmathod();//�������̽����� ��ӹ��� �޼���
	 parent2.staticmethod();
	//�������̽����� ��ӹ��� �޼���, �̸� ���Ͽ� ���߻���� �����ϴٴ� �κ� �� �� ����.����Ǯ��5.java
	}
}
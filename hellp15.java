package cjcj;



class hellp15{//ǥ���ϱ� ���� Ŭ����,����Ŭ����
public static void main(String[]arg) {//ǥ���ϰ����ϴ� �κ��� �����Ѵٰ� ������ ��.
	OUter e =new OUter();//�ܺ�Ŭ������ ����ȭ�Ѵ�.
	OUter.INner m = e.new INner();//�ܺ�Ŭ������ �ۼ��ϸ� ����Ŭ������ �ۼ��Ѵ�.
	m.mathod();//����Ŭ������ �޼��� 
		}
	
}

class OUter{//�ܺ�Ŭ����
	int value = 10;//�ܺ�Ŭ������ �ʱ�ȭ
	class INner{//����Ŭ����
		int value = 20;//����Ŭ������ �ʱ�ȭ
		void mathod() {//�޼���
			int value = 30 ;//���������� �ʱ�ȭ
			System.out.println(value);//��������
			System.out.println(this.value);//����Ŭ���� , ����Ŭ������ this�� ���δ�.
			System.out.println(OUter.this.value);//�ܺ�Ŭ���� , �ܺ�Ŭ�����̸���this.�̸��� ���δ�.
			
		}
	}
}
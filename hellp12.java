package cjcj;


public class hellp12{
	public static void main(String[]args) {//main class�� ���� �ۼ�
		unit[] group = {new marine(),new tank(), new Dropship()};//unit�� �׷��� �ۼ�(��������)
		for (int i = 0; i < group.length; i++) {//�׷��� ���̸� ����. ~ �ϴµ���
			group[i].move(100,200);//�׷��� ���̱���. �̵��ϴ� ���� ����			
		}
	}
}

abstract class unit {//unit�� ���� �߻�ȭ 
	int x, y ; //x, y�� ���� ����ȭ
	abstract void move (int x,int y);//�߻��������� �ż����ǰ� x, y ���� ����
	void stop(){/*������ġ�� ���� */}//stop�� ���� ����, ���� ���Ͽ� ���� ��/*�̻��̿�*/�ۼ�, �̺κи� �ּ���
}

class marine extends unit {//������ ��ӹ���
	void move (int x, int y) {//��ӹ��� �޼����� ���� �ۼ��Ѵ�.abstract�� ���� 2���ϰ�� �Ѱ��� ��ӹ޾Ƶ� abstract��
		System.out.println("marin[x="+x+",y="+y+"]");
	}
	void stimPack() {/*�������� ����Ѵ� */}
}

class tank extends unit{
	void move(int x, int y) {
		System.out.println("tank[x="+x+",y="+y+"]");
	}
	void changemode() {/*���ݸ�带 ��ȯ�Ѵ�.*/}
}

class Dropship extends unit{
	void move (int x, int y) {
		System.out.println("Dropship[x="+x+",y"+y+"]");
	}
	void load() {/*���õȴ���� �¿��*/}
	void unload() {/*���õ� ����� ������*/}}
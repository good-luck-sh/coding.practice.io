package cjcj;
class hellp14{
class instanceinner {//�ν��Ͻ� Ŭ����
	int iv = 100;//�ν��Ͻ��� ����ȭ 
//	static int cv = 100;// static�� �ν��Ͻ� �ȿ� �ۼ��Ҽ� ����.
	final static int CONST=100;//final�� ����� ���� , ����� �ۼ��Ҷ� �빮�ڷ� �ۼ��ϴ� ���� ��! 
}

static class staticinner {//classŬ����
	int tv = 200;
	static int cv = 200;
}


void mymethod() {// �޼��� ,���������� ������
	class localinner{//���������� �ۼ�,���������� static�� �ۼ��Ҽ�����.
		int iv = 300;
		final int CONST=300;//����� �����ϴ�.
	}}

public static void main(String[]args) {//innerŬ���� �ȿ��� �����ϴ� ���� �޼���, ����� ��
	System.out.println(instanceinner.CONST);
	System.out.println(staticinner.cv);
//	System.out.println(localinner)//���������� �޼��尡 ������ ���̳��⶧���� �ҷ��ü� ����.
}}

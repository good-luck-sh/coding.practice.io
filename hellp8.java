
class hellp8 {
	 static int[] v = new int[10];//�����ʱ�ȭ
	 static {//����� �ʱ�ȭ
		 for (int i = 0; i < v.length; i++) {//i�� ������
			  v[i] = (int)(Math.random()*10)+1;//v�� ���̸� i�� ������ �����Է�
		}
		 }
	public static void main(String[] args) {
		for (int i = 0; i < v.length; i++) {//v�� ���̸� �ٽ��ѹ� ������
			System.out.println("v["+i+"]"+v[i]);//��°��� �Է�
		}
	
	}
	 
}
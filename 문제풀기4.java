import java.util.Arrays;

class ����Ǯ��4 {
	public static void main(String[] args) {
		int[] t = {1,2,3,4,5,6,7,8,9};
		int[] ball = new int[3];
		//�迭 ball�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for (int i = 0; i <t.length; i++) {
			int j = (int)(Math.random()*t.length);// t�� ���  j�� ���� 
			int tmp = 0;//tmp �� �ʱ�ȭ�� 
			tmp= t[i];//tmp�� t[i]�� ������
			t[i]=t[j];//i�� j�� ������
			t[j]= tmp;//tmp �� ������ 

			}
//			System.out.println(j);

		//�迭 ball���� 3���� ���� �迭 ball3�� �����Ѵ�. 
		System.arraycopy(t, 0, ball, 0, 3);
		
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i]);
			//��� ���� 486 �� ,������� �ٸ����ִ�. 
		
			
		}
	}}
//
//

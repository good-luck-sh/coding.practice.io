
 class box{//Ŭ������ box�� �Է�
	long tax;
	public boolean equals(Object obj) {//equlas�� �������̵� ������Ѵ�. 
		if (!(obj instanceof box))//���� box�� obj�� ����ȯ �������� �ƴ϶�� 
			return false;//false ���� ����
		box b = (box)obj;//obj�� ����ȯ����, �׻��������, ������ �������� ���� ������� �׻� ����ȯ�� ���༭
		//����� �ڼ��� �������� �����ϰ� ����� ��.
			return this.tax==b.tax;//obj�� ��ü���� box�� ��ü�� ���� ������ return��
		
	}

	box(long tax ){// ���δٸ� ��ü�� �׻� �ּҰ� �ٸ���.
		this.tax=tax;
	}
	
public static class equlas1 {

	public static void main(String[] args) {//b1�� b2�� �׻� �ٸ����̴�. iv�� �������̱� ������ 
		box b1 = new box(8011081111222L);
		box b2 = new box(8011081111222L);
		if(b1.equals(b2))
			System.out.println("box 1���� 2���� ������ ���̴�.");
		else
			System.out.println("box 1���� 2���� �ٸ� ���̴�.");
		}}}

	



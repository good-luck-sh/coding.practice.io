class ����Ǯ��8{
	public static int[]shuffle (int[]arr) {//shuffle�� ��ȯŸ���� ������ְ�,�Ű������� ���� ����,static�޼��� ����
		if (arr==null||arr.length==0)//���� ���� ������ return�� �� ����
				return arr;

		for (int i = 0; i < arr.length; i++) {//���̸� �����ϴ� ��(~����)
			int j = (int)(Math.random()*arr.length);//j�� ���� ����
			int tmp = arr[j];//���� �������ֱ� 
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		return arr;
	
	}
	public static void main(String[]args) {
		int[] original= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle (original);
		System.out.println(java.util.Arrays.toString(result));
	}
	
}
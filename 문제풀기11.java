class ����Ǯ��11{
	
	
	public static int max ( int[]arr ) {
		//���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���,-9999999�� ��ȯ�Ѵ�. 
		if(arr==null||arr.length==0) {//arr�� �迭�̴ϱ� ���̷� �ۼ��ؾ��Ѵ�.
			return -9999999;}
		// �־��� int�� �迭�� ���߿��� ���� ū���� ��ȯ�Ѵ�. 
		int max = arr[0];//max�� ���� �ʱ�ȭ�Ѵ�.(�̺κ��� ����Ұ�.)
			
		for(int i = 1; i<arr.length; i++) {
			if( arr[i] > max) {
				max = arr[i];
			}
			
		}
		return max;
	}
	
	
	public static void main(String[]args) {
		int[]data= {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪"+max(null));
		System.out.println("�ִ밪:"+max(new int[] {}));//ũ�Ⱑ 0�ι迭
	}
}
class 문제풀기11{
	
	
	public static int max ( int[]arr ) {
		//만일 주어진 배열이 null이거나 크기가 0인 경우,-9999999를 반환한다. 
		if(arr==null||arr.length==0) {//arr의 배열이니까 길이로 작성해야한다.
			return -9999999;}
		// 주어진 int형 배열의 값중에서 제일 큰값을 반환한다. 
		int max = arr[0];//max의 값을 초기화한다.(이부분을 기억할것.)
			
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
		System.out.println("최대값:"+max(data));
		System.out.println("최대값"+max(null));
		System.out.println("최대값:"+max(new int[] {}));//크기가 0인배열
	}
}
class 문제풀기8{
	public static int[]shuffle (int[]arr) {//shuffle의 반환타입을 만들어주고,매개변수의 값을 지정,static메서드 만듬
		if (arr==null||arr.length==0)//만약 값이 없을때 return할 값 설정
				return arr;

		for (int i = 0; i < arr.length; i++) {//길이를 지정하는 값(~동안)
			int j = (int)(Math.random()*arr.length);//j의 값을 설정
			int tmp = arr[j];//값을 변경해주기 
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
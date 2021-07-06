
class hellp8 {
	 static int[] v = new int[10];//간단초기화
	 static {//명시적 초기화
		 for (int i = 0; i < v.length; i++) {//i를 지정함
			  v[i] = (int)(Math.random()*10)+1;//v의 길이를 i로 설정후 랜덤입력
		}
		 }
	public static void main(String[] args) {
		for (int i = 0; i < v.length; i++) {//v의 길이를 다시한번 지정함
			System.out.println("v["+i+"]"+v[i]);//출력값을 입력
		}
	
	}
	 
}
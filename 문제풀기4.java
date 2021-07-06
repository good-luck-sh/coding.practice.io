import java.util.Arrays;

class 문제풀기4 {
	public static void main(String[] args) {
		int[] t = {1,2,3,4,5,6,7,8,9};
		int[] ball = new int[3];
		//배열 ball의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i = 0; i <t.length; i++) {
			int j = (int)(Math.random()*t.length);// t를 섞어서  j에 저장 
			int tmp = 0;//tmp 를 초기화함 
			tmp= t[i];//tmp에 t[i]를 저장함
			t[i]=t[j];//i에 j를 저장함
			t[j]= tmp;//tmp 를 저장함 

			}
//			System.out.println(j);

		//배열 ball중의 3가지 수를 배열 ball3에 복사한다. 
		System.arraycopy(t, 0, ball, 0, 3);
		
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i]);
			//결과 값은 486 임 ,결과값은 다를수있다. 
		
			
		}
	}}
//
//

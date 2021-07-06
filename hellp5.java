

class hellp5{
	public static void main(String[]args) {
		biva a = new biva();
		System.out.println("mm.add(3,3) 결과 :"+a.add(3, 3));
		System.out.println("mm.add(8L,9L) 결과 :"+a.add(8,9));
		System.out.println("mm.add(100L,2931L) 결과 :"+a.add(100,2931));
		System.out.println("mm.add(4L,893L) 결과 :"+a.add(4, 893));
		
		int[] is= {200,1000,30,2,55,90,8,2,3,5,2,4,5,2,3,1};
	
		System.out.println("mm.add(a) 결과 :"+a.add(is));
		
	}
	}
	
	class biva {
		int add (int a,int b) {
		System.out.println("int add(int a, int b)-");
		return a+b;}
		
		long add (long a, int b) {
			System.out.println("long add(int a, int b)-");
			return a+b;}
		
		long add (int a, long b) {
			System.out.println("long add(int a,long b)-");
			return a+b;}
		long add (long a, long b) {
			System.out.println("long add(long a, long b)-");
			return a+b;}
	
		int add (int[] a) {//[]안에 있는 모든 값을 더해준다.
			System.out.println("int add (int[])-");
			int c = 0;//답을 출력할 변수를 초기화시킴
			for (int i = 0; i < a.length; i++) {//a의길이 만큼을 지정 시킴
				c += a[i];//c = c+a[a의 길이만큼] 수식을 지정함			
//			return c;
			}	
		
	return c;
		
			
}}




class hellp5{
	public static void main(String[]args) {
		biva a = new biva();
		System.out.println("mm.add(3,3) ��� :"+a.add(3, 3));
		System.out.println("mm.add(8L,9L) ��� :"+a.add(8,9));
		System.out.println("mm.add(100L,2931L) ��� :"+a.add(100,2931));
		System.out.println("mm.add(4L,893L) ��� :"+a.add(4, 893));
		
		int[] is= {200,1000,30,2,55,90,8,2,3,5,2,4,5,2,3,1};
	
		System.out.println("mm.add(a) ��� :"+a.add(is));
		
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
	
		int add (int[] a) {//[]�ȿ� �ִ� ��� ���� �����ش�.
			System.out.println("int add (int[])-");
			int c = 0;//���� ����� ������ �ʱ�ȭ��Ŵ
			for (int i = 0; i < a.length; i++) {//a�Ǳ��� ��ŭ�� ���� ��Ŵ
				c += a[i];//c = c+a[a�� ���̸�ŭ] ������ ������			
//			return c;
			}	
		
	return c;
		
			
}}


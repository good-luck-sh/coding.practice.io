

class hiphop {
	long a,b ;//iv�� ������ 
	long add() { return a+b;}
	long subtract() { return a-b;}
	long multplay() { return a*b;}
	double divide() { return a/b;}
	//�ν��Ͻ� ���� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű� ������ �ʿ����. 
	
	static long add(long c, long d) {return c+d;}
	static long subtract(long c, long d) {return c+d;}
	static long multplay(long c, long d) {return c+d;}
	static double divide(double c , double d) {return c/d;}
}  //�ν��Ͻ��� ������� �Ű����������� �۾��� �����ϴ�.


class hellp4 {
	public static void main (String[]args) {
		//Ŭ���������� ȣ��,�ν��Ͻ� �������� ȣ�Ⱑ�� 
		System.out.println(hiphop.add(900,50));//ȣ���Ҷ��� �ۼ� 
		System.out.println(hiphop.subtract(200,700));
		System.out.println(hiphop.divide(274.5, 2432.2));
		System.out.println(hiphop.multplay(2384,213));
		//Ŭ���� �޼����� ��� �Ѱ����Ѱ����� ��°��� �����Ҷ� ���� 
		System.out.println();
		System.out.println();
		
		hiphop x = new hiphop();//�ν��Ͻ��� �����Ѵ�.
		x.a = 2341;
		x.b = 584;
		
		System.out.println(x.add());
		System.out.println(x.divide());
		System.out.println(x.multplay());
		System.out.println(x.subtract());
	}//�ν��Ͻ��޼����� ��� �ʿ��� ��°��� ���ؼ� ��ü �����ÿ� ����.
}
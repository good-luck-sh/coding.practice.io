class ����Ǯ��7{
	public static void main (String[]args) {
		point a = new point(1,1);
		//p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(a.getDistance(2,2));
	}
	}

class point{
	int x;
	int y;
	
	point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	double getDistance ( int x1, int y1) {
	return Math.sqrt ((x-x1)*(x-x1))+((y-y1)*(y-y1));
		
	}}
	

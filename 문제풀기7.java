class 문제풀기7{
	public static void main (String[]args) {
		point a = new point(1,1);
		//p와 (2,2)의 거리를 구한다.
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
	

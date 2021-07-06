class point {
	int x ,y;
	point(int x, int y){//생성자의 기본생성자를 컴파일러가 호출함 super();//object();
		this.x = x;//인스턴스화와 구별하기 위한 class의 this
		this.y = y;//인스턴스화와 구별하기 위한 class의 this
	}
}
class point3D extends point{
	int z;
	point3D(int x, int y,int z){//상속2ㄱㅐ+ 자손 1개 
		super(x, y);//조상의 생성자를 호출함
		this.z= z;
	}
}
public class hellp11{
	public static void main(String[] args) {
		point3D o = new point3D(1,2,4);
		System.out.println("x="+o.x+" "+"y="+o.y+" "+"z="+o.z);
		
	}
}
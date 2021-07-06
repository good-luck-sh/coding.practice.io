

public class hellp10{
	public static void main(String[] args) {
		child ch = new child();
		ch.mathod();
		
	}
}
class parent {
	int x = 10; //super
}
class child extends parent{
	int x = 20; //this 
	void mathod() {
		System.out.println("x="+x);
		System.out.println("super x ="+super.x);
		System.out.println("this x ="+this.x);
	}
}
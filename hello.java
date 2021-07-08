
public class hello {
	

	public static void main(String[] args) {
	
		value v1 = new value(10);//v1의 객체생성
		value v2 = new value(10);//v2의 객체생성
		
		if(v1.equals(v2))//if값으로 v1과 v2가 동일한지 확인함. 
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");
		
	}
	}

class value{//value값의 내용
	int value;
	
	value (int value){
		this.value=value;//value의 객체값선언함.
		
}}
//동일로 변경하기위해서는 hello1에 작성


public class hello {
	

	public static void main(String[] args) {
	
		value v1 = new value(10);//v1�� ��ü����
		value v2 = new value(10);//v2�� ��ü����
		
		if(v1.equals(v2))//if������ v1�� v2�� �������� Ȯ����. 
			System.out.println("v1�� v2�� �����ϴ�");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�");
		
	}
	}

class value{//value���� ����
	int value;
	
	value (int value){
		this.value=value;//value�� ��ü��������.
		
}}
//���Ϸ� �����ϱ����ؼ��� hello1�� �ۼ�

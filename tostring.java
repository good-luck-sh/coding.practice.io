import java.util.Objects;

class Card{//��ü���� �ο��� class ��
	String kind;//���ڿ� kind
	int number;//���ڷ� number����

	

	
	Card(){//ī�尪�� �ҷ����� 
	this("SPADE",1);//�����ڿ��� �ٸ� ������ ȣ���ϱ� this���� �����. 
}
	Card(String kind,int number){
		this.kind = kind;//��ü �����θ� ��Ī�ϴ� �� <������ ��Ī�� :super>
		this.number=number;//��ü �����θ� ��Ī�ϴ� ��
	}
	
	public String toString() {//�������̵��Ͽ� card�� �ν���Ʈ���� ���ڿ��� ��ȯ��.
		return "kind:"+kind+",number:"+number;
	}
//	
//	private boolean equals (object obj) {//���� equals�� ���� �����ϰ� ��������� ��� 
//		if(!(obj instanceof Card))// instanceof�� ������ �´��� Ȯ���Ͽ����ϰ�
//			return false;
//			Card c2 = (Card)obj;//obj�� ��� ����ȯ�� ���־���Ѵ�. 
//	}
//	private int hashcode() {//
//		return Objects.hashCode(kind);
//	}


public class tostring{
	public static void main(String[]arg) {
		Card c1 = new Card();
		Card c2 = new Card("HEART",10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	}}


public class hachcode{
	public static void main(String[]arg) {
		String A1 = new String("abc");
		String A2 = new String("abc");
		
		System.out.println(A1.equals(A2));//A1�� ���� A2�� ���� �����ϰ� ����
		System.out.println(A1.hashCode());//A1�� �ؽ��ڵ��?
		System.out.println(A2.hashCode());//A2�� �ؽ��ڵ��?
		//equals�� ������ �����ϰ� ������� ������ hash�ڵ��� ���� �����ϰ� �������Ѵ�. 
		//�׷��� hashcode�� ���� �����ϰ� ����������� Ȯ���۾�
		System.out.println(System.identityHashCode(A1));
		//identityhashcode= ��ü�� �ּҰ��� ��ȯ�ϴ� ���̴�. ��ü���� �ٸ��ּҰ��־� �񱳰����� ����
		System.out.println(System.identityHashCode(A2));
		
	}
}
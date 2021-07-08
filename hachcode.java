public class hachcode{
	public static void main(String[]arg) {
		String A1 = new String("abc");
		String A2 = new String("abc");
		
		System.out.println(A1.equals(A2));//A1의 값과 A2의 값을 동일하게 만듦
		System.out.println(A1.hashCode());//A1의 해쉬코드는?
		System.out.println(A2.hashCode());//A2의 해쉬코드는?
		//equals의 값으로 동일하게 만들었기 때문에 hash코드의 값도 동일하게 만들어야한다. 
		//그래서 hashcode의 값을 동일하게 만들었는지의 확인작업
		System.out.println(System.identityHashCode(A1));
		//identityhashcode= 객체의 주소값을 반환하는 것이다. 객체마다 다른주소가있어 비교값으로 넣음
		System.out.println(System.identityHashCode(A2));
		
	}
}
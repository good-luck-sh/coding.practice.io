package cjcj;
class hellp20{
	public static void main (String[]args) {
		try {
			throw new Exception("���Ƿ� �߻�������");
			//Exception e = new Exception(���Ƿ� �߻�������);
			//throw e;�� ����
		}
		catch(Exception e ){
			e.printStackTrace();
			System.out.println("�����޼���:"+e.getMessage());
		}
		System.out.println("���α׷��� ���� ���� �Ǿ���");
	}
}
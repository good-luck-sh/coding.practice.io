package cjcj;
class hellp20{
	public static void main (String[]args) {
		try {
			throw new Exception("고의로 발생시켰음");
			//Exception e = new Exception(고의로 발생시켰응);
			//throw e;를 줄임
		}
		catch(Exception e ){
			e.printStackTrace();
			System.out.println("에러메세지:"+e.getMessage());
		}
		System.out.println("프로그램이 정상 종료 되었음");
	}
}
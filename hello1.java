
class person{
	long id;
	public boolean equals(Object obj) {
		id = ((person)obj).id;
	
		if(!(obj instanceof person))
			return false;
		return false;
		
	}
	

	
	person(long id){
		this.id=id;
		
	}


	public static class hello1 {
	public static void main(String[] args) {
		person p1 = new person(8011081111222L);
		person p2 = new person(8011081111222L);
		
		p1.equals(p2);
		
		
		if(p1.equals(p2))
		System.out.println("동일합니다.");
		else
			System.out.println("다른값입니다.");
	
	
	}}}
		
		
	




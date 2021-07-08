
 class box{//클래스로 box를 입력
	long tax;
	public boolean equals(Object obj) {//equlas를 오버라이딩 해줘야한다. 
		if (!(obj instanceof box))//만약 box가 obj의 형변환 참조값이 아니라면 
			return false;//false 값을 도출
		box b = (box)obj;//obj를 형변환해줌, 항상해줘야함, 조상의 리모컨에 없는 기능으로 항상 형변환을 해줘서
		//조상과 자손의 리모컨이 동일하게 만들어 줌.
			return this.tax==b.tax;//obj의 객체값과 box의 객체를 같은 값으로 return함
		
	}

	box(long tax ){// 서로다른 객체는 항상 주소가 다르다.
		this.tax=tax;
	}
	
public static class equlas1 {

	public static void main(String[] args) {//b1과 b2는 항상 다른값이다. iv는 개별적이기 때문에 
		box b1 = new box(8011081111222L);
		box b2 = new box(8011081111222L);
		if(b1.equals(b2))
			System.out.println("box 1번과 2번은 동일한 값이다.");
		else
			System.out.println("box 1번과 2번은 다른 값이다.");
		}}}

	



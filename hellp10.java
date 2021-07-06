package cjcj;


class product {//주된 class하나 
	int price;//물건의 가격
	int bonuspoint;//보너스포인트
	int tax;//세금을 주다
	product(int price){//가격을 지불한다면
		this.price+=price;
		bonuspoint+= (int)(price/10.0);//보너스 포인트는 가격의 10%이며 정수로 표현
		tax+=(int)(price/10.0);

	}

}
class tv extends product{//product의 자손 tv
	tv(){//조상생성자인 price를 생성한다. 
		super(100);	}//tv의 가격은 100만원으로 한다. 
	
	public String toString() { return "tv";}//tv라는 문자열을 반환한다.
	//object 클래스의 string을 오버라이딩한다(자손에서 수정한다)
}
class computer extends product{//product의자손 computer
	computer (){//조상생성자인 price를 생성
		super(300);//computer의 가격은 300만원으로 한다. 
	}
	public String toString() { return "computer"; }//computer라는 문자열을 반환한다. 
	//위와 마찬가지로 object클래스의 string을 오버라이딩한다. ->형제끼리는 상속불가하며, 큰값에만 상속하고 나머지는 포함관계로이뤄짐


	}

class buyer{//고객등장!, 행동을 할 실행할 부분에 대해서 하나 설계
	int money= 1000;//가지고 있는 돈의 금액 1000만원 class항목 초기화함 
	int bonuspoint = 0;///포인트는 0원을 가지고 있다. class항목 초기화함  
	int valueaddtax =0;//부가가치세는 0원이다.class항목을 초기화함 
	void buy (product c) {//매서드항목 구매하다 : product에 대한 값을 생성함 
		if (money < c.price) {//만약 돈이 product의가격보다 낮다면 /product의 값을 c로 설정했기 때문에 c.price로 
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

	
		money -= c.price;//money값을 어떻게 할껀지 product c를 소환하여 금액저장
		money -= c.tax;//money에서 tax값도 함께 빠진다고 저장함
		bonuspoint +=c.bonuspoint;//보너스포인트도 저장
		valueaddtax+= c.tax;//부가가치세를 저장함. 
		
		System.out.println(c+"를 구입하셨습니다 ");//product안에 price와 bonus를 적었기때문에 product만 소환함
		//buyer안에서 표현할 수 있는 부분을 표현할 것. 설계할 때, 이런 방식으로 설계하면 될 것.
	
		
		
	}
}
public class hellp10{
	public static void main (String[]args) {
		buyer e = new buyer();//행동을 할 값에 대해서 하나 설계함
//		Scanner scanner= new Scanner(System.in);//나중에 더배우고 넣을 부분
		
		e.buy(new tv());//tv를 살것이다. 
		e.buy(new computer());//computer를 살것이다. 
		
		System.out.println("현재남은돈은"+e.money+"입니다.");
		System.out.println("현재 보너스점수는 "+e.bonuspoint+"입니다.");
		System.out.println("현재 부가가치세 세금은"+e.valueaddtax+"입니다.");
	}
}

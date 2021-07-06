package cjcj;

import java.util.Arrays;

class product2{

	int price;//가격
	int bonuspoint;//보너스포인트
	int valuetax;//세금
	int sale;//할인가격
	
	product2(int price){
		this.price = price;
		sale = (int)(price/50.0);
		bonuspoint = (int)(sale/5.0);
		valuetax = (int)(price/10.0);
	}
	 product2 () {}//기본생성자 
	 }

class dvd extends product2{
	 dvd() {super(200);}//price의 값을 300으로 지정함,자손클래스는 공유가능
	 public String toString() {return "dvd";}//글자값을 return한다. object의 클래스를가지고와서 작성	

	}
class tv1 extends product2{
	tv1() {super(300);}
	public String toString() {return"tv";}
}
class audio extends product2{
	audio(){super(80);}
	public String toString() {return "audio";}
	}
class computer1 extends product2{
	computer1() {super(150);}
	public String toString() {return "computer";}
		
}
class buyer2 {
	int money = 2500;//buyer2이 가지고 있는 돈,그돈으로 초기화
	int bonuspoint = 0;//보너스포인트의 초기화
	int sale = 0;//buyer이 받고 있던 세일의 혜택을 초기화,class buyer에 작성하려면 아래에서 다시 초기화해줘야함.자손관계가 아니기때문
	int valuetax = 790;//현재까지 내야하는 부가세액 
	product2[] cart=new product2[10];//클래스 product2로 되있는 카트안에 10개를 넣을수 있음을 작성
	int i =0;//i에 대해서 초기화
	
	void buy(product2 p){//class product2로 된 메서드를 작성함
		if (money<p.price) {//만약 //product2의 price보다 money가 작다면을 의미 product의 단축으로 p를 적음
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;//return값을 넣어야 출력이 가능함.
		}
	
		money -=p.price;
		sale =p.sale;
		valuetax +=p.valuetax;
		bonuspoint=p.bonuspoint;
		cart[i++] = p;//product cart안에 담은 값을 출력한다. ++를 이용하여 하나씩추가한다.
		System.out.print(p.price+"가격의 물품인");
		System.out.println(p+"를 구입하셨습니다.");//그리고 현재 i값에 대한 설정if문이 없음
		System.out.println("해당하는 세금은"+p.valuetax+"입니다.");
		System.out.println("해당하는 보너스 포인트는"+p.bonuspoint+"입니다.");
		System.out.println("구매하신 제품의 할인은"+p.sale+"입니다.");
	
		}
		void summary () {// 구매한제품에 대해서 정보를 요약해줌
			int sum = 0;//모든것을 더한 금액
			String itemlist = "";//아이템리스트에 대해서 "" 초기화한다.string=""
			int tax = 0;//초기화
			int goodsale = 0;//초기화
			int total = 0;//초기화
			
			
			
			for (int i = 0; i < cart.length; i++) {//cart의 길이를 i에 지정한다. ~ 동안문안에 
				if (cart[i]==null) break;//if문을 작성, cart안에 비었을경우(null) break한다.
				sum += cart[i].price;//sum의 값 설정
				itemlist += (i==0)?""+cart[i]:","+cart[i];//아이템리스트설정 i가0이면?','를넣지마세요,아니라면 ,를넣으세요.마지막에 ,를 없애기 위함
				tax +=cart[i].valuetax;//tax의 값 설정
				goodsale += cart[i].sale;//sale의 값 설정
				total = (sum+tax)-goodsale;//total값을 설정한다. 물품가격+부가세 -할인금액으로
					
				}
				System.out.println("구매하신 물품의 총금액은"+sum+"만원입니다.");
				System.out.println("구매하신 제품은 "+itemlist+"입니다");
				System.out.println("구매하신 부가세의 금액은"+tax+"입니다.");
				System.out.println("구매하신 제품의 할인은"+goodsale+"입니다.");
				System.out.println("내셔야하는 금액은"+total+"입니다.");
			}
}

	class hellp11 {//실제 메인 클래스
		public static void main(String[]args) {
			buyer2 p= new buyer2();//객체생성
			p.buy(new tv1());
			p.buy(new dvd());
			p.buy(new audio());
			p.buy(new computer1());
			p.summary();
		}
	}

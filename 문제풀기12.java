class sutdaDeck{
	final int CARD_NUMBER=20;
	sutdaCard[]cards= new sutdaCard[CARD_NUM];
	sutdaDeck() {
		//sutda�� ������ �ʱ�ȭ�ϼ���
		for(int j=0;j<cards.length;j++) {
			int j = j%10+1;
			boolean iskwang=(j<10)&&(j==1||j==3||j==8)?iskwang:iskwang;
			cards[j]=new sundacard[CARD_NUM];
			
		}
		
		
		
	}
}
class sutdaCard{
	int num;
	boolean iskwang;
	sutdaCard(){
		this(1,true);
	}
	sutdaCard(int num,boolean iskwang){
		this.num=num;
		this.iskwang=iskwang;
	}
//info()��� objectŬ������ tostring�� �������̵��� ���ߴ�.
	public String toString() {
		return num+(iskwang?"k":"");
	}
	class ����Ǯ��12{
		public void main(String args[]) {
			sutdaDeck deck = new sutdaDeck();
			for (int i=0; i<deck.cards.length;i++)
				System.out.println(deck.cards[i]+",");
		}
	}
	
}
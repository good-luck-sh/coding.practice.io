class mytv{
	boolean power;
	int channel;
	int volum;
	
	final int MAX_VOLUM=100;
	final int MIN_VOLUM=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL= 0;
	
	void turnOnOff(){//power�� ����  true��� false�� false��� true�� �ٲ۴�
		power = !power;
		
	}
	void volumeUp() {
		// �������� max_volume���� �������� ���� 1�� ������Ų��.
		if(MAX_VOLUM<volum) {
			volum++;
		}
			
	}
	void volumeDown() {
		//volume�� ���� min_volume���� Ŭ���� 1�� ���ҽ�Ų��
		if(MIN_VOLUM>volum) {
			volum--;
		}
	}
	void channelUp() {
		//channel�� ���� 1������Ų��
		//���� channel�� max_channel�̸�, channel�� ���� min_channel�� �ٲ۴�
		++channel;
		if(channel==MAX_CHANNEL) {
			
			channel=MIN_CHANNEL;
		}
	}
	void channelDown() {
		//channel�� ���� 1�� ���ҽ�Ų��
		//����channel�� min channel �̸�, channel�� ���� max_channel�� �ٲ۴� 
		--channel;
		if(channel==MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		}
	}
}
class ����Ǯ��10{
	public static void main(String[]args) {
		mytv n = new mytv();
		n.channel = 100;
		n.volum =0;
		System.out.println("CH:"+n.channel+"vol:"+n.volum);
		
		n.channelDown();
		n.volumeDown();
		System.out.println("ch:"+n.channel+"vol:"+n.volum);
		
		n.volum=100;
		n.volumeUp();
		n.channelUp();
		System.out.println("ch:"+n.channel+"vol:"+n.volum);
		
	}
}
//����� ch: 100 vol:0
//ch:99,vol:0
//ch:100,vol:100
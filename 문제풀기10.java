class mytv{
	boolean power;
	int channel;
	int volum;
	
	final int MAX_VOLUM=100;
	final int MIN_VOLUM=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL= 0;
	
	void turnOnOff(){//power의 값이  true라면 false로 false라면 true로 바꾼다
		power = !power;
		
	}
	void volumeUp() {
		// 볼륨값이 max_volume보다 작을때만 값을 1씩 증가시킨다.
		if(MAX_VOLUM<volum) {
			volum++;
		}
			
	}
	void volumeDown() {
		//volume의 값이 min_volume보다 클때만 1씩 감소시킨다
		if(MIN_VOLUM>volum) {
			volum--;
		}
	}
	void channelUp() {
		//channel의 값을 1증가시킨다
		//만일 channel이 max_channel이면, channel의 값을 min_channel로 바꾼다
		++channel;
		if(channel==MAX_CHANNEL) {
			
			channel=MIN_CHANNEL;
		}
	}
	void channelDown() {
		//channel의 값을 1씩 감소시킨다
		//만일channel이 min channel 이면, channel의 값을 max_channel로 바꾼다 
		--channel;
		if(channel==MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		}
	}
}
class 문제풀기10{
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
//결과값 ch: 100 vol:0
//ch:99,vol:0
//ch:100,vol:100
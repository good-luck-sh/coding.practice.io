package cjcj;



class hellp16{
	public static void main (String[]args) {
		button b= new button("start");
		b.addactionlistener(new actionlister() {
			public void actionperformed(actionevent e ) {
				system.out.println("actionevent occurred!!!");
			}
		});
	}
	
	
}
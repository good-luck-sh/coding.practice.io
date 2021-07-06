
class 문제풀기3 {
	public static void main(String[] args) {
		int[][] a = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		int total = 0;
		float avg = 0.0f;
		
		for (int k = 0; k < a.length; k++) {
			System.out.println("k="+k);
			for (int k2 = 0; k2 < a[k].length; k2++) {
				
				total+= a[k][k2];
				}
			avg = total/(Float)(a.length*1f*a[0].length)  ;
				
			} 
			
		System.out.println("total="+total);
		System.out.println("avg="+avg);
	}
}


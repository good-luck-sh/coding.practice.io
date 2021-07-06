
package cjcj;
class hellp21{
	public static void main(String[]args) {
		int [] arr = { 10, 20 ,30, 40, 50};
		int sum = 0;
		double arv =0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
			arv = sum / (double)arr.length;
		}
		
		System.out.println("sum="+sum);
		System.out.println("arv="+arv);
		
	}
}

public class recapdemo {

	public static void main(String[] args) {
		
		double[] Mylist = {1.2,1.5,2.6,6.8};
		double total=0;
		double max = Mylist [0];
		for(double number:Mylist) { 
			if(max<number) {
			   max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
			System.out.println("Toplam = " + total);	
			 System.out.println("The Biggest = " + max);
			 
	}

}


public class multidimensionalarrydemo {

	public static void main(String[] args) {
		String[][] cities = new String [3] [3];
		

		cities[0] [0] ="Ýstanbul";
		cities[0] [1] ="Los Angeles";
		cities[0] [2] ="Londra";
		cities[1] [0] ="Berlin";
		cities[1] [1] ="Paris";
		cities[1] [2] ="Amsterdam";
		cities[2] [0] ="Madrid";
		cities[2] [1] ="New York";
		cities[2] [2] ="Sivas";
		
		
		for(int i = 0; i<=2;i++) {
		    System.out.println("--------------------------");
			for(int j = 0;  j<=2;j++) {
		       System.out.println(cities[i] [j]);
		       
		       
		    }
		}      

	}

}

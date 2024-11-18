package clases;

public class IfTernario {

	public static void main(String[] args) {
		
		int a = 5;
		//String s1
		
		if (a%2 == 0) {
			System.out.println("PAR"); //s1 = PAR
		}
		else {
			System.out.println("IMPAR"); //s1 = IMPAR
		}
		//System.out.println(s);
		
		/*ES IGUAL A: */ String s =(a%2 == 0) ? "PAR" : "IMPAR";
		System.out.println(s);
		
		/*ES IGUAL A: */ System.out.println((a%2 == 0) ? "PAR" : "IMPAR");
		
		
		//***el primero(par) es el if y el segundo(impar) es el else
				
				
		
				
		
		
		
	}
	
}

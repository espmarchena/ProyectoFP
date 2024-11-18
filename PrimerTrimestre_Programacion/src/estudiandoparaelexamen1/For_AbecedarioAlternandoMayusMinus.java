package estudiandoparaelexamen1;

public class For_AbecedarioAlternandoMayusMinus {

	public static void main(String[] args) {
		// imprimir abecedario alternando mayusculas y minusculas (AaBbCcDd...)
		
		for (char c='A'; c<='Z'; c++) { 					// recorro de la A a la Z y voy aumentando
			System.out.print(c);
			System.out.print((char)(c+32));
		}		
		System.out.println("");
		
		
		for (char c='A', d='a'; c<='Z';c++,d++){             // declaro dos variables y le digo que lo haga hasta la Z y que aumente ambas variables
			System.out.print(c);
			System.out.print(d);
		}
		System.out.println("");
		
		
		char c='A', d= 'a';
		while (c<='Z'){
		 	System.out.print(c);
		 	System.out.print(d);
		 	c++;
		 	d++;
		 }
		 
		
	}

}

package estudiandoparaelexamen1;

public class For_AbecedarioAlternandoMayusMinus_Repe {

	public static void main(String[] args) {
	
		for (char c='A'; c<='Z';c++) { //si 'c' es igual a A y es igual o menor a Z, aumenta valor de 'c' de uno en uno
			System.out.println(c); //imprime 'c' (mayusculas)
			System.out.println((char)(c+32)); //imprime en caracteres 'c'+32 (así convierte a minusculas)
			
		}
		
		

	}

}

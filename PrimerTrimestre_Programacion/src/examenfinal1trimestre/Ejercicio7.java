package examenfinal1trimestre;

public class Ejercicio7 {
	
    public static void main(String args[]) {
        int i = 0;
      //LE FALTABAN LAS LLAVES DEL BUCLE WHILE PARA QUE NO SEA UN BUCLE INFINITO.
      //ADEMAS, SE DEBE INCREMENTAR DESPUES DE IMPRIMIR Y NO AL REVES, PARA QUE EMPIECE EN EL 0 Y NO DIRECTAMENTE EN EL 1
        
        while (i < 100) { //ESTA  LLAVE  
            System.out.println(i);
            i++;
        }//Y ESTA LLAVE
    }
}


		
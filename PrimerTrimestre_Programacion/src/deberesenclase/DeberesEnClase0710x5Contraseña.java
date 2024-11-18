package deberesenclase;
import java.util.Scanner;
public class DeberesEnClase0710x5Contraseña {
	public static void main (String args []) {
		
		
		/*- Pedir un usuario y una contraseña y utilizando una variable booleana mostrar un mensaje diciendo si los datos son correctos o incorrectos.
		 * Comparar los datos introducidos con datos fijos (usuario = pepe y contraseña = pepe2024)*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Contraseña: ");
		String pass = sc.nextLine();
		
		boolean usuarioValido = usuario.equals("pepe") ? true : false;
		boolean passValida = pass.equals("pepe2024") ? true : false;
		
		if (usuarioValido && passValida) {
			System.out.println("Usuario correcto");
		}
		else if (!usuarioValido && !passValida){
			System.out.println("Usuario no válido: Usuario y contraseña incorrectas");
		}
		else if (!usuarioValido && passValida){
			System.out.println("Usuario no válido: Usuario incorrecto");
		}
		else {
			System.out.println("Usuario no válido: Contraseña incorrecta");
		}
		
		
		sc.close();
	}
}

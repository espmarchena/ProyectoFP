package proyecto;

import java.util.Scanner;

public class AltaUsuarios {
    static Scanner sc = new Scanner(System.in); // DECLARO SCANNER FUERA DE LAS FUNCIONES PARA PODERLO USAR EN TODAS

    static String[][] usuarios = new String[100][8];

    // Variable para una de las funciones de validar
    static String[] datos = new String[3];

    // Contador de usuarios registrados
    static int contadorUsuarios = 0;

    public static final int PRECIO_CAMISETAS = 5;
    public static final int PRECIO_PANTALONES = 7;
    public static final int PRECIO_ABRIGOS = 15;
    public static final int PRECIO_ZAPATOS = 10;

    // Variables globales para almacenar totales de la venta del usuario
    static int suma = 0;
    static int acumuladorTotal = 0;
    static int sumaCamisetas = 0;
    static int sumaPantalones = 0;
    static int sumaAbrigos = 0;
    static int sumaZapatos = 0;

    static int[] sumas = new int[4];  // Para almacenar las cantidades de productos vendidos totales
    static int[] sumasVendidas = new int[4];  // Contador de productos vendidos (camisetas, pantalones...)
    static int[] sumasCompradas = new int[4];  // Contador de productos comprados (camisetas, pantalones...)

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        naiSpe(); //FUNCION PRINCIPAL

       sc.close();
    }
    
    public static void naiSpe(){
    	 // Bucle de registro de usuarios
        while (true) {
            System.out.println("\n--- Alta de Usuario ---");

            // Validar y almacenar nombre y apellido
            String nombre = validar("Nombre");
            String apellido = validar("Apellido");

            // Guardar en los arrays
            usuarios[contadorUsuarios][0] = nombre;
            usuarios[contadorUsuarios][1] = apellido;

            // VALIDAR EMAIL
            bucleMail();

            // VALIDAR TELEFONO (9 caracteres y solo numéricos)
            usuarios[contadorUsuarios][2] = pedirTelefonoValido();

            // VALIDAR DNI´S
            usuarios[contadorUsuarios][4] = pedirDniValido();

            // VALIDAR FECHA DE NACIMIENTO
            usuarios[contadorUsuarios][5] = pedirFechaNacimientoValida();

            // validamos login
            String login = validar("Login");
            usuarios[contadorUsuarios][6] = login;

            // VALIDAR PASWORD
            usuarios[contadorUsuarios][7] = pedirPasswordValida();

            contadorUsuarios++;

            // AGREGAR OTRO USUARIO
            String respuesta = pedirDato("¿Desea agregar otro usuario? (s/n): ");
            if (respuesta.equals("n") || respuesta.equals("N")) {
                break; // Salir del bucle si el usuario elige "n"
            }

        }

        // MOSTRAR LA LISTA DE USUARIOS REGISTRADOS
        System.out.println("\n--- Usuarios Registrados ---");
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) { //comprobar que el usuario esta registrado
                System.out.println("Usuario #" + (i + 1));
                System.out.println("Nombre: " + usuarios[i][0]);
                System.out.println("Apellido: " + usuarios[i][1]);
                System.out.println("Email: " + usuarios[i][3]);
                System.out.println("Teléfono: " + usuarios[i][2]);
                System.out.println("DNI: " + usuarios[i][4]);
                System.out.println("Fecha de Nacimiento: " + usuarios[i][5]); 
                System.out.println("Login: " + usuarios[i][6]);
                System.out.println("Password: " + usuarios[i][7]);
                System.out.println();
            }
        }

        switchPrincipal("opcion");
    }
    
    
    
    // FUNCION SWITCH PRINCIPAL
    public static String switchPrincipal(String opcion) {
        do {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("Opción 1. Vender");
            System.out.println("Opción 2. Comprar");
            System.out.println("Opción 0. Cerrar Sesión");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    opcionVenta(); // Funcion para las ventas
                    break;
                case "2":
                    opcionCompra(); // Funcion para las compras
                    break;
                case "0":
                    System.out.println("¡Adiós!"); 
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (!opcion.equals("0"));

        System.out.println("¡Esperamos volver a verte pronto!");
        return opcion;
    }

    // FUNCION DEL SWITCH MENU COMPRA
    public static String opcionCompra() {
        String salir = "";

        do {
            mostrarMenuCompra(); // mostrar el menu de compra
            String opcion = pedirDato("¿Qué prenda deseas comprar?");

            switch (opcion) {
                case "1":
                    System.out.println("¿Cuántas unidades de camisetas deseas comprar?");
                    manejarCompra(PRECIO_CAMISETAS, 0);
                    break;
                case "2":
                    System.out.println("¿Cuántas unidades de pantalones deseas comprar?");
                    manejarCompra(PRECIO_PANTALONES, 1);
                    break;
                case "3":
                    System.out.println("¿Cuántas unidades de abrigos deseas comprar?");
                    manejarCompra(PRECIO_ABRIGOS, 2);
                    break;
                case "4":
                    System.out.println("¿Cuántas unidades de zapatos deseas comprar?");
                    manejarCompra(PRECIO_ZAPATOS, 3);
                    break;
                case "0":
                    mostrarCestaCompra();
                    salir = preguntaRespuesta("¿Deseas continuar comprando? (s/n)");
                    break;
                default:
                    System.out.println("Opción no correcta");
            }
        } while (!(salir.equals("n")) && !(salir.equals("N")));

        return "";
    }

    // VENTA DEL USUARIO
    public static void opcionVenta() {
        String salir = "";
        String opcion = "";
        do {
            mostrarMenu(); // muestra las opciones del switch
            opcion = pedirDato("¿Qué prenda deseas vender?");

            switch (opcion) {
                case "1":
                    System.out.println("¿Cuántas unidades de camisetas deseas vender?");
                    manejarVenta(PRECIO_CAMISETAS, 0);
                    break;

                case "2":
                    System.out.println("¿Cuántas unidades de pantalones deseas vender?");
                    manejarVenta(PRECIO_PANTALONES, 1);
                    break;

                case "3":
                    System.out.println("¿Cuántas unidades de abrigos deseas vender?");
                    manejarVenta(PRECIO_ABRIGOS, 2);
                    break;

                case "4":
                    System.out.println("¿Cuántas unidades de zapatos deseas vender?");
                    manejarVenta(PRECIO_ZAPATOS, 3);
                    break;

                case "0":
                    mostrarCesta();
                    salir = preguntaRespuesta("¿Deseas continuar? (s/n)");
                    break;

                default:
                    System.out.println("Opción no correcta");
            }
        } while (!(salir.equals("n")) && !(salir.equals("N")));
    }

    // FUNCION PARA IMPRIMIR LAS OPCIONES
    public static void mostrarMenu() {
        System.out.println("1. CAMISETAS: " + PRECIO_CAMISETAS + " €");
        System.out.println("2. PANTALONES: " + PRECIO_PANTALONES + " €");
        System.out.println("3. ABRIGOS: " + PRECIO_ABRIGOS + " €");
        System.out.println("4. ZAPATOS: " + PRECIO_ZAPATOS + " €");
        System.out.println("0. CESTA");
    }

    // CALCULAR EL MARGEN DE GANANCIAS
    public static int calcularPrecio(int precioUnitario, int margen) {
        return precioUnitario + margen;
    }

    // MOSTRAR OPCIONES DE COMPRAS(CON SUS PRECIOS)
    public static void mostrarMenuCompra() {
        System.out.println("1. CAMISETAS: " + calcularPrecio(PRECIO_CAMISETAS, 5) + " €");
        System.out.println("2. PANTALONES: " + calcularPrecio(PRECIO_PANTALONES, 13) + " €");
        System.out.println("3. ABRIGOS: " + calcularPrecio(PRECIO_ABRIGOS, 12) + " €");
        System.out.println("4. ZAPATOS: " + calcularPrecio(PRECIO_ZAPATOS, 9) + " €");
        System.out.println("0. CESTA");
    }

    //MANEJAR LA COMPRA
    public static void manejarCompra(int precio, int lugarPrenda) {
        int respuesta = pedirDatoInt(); // unidades que quiere comprar

        if (respuesta > 0) {
            sumasCompradas[lugarPrenda] += respuesta; // contador prendas
            int acumulador = calcularPrecio(precio, 0) * respuesta; // precio total
            acumuladorTotal += acumulador; // suma total
        }
    }

    // MANEJAR LA VENTA
    public static void manejarVenta(int precio, int lugarPrenda) {
        int respuesta = pedirDatoInt(); // Unidades que se desean vender

        if (respuesta > 0) {
            sumasVendidas[lugarPrenda] += respuesta; // contador prendas vendidas
            suma += respuesta; // total de productos
            int acumulador = precio * respuesta; //precio total 
            acumuladorTotal += acumulador; // Sumar al total general
        }
    }

    // FUNCION PARA MOSTRAR LA CESTA DE LA COMPRA
    public static void mostrarCestaCompra() {
        int acumuladorTotalC = calcularPrecio(PRECIO_CAMISETAS, 5) * sumasCompradas[0];
        int acumuladorTotalP = calcularPrecio(PRECIO_PANTALONES, 13) * sumasCompradas[1];
        int acumuladorTotalA = calcularPrecio(PRECIO_ABRIGOS, 12) * sumasCompradas[2];
        int acumuladorTotalZ = calcularPrecio(PRECIO_ZAPATOS, 9) * sumasCompradas[3];
        int acumuladorTotalCompra = acumuladorTotalC + acumuladorTotalP + acumuladorTotalA + acumuladorTotalZ;

        System.out.println("Total productos comprados: " + suma); // para ver el total de productos
        System.out.println("Artículos comprados:");
        System.out.println("\tCamisetas: " + sumasCompradas[0]);
        System.out.println("\tPantalones: " + sumasCompradas[1]);
        System.out.println("\tAbrigos: " + sumasCompradas[2]);
        System.out.println("\tZapatos: " + sumasCompradas[3]);
        System.out.println("Total compra: " + acumuladorTotalCompra + " €");
    }

    // MOSTRAR LA CESTA TOTAL
    public static void mostrarCesta() {
        System.out.println("Total productos vendidos: " + suma); // total de productos
        System.out.println("Artículos vendidos:");
        System.out.println("\tCamisetas: " + sumasVendidas[0]);
        System.out.println("\tPantalones: " + sumasVendidas[1]);
        System.out.println("\tAbrigos: " + sumasVendidas[2]);
        System.out.println("\tZapatos: " + sumasVendidas[3]);
        System.out.println("Total vendido: " + acumuladorTotal + " €");
    }

    // FUNCION PREGUNTAR SI QUIERES CONTINUAR
    public static String preguntaRespuesta(String pregunta) {
        String respuesta;
        do {
            respuesta = pedirDato(pregunta);
            if (!(respuesta.equals("s") || respuesta.equals("n"))) {
                System.out.println("Opción incorrecta. Responde con 's' o 'n'.");
            }
        } while (!(respuesta.equals("s") || respuesta.equals("n")));
        return respuesta;
    }

    // FUNCION GENERICA PARA PEDIR UN DATO STRING
    public static String pedirDato(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

    // FUNCION GENERICA PARA PEDIR UN DATO INT (SCANNER)
    public static int pedirDatoInt() {
        int dato = sc.nextInt();
        sc.nextLine();  // limpiar
        return dato;
    }

    
  
 // VALIDAR LA LONGITUD
    public static String validarLongitud (String tipoDato) {
        String dato = "";
        
        // Pedir dato al usuario basado en el tipo que estamos validando
        do {
            dato = pedirDato(tipoDato + " (1-100 caracteres):");
            
            if (dato.length() < 1 || dato.length() > 100) {
                System.out.println("Error: El " + tipoDato + " debe tener entre 1 y 100 caracteres.");
            }
            
        } while (dato.length() < 1 || dato.length() > 100);
        
        return dato; // Devolver el dato validado
    }
    
    
   
   
 // VALIDAR DATO
    public static String validar(String tipoDato) {
        return validarLongitud(tipoDato); // Llamar a la función de validación específica
    }
    
    
    
     //FUNCION PARA VALIDAR EMAIL
    public static boolean validarMail(String email) { 
    	   
        // iniciamos las variables 
        boolean tieneArroba = false;
        boolean tienePunto = false;
        
        // recorremos el correo
        
        for (int i = 0; i< email.length(); i++) {
        	char c = email.charAt(i);
        	
        	if(c == '@') {
        		tieneArroba = true;
        	}
        	if (c == '.') {
        		tienePunto= true;
        	}
        }
        
        return mailEsValido(tieneArroba, tienePunto); 
    }    
    
    
    //FUNCION VALIDAR @ Y .
    public static boolean mailEsValido(boolean tieneArroba, boolean tienePunto) {
    	boolean esValido = false;
    	if ( tieneArroba && tienePunto) {
        	
        	esValido = true;
        	
        }else {
        	System.out.println("El correo no es válido");
        	
        }
    	
    	return esValido;
    	
    }
  
    
    //FUNCION QUE HACE EL DO WHILE QUE VALIDA email
    public static void bucleMail() { 
        String email= "";
        boolean esValido = false;
        do { 
        	email= pedirDato("Email:"); //usamos funcion  para pedir dato de String
            
        	esValido = validarMail(email); // LLAMO A LA FUNCION QUE VALIDA REQUISITOS DEL MAIL
 	    	   
        }
        while(!esValido);
        usuarios[contadorUsuarios][3] = email;
    }
 

    
    // FUNCION QUE SOLICITA UN TELEFONO VALIDO
    public static String pedirTelefonoValido() {
        String telefono;
        boolean telefonoValido;

        do {
            telefono = pedirDato("Teléfono (9 dígitos):");  //llamo a la funcion que nos da el dato del usuario
            telefonoValido = esTelefonoValido(telefono);  // llamo a la funcion que valida los caracteres (9)

            if (!telefonoValido) {
                System.out.println("Error: el teléfono debe tener exactamente 9 dígitos numéricos.");
            }

        } while (!telefonoValido);  // Continuar hasta que el teléfono sea válido

        return telefono;
    }
    
   
    
  // FUNCION PARA VALIDAR EXACTAMENTE 9 NUMEROS
    public static boolean esTelefonoValido(String telefono) {
       
    	
        if (telefono.length() != 9) { // si tlf distinto a 9 es falso
            return false;
        }

        
        for (int i = 0; i < telefono.length(); i++) { // miramos que sean numeros
           
        	if (telefono.charAt(i) < '0' || telefono.charAt(i) > '9') {
                return false;  // Si encontramos un carácter que no es numérico, es inválido
            }
        }

        return true;  // Si pasó todas las verificaciones, es válido
    }
    
    // FUNCION QUE VALIDA LOS CARACTERES DEL DNI
    public static boolean esDniValido(String dni) {
        
        if (dni.length() != 9) { //9 caracteres
            return false;
        }

        
        for (int i = 0; i < 8; i++) { // 8 primeros numeros
            if (dni.charAt(i) < '0' || dni.charAt(i) > '9') {
                return false;  // Si algún carácter no es un numero, el DNI no es valido
            }
        }

        
        char ultimoCaracter = dni.charAt(8); // ultimo carater letra
        if (!((ultimoCaracter >= 'A' && ultimoCaracter <= 'Z') || (ultimoCaracter >= 'a' && ultimoCaracter <= 'z'))) {
            return false;  // Si el último caracter no es una letra, el DNI no es valido
        }

        return true;  // Si pasó todas las verificaciones, el DNI es válido
    }
    
   
    // FUNCION QUE SOLICITA DNI
    public static String pedirDniValido() {
        String dni;
        boolean dniValido;

        do {
            dni = pedirDato("DNI: ");  // Pedir el DNI al usuario
            dniValido = esDniValido(dni);  // Verificar si el DNI es valido

            if (!dniValido) {
                System.out.println("El DNI no es válido. Inténtalo de nuevo.");
            }

        } while (!dniValido);  // Continuar pidiendo hasta que el DNI sea valido

        return dni;
    }
    
    
     //FUNCION PARA VERIFICAR LOS CARACTERES DE LA CONTRASEÑA
    public static boolean verificarCaracteresPassword(String password) {
        
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

       
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            
            if (c >= 'A' && c <= 'Z') {  // Comprobar si hay mayuscula
                tieneMayuscula = true;
            }
          
            else if (c >= 'a' && c <= 'z') {   // Comprobar si hay minusculas
                tieneMinuscula = true;
            }
            
            else if (c >= '0' && c <= '9') {   // Comprobar si es un digito
                tieneNumero = true;
            }
                                               // Comprobar si es un caracter especial
            else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' ||
                    c == '*' || c == '(' || c == ')' || c == '_' || c == '+' || c == '-' ||
                    c == '|' || c == ';' || c == ':' || c == '\'' || c == '"' || c == '<' || c == '>' ||
                    c == ',' || c == '.' || c == '?' || c == '/' || c == '~' ) {
               tieneCaracterEspecial = true;
            }
        }

        // si valida todos los requisitos...
        if (!tieneMayuscula || !tieneMinuscula || !tieneNumero || !tieneCaracterEspecial) {
            System.out.println("Error: El password debe incluir al menos 1 mayúscula, 1 minúscula, 1 número y 1 carácter especial.");
            return false;
        }

        return true;  // Si pasó todas las verificaciones, la contraseña es valida
    }
    
    
   // FUNCION QUE VALIDA LA CONTRASEÑA
    public static boolean esPasswordValida(String password) {
       
        if (password.length() < 8 || password.length() > 100) {   // Comprobar longitud de la contraseña
            System.out.println("Error: El password debe tener entre 8 y 100 caracteres.");
            return false;
        }

       
        if (!verificarCaracteresPassword(password)) {  // verificar que sea correcta la contraseña
            return false;
        }

        return true;  // Si pasa todas las verificaciones, la contraseña es válida
    }
    
    
    // FUNCION PARA SOLICITAR LA CONTRASEÑA
    public static String pedirPasswordValida() {
        String password;
        String passwordConfirmacion;
        boolean passwordCorrecto;

        do {
            passwordCorrecto = true;
            password = pedirDato("Password: ");  // Pedir la contraseña al usuario

           
            if (!esPasswordValida(password)) {  // que sea contraseña valida
                passwordCorrecto = false;
                System.out.println("La contraseña no cumple con los requisitos.");
            }

           
            passwordConfirmacion = pedirDato("Confirma el password: "); // confirmar la contraseña

            
            if (!password.equals(passwordConfirmacion)) { // que las contraseñas sean iguales
                passwordCorrecto = false;
                System.out.println("Error: Los passwords no coinciden.");
            }

        } while (!passwordCorrecto);  // Continuar pidiendo la contraseña hasta que sea valida

        return password;
    }
    
    
     // FUNCION PARA FECHA DE NACIMIENTO VALIDA
    public static String pedirFechaNacimientoValida() {
        String fechaNacimiento;
        boolean edadValida = false;
        boolean fechaValida;

        do {
            fechaNacimiento = pedirDato("Fecha de Nacimiento (dd/mm/yyyy): ");
            
            // Validar formato de la fecha (8 caracteres en total)
            fechaValida = (fechaNacimiento.length() == 10 && fechaNacimiento.charAt(2) == '/' && fechaNacimiento.charAt(5) == '/');
            
            if (!fechaValida) {
                System.out.println("Error: La fecha debe estar en el formato dd/mm/yyyy.");
                continue;
            }

            // Convertir fecha de nacimiento a valores numericos
            int[] fechaNac = convertirFecha(fechaNacimiento);
            int diaNacimiento = fechaNac[0];
            int mesNacimiento = fechaNac[1];
            int anoNacimiento = fechaNac[2];

            // Fecha actual simulada
            String fechaActual = "17/11/2024";
            int[] fechaAct = convertirFecha(fechaActual);
            int diaActual = fechaAct[0];
            int mesActual = fechaAct[1];
            int anoActual = fechaAct[2];

            // Calcular la edad
            int edad =calcularEdad(diaNacimiento, mesNacimiento, anoNacimiento, diaActual, mesActual, anoActual);

            // Verificar si es mayor de 18 años
            if (edad < 18) {
                System.out.println("Eres menor de edad. Debes tener al menos 18 años.");
                edadValida = false;
            } else {
                edadValida = true;
            }

            if (!edadValida) {
                System.out.println("La fecha de nacimiento no es válida.");
            }

        } while (!edadValida);  // Continuar pidiendo

        return fechaNacimiento;  // devuelvo fecha de nacimiento
    }

    //FUNCION PAR CONVERTIR A VALOR NUMERICO LA FECHA (STRING)
    public static int[] convertirFecha(String fecha) {
        int[] fechaNumerica = new int[3];  // [0] = dia, [1] = mes, [2] = año


        fechaNumerica[0] = (fecha.charAt(0) - '0') * 10 + (fecha.charAt(1) - '0');         // Convertir día

      
        fechaNumerica[1] = (fecha.charAt(3) - '0') * 10 + (fecha.charAt(4) - '0');   // Convertir mes

        
        fechaNumerica[2] = (fecha.charAt(6) - '0') * 1000 + (fecha.charAt(7) - '0') * 100 +  // Convertir año
                           (fecha.charAt(8) - '0') * 10 + (fecha.charAt(9) - '0');

        return fechaNumerica;  // devuelvo la fecha
    }
    
    // FUNCION PARA CALCULAR LA EDAD +18
    public static int calcularEdad(int diaNacimiento, int mesNacimiento, int anoNacimiento, int diaActual, int mesActual, int anoActual) {
        int edad = anoActual - anoNacimiento;

        
        if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
            edad--;  // Si no ha pasado el cumpleaños, restamos un año
        }

        return edad;  //devolvemos la edad
    }

    
}
    
   
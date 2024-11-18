package clases;

public class VariableBoolean {

	public static void main(String[] args) {
		
		boolean b=true;
		System.out.println(b); //imprime valor de b
		
		int n1 = 5; 
		int n2 = 3;
		b = n1 == n2; // igual a
		System.out.println(b); 
		
		b = n1 > n2; // mayor que
		System.out.println(b); 
		
		b = n1 < n2; //menor que
		System.out.println(b);
		
		b = n1 >= n2; //mayor o igual que
		System.out.println(b);
		
		b = n1 <= n2; //menos o igual que
		System.out.println(b);
		
		b= n1 != n2; // distinto de 
		System.out.println(b);
		
		System.out.println("-------------------------------");
		
		char c1='A';
		char c2='B';
		
		b= c1==c2; 
		System.out.println(b);
		b= c1>c2; 
		System.out.println(b);
		b= c1<c2; 
		System.out.println(b);
		b= c1>=c2; 
		System.out.println(b);
		b= c1<=c2; 
		System.out.println(b);
		b= c1!=c2; 
		System.out.println(b);
		
		System.out.println("-------------------------------");
		b= 'A'==65;
		System.out.println(b);
		b= 'B'==66;
		System.out.println(b);
		b= b==true; //va a devolver true/false en base al valor anterior de b, en este caso era true y devolverá true, ya que la variable se ha asignado así en la anterior instrucción.
		System.out.println(b);
		
		System.out.println("----------------op. logicas---------------");
		boolean e=true;
		int n3=25;
		
		e= n3>18 && n3%2==0; //and -> ambas se cumplen
		System.out.println(e);
		e= n3>18 || n3%2==0; //or -> una se cumple
		System.out.println(e);
		e= !(n3>18 || n3%2==0); //not -> le da la vuelta a lo anterior, los compara con el caso al contrario
		System.out.println(e);
		
	}

}

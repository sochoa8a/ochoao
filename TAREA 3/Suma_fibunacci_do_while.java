package ejercicio_prueba;
import java.util.Scanner; 

public class Suma_fubonacci_do_while {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int n, f = 0;
		int t1 = 1;
		int t2 = 0;
		int i = 0;
		
		System.out.println("Ingresar Numero: ");
		n = leer.nextInt();
		
		
		do {
			
			i++;
			t2 = f;
			f = t1 + f;
			t1 = t2;
			
			System.out.println("" + t1);
			
		}while(i<=n);
			
	}
}

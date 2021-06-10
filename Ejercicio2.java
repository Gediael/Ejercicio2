import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int N;
		System.out.println("Ingrese un numero final");
		N = entrada.nextInt();

		while (N>=1){
			N--;
			System.out.println(N);
		}
		

			
	}
}
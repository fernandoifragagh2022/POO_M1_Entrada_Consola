import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		float flotante;
		double nDouble;
		char letra;
		String palabra, cadena;
		
		System.out.println("Escrive un enunciado: "); // No pueden capturar datos char o String uno depues de otro, esto causa errores.
		cadena = entrada.nextLine();
		
		System.out.println("Escrive un numero: ");
		numero = entrada.nextInt();
		
		System.out.println("Escrive un flotante: ");
		flotante = entrada.nextFloat();
		
		System.out.println("Escrive un double: ");
		nDouble = entrada.nextDouble();
		
		System.out.println("Escrive una palabra: "); // Si se escribe mas de una palabra se omite la captura de la letra
		palabra = entrada.next();		
	
		System.out.println("Escrive un letra: ");
		letra = entrada.next().charAt(0);
		
		
		
		
		System.out.println("Entero: " + numero +", Flotante: " + flotante + ", Double: " + nDouble + ", Palabra: " + palabra + ", Enunciado: " + cadena + ", Letra: " + letra);
		
	}

}

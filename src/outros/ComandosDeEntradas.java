package outros;
import java.util.Scanner;
public class ComandosDeEntradas {
	public static void main(String[] args) {
		int vInteiro;
		double vDouble;
		String vString;
		String vFrase;
		float vFloat;
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("informe uma frase");
		vFrase = entrada.nextLine(); //informa a frase inteira
		System.out.print("A frase é:  "+ vFrase);
		
		System.out.printf("informe uma frase");
		vString = entrada.next(); //next so informa a 1ºpalavra
		System.out.print("A frase é:  "+ vString);
		
		
		System.out.printf("informe um inteiro:  ");
		vInteiro = entrada.nextInt();
		System.out.print("O numero inteiro é:  "+ vInteiro);
		
		System.out.printf("informe um real:  ");
		vFloat = entrada.nextFloat();
		System.out.print("O numero inteiro é:  "+ vFloat);
		
		System.out.printf("informe um verdadeiro:  ");
		vDouble = entrada.nextDouble();
		System.out.print("O numero inteiro é:  "+ vDouble);
	}

}

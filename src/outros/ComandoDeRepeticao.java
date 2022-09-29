package outros;

public class ComandoDeRepeticao {
	public static void main(String[] args) {
		   int contador = 1;
	        while(contador <=10) {
			System.out.println(contador);
			contador = contador +1;			
		}
		int contador2 = 1;
		do{	
			System.out.println("contador2:  "+ contador2);
			contador2++;
		}while(contador2 <= 1);	
		
		
		for(int x =1; x <= 10; x ++) {
			System.out.println(x);
		}
		String[]frutas = {"maça", "pera", "banana", "abacate", "uva"};
		for(int x = 0; x < frutas.length; x++) {
			System.out.println(frutas[x]);
			
		}
		}
}

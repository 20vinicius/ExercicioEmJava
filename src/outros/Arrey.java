package outros;
import java.util.Random;

public class Arrey {

	public static void main(String[] args) {
		//arrey de String
		String[] nomes = {"ana", "vinicius", "pedro", "maite"};
		for(int contador = 0; contador< nomes.length; contador++) {
			System.out.println(nomes[contador]);
		}
		//Arrey de double
		double[]numerosDouble = new double[11]; //reservando espaço de memoria para o arrey
		for(int x = 0; x < numerosDouble.length; x++) {
			numerosDouble[x] = x;
			System.out.println(numerosDouble[x]);
		}
		//java.util.random vai gerar numeros aleatorio conforme exemplo abaixo
	    //Arrey de interios aleatorios criando objeto random
		Random geraNumero = new Random();
		int[]interiosAleatorios = new int[10]; //criando o vetor inteiro com capacidade de 10 espaço para alocar
        for(int i = 0; i < interiosAleatorios.length; i++) {
        	interiosAleatorios[i] = geraNumero.nextInt(20);
        	System.out.println(interiosAleatorios[i]);
        	
        }
		//arrey bidimenssional tipo matriz
        int[][]matrizDeInteiros = {
        		{1, 2, 3},
        		{4, 4, 7},
        		{9, 1, 6, 9, 1},
        };
		for(int linha = 0; linha < matrizDeInteiros.length; linha++) {//tem que possuir um for para linha e um for para coluna 
			for(int coluna = 0; coluna < matrizDeInteiros[linha].length; coluna++) {//tem que possuir um for para linha e um for para coluna
				System.out.print(matrizDeInteiros[linha][coluna]);
			}
			System.out.println(""); //devemos declarar mais um sysout para quebrar a linha 
		}
		System.out.println("tamanho da linha 1:  " + matrizDeInteiros[0].length);//para saber o tamanho da linha 
		System.out.println("tamanho da linha 2:  " + matrizDeInteiros[1].length);//para saber o tamanho da linha
		System.out.println("tamanho da linha 3:  " + matrizDeInteiros[2].length);//para saber o tamanho da linha
		
	}   
	

}

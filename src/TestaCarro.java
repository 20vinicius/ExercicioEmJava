import java.util.Scanner;
public class TestaCarro {

	public static void main(String[] args) {
		Carro carroUm = new Carro();
		
		System.out.println("nome do carro:  " + carroUm.nome);
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("ano do carro: " + carroUm.ano);
		carroUm.acelerar();
		for (int x = 0; x < carroUm.acessorios.length; x++) {
			System.out.println(carroUm.acessorios[x]);
			
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a kilometragem: ");
		int km = entrada.nextInt();
		
		System.out.println(carroUm.calculaConsum(km));
		
		
			
		}

	}



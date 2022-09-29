
public class Carro {
	
	public String nome = "Opala";
	public String modelo = "Opala Diplomata";
	public int ano = 1987;
	
	public String[] acessorios = {
			"farol", 
			"calota", 
			"freio",
			"teto solar",
			"vidro eletrico"
	};
	
	public void acelerar() {
		System.out.println("vrumm");
	}
	public double calculaConsum(double km) {
		return km / 6.61;
	}
}

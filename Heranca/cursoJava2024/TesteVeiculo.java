package cursoJava2024;

public class TesteVeiculo {

	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corola", 2004, 4);
		Carro carro1 = new Carro("BMW", "z4", 2022, 4);
		Moto moto = new Moto ("Honda","CB500",2019, true);
		Moto moto1 = new Moto ("Honda","x3",2025, false);
		


		System.out.println("Detalhes do Carro: ");
		carro.exibirDetalhes();
		
		System.out.println("\nDetalhes da Moto: ");
		moto.exibirDetalhes();
		
		System.out.println("\nDetalhes do Carro: ");
		carro1.exibirDetalhes();
		
		System.out.println("\nDetalhes da Moto: ");
		moto1.exibirDetalhes();
		
		
	}

}

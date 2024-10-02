package cursoJava2024;

public class Carro extends Veiculo { //pega os atributos e os metodos da classe Veiculo
	private int numeroDePortas; //private: diz que a variável só pode ser usada na própria classe onde foi declarada
	
	// metodo public Carro é classe construtora// as variaveis estão tipadas por String e int
	public Carro(String marca, String modelo, int ano, int numeroDePortas) { 
		super (marca, modelo, ano);
		this.numeroDePortas= numeroDePortas;
	}
@Override // sobreescreve o metodo, acrescentando informação que esta na subclasse "Carro"
public void exibirDetalhes() {
	super.exibirDetalhes();
	System.out.println("Número de portas: "+ numeroDePortas);
	}
	
	
}

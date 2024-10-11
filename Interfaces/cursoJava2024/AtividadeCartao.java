package cursoJava2024;

public class AtividadeCartao implements AtividadePagamento {
	public AtividadeCartao() {
		
	}
	@Override
	public void realizarPagamento() {
		System.out.println("Cartão de Crédito selecionado para realizar pagamento!");
	}
	

}

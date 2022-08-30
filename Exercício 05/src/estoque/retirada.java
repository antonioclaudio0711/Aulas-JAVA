package estoque;

public class retirada {
	public int quantidade_itens;
	public float valor;

	public retirada(int quantidade_itens) {
		super();
		this.quantidade_itens = quantidade_itens;
	}

	public int getQuantidade_itens() {
		return quantidade_itens;
	}

	public void setQuantidade_itens(int quantidade_itens) {
		this.quantidade_itens = quantidade_itens;
	}
}

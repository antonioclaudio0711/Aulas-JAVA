package pedidos;

public class produtos {
	
	public float preco;
	public int quantidade;
	
	public produtos(float preco, int quantidade) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}

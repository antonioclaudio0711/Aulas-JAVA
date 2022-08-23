package pedidos;
import pedidos.produtos;

public class pedido {
	public produtos item01;

	public pedido(produtos item01) {
		super();
		this.item01 = item01;
	}

	public produtos getItem01() {
		return item01;
	}

	public void setItem01(produtos item01) {
		this.item01 = item01;
	}
}

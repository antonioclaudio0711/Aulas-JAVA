package financeiro;
import estoque.compras;

public class contasReceber {
	public compras valor_receber;

	public contasReceber(compras valor_receber) {
		super();
		this.valor_receber = valor_receber;
	}

	public compras getValor_receber() {
		return valor_receber;
	}

	public void setValor_receber(compras valor_receber) {
		this.valor_receber = valor_receber;
	}
}

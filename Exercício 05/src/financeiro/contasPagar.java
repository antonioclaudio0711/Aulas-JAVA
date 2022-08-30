package financeiro;

import estoque.retirada;

public class contasPagar {
	public retirada valor_pagar;

	public contasPagar(retirada valor_pagar) {
		super();
		this.valor_pagar = valor_pagar;
	}

	public retirada getValor_pagar() {
		return valor_pagar;
	}

	public void setValor_pagar(retirada valor_pagar) {
		this.valor_pagar = valor_pagar;
	}
}

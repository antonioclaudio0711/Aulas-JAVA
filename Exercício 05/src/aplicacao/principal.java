package aplicacao;

import financeiro.contasReceber;
import financeiro.contasPagar;

public class principal {
	
	public static void main(String[] args) {
		contasReceber entrada = null;
		contasPagar saida = null;
		
		entrada.valor_receber.valor_entrada = (float) 123.8;
		saida.valor_pagar.quantidade_itens = 5;
		saida.valor_pagar.valor = (float) 100.0;
		
	}

}

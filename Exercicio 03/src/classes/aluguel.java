package classes;
import classes.livro;
import classes.pessoa;

public class aluguel {
	public pessoa locatario;
	public livro alugado;
	
	public aluguel(pessoa locatario, livro alugado) {
		super();
		this.locatario = locatario;
		this.alugado = alugado;
	}

	public pessoa getLocatario() {
		return locatario;
	}

	public void setLocatario(pessoa locatario) {
		this.locatario = locatario;
	}

	public livro getAlugado() {
		return alugado;
	}

	public void setAlugado(livro alugado) {
		this.alugado = alugado;
	}
}

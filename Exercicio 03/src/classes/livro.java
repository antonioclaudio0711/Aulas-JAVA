package classes;

public class livro {
	public String titulo;
	public String editora;
	public String codigo;
	
	public livro(String titulo, String editora, String codigo) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}

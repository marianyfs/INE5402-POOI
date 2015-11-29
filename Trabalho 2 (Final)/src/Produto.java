
public class Produto {
	protected int id;
	protected String nome, marca, tipo;
	protected double preco;

	// --------------------------------------------------------------------
	public Produto(int id, String nome, String marca, String tipo, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;
	}
	// -----------------------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "ID do Produto: " + id + "\n" + "Nome = " + nome + " / Marca = " + marca + " / Tipo = " + tipo
				+ " / Preco = " + preco + "]\n\n";
	}

	// -----------------------------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		Produto p;
		if (o instanceof Produto)
			p = (Produto) o;
		else
			return false;
		
		return id == p.id && nome.equals(p.nome) && marca.equals(p.marca) && tipo.equals(p.tipo) && preco == p.preco;
	}
	
	// -----------------------------------------------------------------------------------------

}

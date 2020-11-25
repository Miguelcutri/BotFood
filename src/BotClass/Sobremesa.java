package BotClass;

public class Sobremesa {
	//atributos
	public String nomeSobremesa;
	public String descricao;
	public int quantidade;
	public double preco;
	
	//construtor
	public Sobremesa(String nomeSobremesa, String descricao, double preco) {
		super();
		this.nomeSobremesa = nomeSobremesa;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	//getters and setters


	public String getNomeSobremesa() {
		return nomeSobremesa;
	}


	public void setNomeSobremesa(String nomeSobremesa) {
		this.nomeSobremesa = nomeSobremesa;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\nSobremesa = "+ nomeSobremesa + ", Preço = "+ preco;
	}
	
}

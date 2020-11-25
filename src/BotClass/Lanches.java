package BotClass;

public class Lanches {
	public String nomeLanche;
	public String descricao;
	public double preco;
	public int quantidade;
	
	public Lanches(String nomeLanche, String descricao, double preco) {
		super();
		this.nomeLanche = nomeLanche;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	
	public String getNomeLanche() {
		return nomeLanche;
	}
	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "\nLanches =" + nomeLanche + ", Preco= " + preco;
	}
	
	
	
}

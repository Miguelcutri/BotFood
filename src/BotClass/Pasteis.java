package BotClass;

public class Pasteis {
	public String nomePastel;
	public String descricao;
	public int quantidade;
	public double preco;
	
	public String getNomePastel() {
		return nomePastel;
	}
	public void setNomePastel(String nomePastel) {
		this.nomePastel = nomePastel;
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
	public Pasteis(String nomePastel, String descricao, double preco) {
		super();
		this.nomePastel = nomePastel;
		this.descricao = descricao;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Pasteis [nomePastel=" + nomePastel + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ ", preco=" + preco + "]";
	}
	
	
}

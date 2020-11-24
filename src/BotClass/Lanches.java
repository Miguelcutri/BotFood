package BotClass;

public class Lanches {
	public String nomeLanche;
	public String descrição;
	public double preço;
	public int quantidade;
	
	public Lanches(String nomeLanche, String descrição, double preço, int quantidade) {
		super();
		this.nomeLanche = nomeLanche;
		this.descrição = descrição;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	public String getNomeLanche() {
		return nomeLanche;
	}
	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}

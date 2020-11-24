package BotClass;

public class Sobremesa {
	//atributos
	public String nomeSobremesa;
	public String descriçao;
	public int quantidade;
	public double preço;
	
	//construtor
	public Sobremesa(String nomeSobremesa, String descriçao, double preço) {
		super();
		this.nomeSobremesa = nomeSobremesa;
		this.descriçao = descriçao;
		this.preço = preço;
		
	}
	//getters and setters


	public String getNomeSobremesa() {
		return nomeSobremesa;
	}


	public void setNomeSobremesa(String nomeSobremesa) {
		this.nomeSobremesa = nomeSobremesa;
	}


	public String getDescriçao() {
		return descriçao;
	}


	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}
	

	


	
}

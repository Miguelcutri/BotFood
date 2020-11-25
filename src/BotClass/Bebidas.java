package BotClass;

public class Bebidas {
	
		
		public String Marca; 
		public String descricao;
	    public int quantidade;
	    public double preco;
		public Bebidas(String marca, String descricao, double preco ) {
			super();
			this.Marca = marca;
			this.descricao = descricao;
			this.preco = preco;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
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
			return "\nBebidas = " + Marca + ", Preco= " + preco ;
		}
	   
}
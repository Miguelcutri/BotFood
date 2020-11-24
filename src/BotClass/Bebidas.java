package BotClass;

public class Bebidas {
	
		
		public String Marca; 
		public String descrição;
	    public int quantidade;
	    public double preço;
		public Bebidas(String marca, String descrição, double preço ) {
			super();
			this.Marca = marca;
			this.descrição = descrição;
			this.preço = preço;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getDescrição() {
			return descrição;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
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
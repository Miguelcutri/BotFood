package menu;

import java.util.ArrayList;
import java.util.List;

import BotClass.Lanches;

public class Lanche {
	public static List<Lanches> getLanche() {
		
		List<Lanches> lanches=new ArrayList<>();		
		
		Lanches lanche1 = new Lanches("1-X-tudo", "hamburger, calabressa,bacon,presunto , alface, tomate, azeitona, maionese", 35.50);
		Lanches lanche2 = new Lanches("2-X-salada ", "Hamburger, queijo prato, alface, tomate, cebola roxa e maionese", 27.50);
		Lanches lanche3 = new Lanches("3-X-Burguer ", "Hamburger e queijo", 25.50);
		Lanches lanche4 = new Lanches("4-Bigzão ", "2 Hamburgueres, alface, queijo, molho especial e cebola", 37.50);
		Lanches lanche5 = new Lanches("5-BigBurger da casa ", "2 Hamburgueres, queijo, presunto, salada, ovo e milho", 41.20);
		
		
		lanches.add(lanche1);
		lanches.add(lanche2);
		lanches.add(lanche3);
		lanches.add(lanche4);
		lanches.add(lanche5);
		
		return lanches;
		
	}
}

package menu;

import java.util.ArrayList;
import java.util.List;

import BotClass.Sobremesa;

public class Sobremesas {
public static List<Sobremesa> getSobremesa() {
		
		List<Sobremesa> sobremesa = new ArrayList<>();		
		
		Sobremesa sobremesa1 = new Sobremesa("1-Cheesecake de Frutas Vermelhas", "cream cheese, biscoito e uma calda de chocolate", 19.90);
        Sobremesa sobremesa2 = new Sobremesa("2-Tiramisu ", "biscoitos tipo inglês, café e creme de mascarpone.", 24.90);
        Sobremesa sobremesa3 = new Sobremesa("3-Petit Gateau", "Ele é fofinho, com doce de leite de lamber os beiços e quente na medida", 22.50);
        Sobremesa sobremesa4= new Sobremesa("4-Quindim ", "Coco ralado, hmmmm que delícia!", 19.90);
        Sobremesa sobremesa5= new Sobremesa("5-Pudim ", "sobremesa de consistência cremosa, à base de leite condensado,", 18.50);
        


        sobremesa.add(sobremesa1);
        sobremesa.add(sobremesa2);
        sobremesa.add(sobremesa3);
        sobremesa.add(sobremesa4);
        sobremesa.add(sobremesa5);
		
		return sobremesa;
}
}

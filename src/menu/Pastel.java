package menu;

import java.util.ArrayList;
import java.util.List;

import BotClass.Pasteis;

public class Pastel {
	public static List<Pasteis> getpastel() {
		
		List<Pasteis> pasteis=new ArrayList<>();		
		
	      Pasteis pastel1 = new Pasteis("1-Frango com catupiri", "Frango, catupiri e azeitona", 15.50);
          Pasteis pastel2 = new Pasteis("2-Carne com Queijo", "Carne, queijo e azeitona", 10.50);
          Pasteis pastel3 = new Pasteis("3-Pizza", "Presunto, queijo, azeitona, tomate e oregano", 12.50);
          Pasteis pastel4 = new Pasteis("4-Palmito ", "Palmito, tomate e cebola", 16.50);
          Pasteis pastel5 = new Pasteis("5-Brócolis", "Brocolis, queijo e bacon", 12.50);
          Pasteis pastel6 = new Pasteis("6-Chocolate ", "Chocolate ao leite", 18.50);


          pasteis.add(pastel1);
          pasteis.add(pastel2);
          pasteis.add(pastel3);
          pasteis.add(pastel4);
          pasteis.add(pastel5);
          pasteis.add(pastel6);

          return pasteis;
		
	}
}

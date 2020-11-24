package menu;

import java.util.ArrayList;
import java.util.List;

import BotClass.Pasteis;

public class Pastel {
	public static List<Pasteis> getpastel() {
		
		List<Pasteis> pasteis=new ArrayList<>();		
		
		Pasteis pastel1 = new Pasteis("Frango com catupiri", "Frango, catupiri e azeitona", 12.50);
		Pasteis pastel2 = new Pasteis("Frango ", "Frango e azeitona", 12.50);
		
		
		pasteis.add(pastel1);
		pasteis.add(pastel2);
		
		return pasteis;
		
	}
}

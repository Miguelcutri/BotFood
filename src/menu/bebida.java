package menu;

import java.util.ArrayList;
import java.util.List;

import BotClass.Bebidas;

public class bebida {


public static List<Bebidas> getbebida() {

    List<Bebidas> bebidas =new ArrayList<>();

    Bebidas bebida1 = new Bebidas("1-Coca Cola", "2 Litros", 12.50);
    Bebidas bebida2 = new Bebidas("2-Guaran� Antartica", "2 Litros", 12.50);
    Bebidas bebida3 = new Bebidas("3-Fanta Uva", "2 Litros", 12.50);
    Bebidas bebida4 = new Bebidas("4-Coca Cola", "350ml", 5);
    Bebidas bebida5 = new Bebidas("5-Sprit", "350ml", 5);
    Bebidas bebida6 = new Bebidas("6-Skol", "350ml", 5);
    Bebidas bebida7 = new Bebidas("7-Brahma", "350ml", 5);
    
    bebidas.add(bebida1);
    bebidas.add(bebida2);
    bebidas.add(bebida3);
    bebidas.add(bebida4);
    bebidas.add(bebida5);
    bebidas.add(bebida6);
    bebidas.add(bebida7);
    
    return bebidas;

}
}
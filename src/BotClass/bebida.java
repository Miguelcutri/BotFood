package BotClass;

import java.util.ArrayList;
import java.util.List;

public class bebida {


public static List<Bebidas> getbebida() {

    List<Bebidas> bebidas =new ArrayList<>();

    Bebidas bebida1 = new Bebidas("Coca Cola", "2 Litros", 12.50);
    Bebidas bebida2 = new Bebidas("Guaraná Antartica", "2 Litros", 12.50);
    Bebidas bebida3 = new Bebidas("Fanta Uva", "2 Litros", 12.50);
    Bebidas bebida4 = new Bebidas("Coca Cola", "350ml", 5);
    Bebidas bebida5 = new Bebidas("Sprit", "350ml", 5);
    Bebidas bebida6 = new Bebidas("Skol", "350ml", 5);
    Bebidas bebida7 = new Bebidas("Brahma", "350ml", 5);
    
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
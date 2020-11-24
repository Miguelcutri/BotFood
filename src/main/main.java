package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BotClass.Bebidas;
import BotClass.Lanches;
import BotClass.Pasteis;
import BotClass.Sobremesa;
import menu.Pastel;

public class main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//cardapio
		List<Lanches> lanches = new ArrayList<>();
		List<Pasteis> pasteis = Pastel.getpastel();
		List<Bebidas> bebidas = new ArrayList<>();
		List<Sobremesa> sobremesas = new ArrayList<>();
		
		int resposta;
		
		do {
			
		System.out.println("Digite: \n1 para lanche"
				+ "\n2 para pastel \n3 para bebidas \n4 para sobremesa"
				+ "\n0 para finalizar pedido");
		resposta=leia.nextInt();
		if(resposta == 1) {

			
			
		}else if(resposta == 2) {
			System.out.println(pasteis);
			
		}else if(resposta == 3) {
			
		
		}else if(resposta == 4){
			
			
		}
		}while(resposta != 0);
		
		
		
		
		
		
	}
}

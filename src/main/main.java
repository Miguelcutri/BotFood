package main;

import java.util.List;
import java.util.Scanner;

import BotClass.Bebidas;
import BotClass.Lanches;
import BotClass.Pasteis;
import BotClass.Sobremesa;
import menu.Lanche;
import menu.Pastel;
import menu.Sobremesas;
import menu.bebida;

public class main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//cardapio
		List<Lanches> lanches = Lanche.getLanche();
		List<Pasteis> pasteis = Pastel.getpastel();
		List<Bebidas> bebidas = bebida.getbebida();
		List<Sobremesa> sobremesas = Sobremesas.getSobremesa();
		
		int resposta, total=0, sabor, qnt, retirada;
		String endereco;
		
		do {
			
		System.out.println("Digite: \n1 para lanche"
				+ "\n2 para pastel \n3 para bebidas \n4 para sobremesa"
				+ "\n0 para finalizar pedido");
		resposta=leia.nextInt();
		if(resposta == 1) {
			System.out.println(lanches);
			System.out.println("Digite qual o sabor deseja");
			sabor=leia.nextInt();
			switch(sabor) {
			case 1:
				System.out.println("Quantos lanches desejas ? ");
				qnt=leia.nextInt();
				total += 35.50*qnt;
				continue;
			case 2:
				System.out.println("Quantos lanches desejas ? ");
				qnt=leia.nextInt();
				total += 27.50*qnt;
				continue;
			case 3:
				System.out.println("Quantos lanches desejas ? ");
				qnt=leia.nextInt();
				total += 25.50*qnt;
				continue;
			case 4:
				System.out.println("Quantos lanches desejas ? ");
				qnt=leia.nextInt();
				total += 37.50*qnt;
				continue;
			case 5:
				System.out.println("Quantos lanches desejas ? ");
				qnt=leia.nextInt();
				total += 41.20*qnt;
				continue;
			}
					
		}else if(resposta == 2) {
			System.out.println(pasteis);
			System.out.println("Digite qual o sabor deseja");
			sabor=leia.nextInt();
			switch(sabor) {
			case 1:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 15.50*qnt;
				continue;
			case 2:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 10.50*qnt;
				continue;
			case 3:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 12.50*qnt;
				continue;
			case 4:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 16.50*qnt;
				continue;
			case 5:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 12.50*qnt;
				continue;
			case 6:
				System.out.println("Quantos pasteis desejas ? ");
				qnt=leia.nextInt();
				total += 18.50*qnt;
				continue;
			}
		}else if(resposta == 3) {
			System.out.println(bebidas);
			System.out.println("Digite qual a bebida desejada");
			sabor=leia.nextInt();
			switch(sabor) {
			case 1:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 12.50*qnt;
				continue;
			case 2:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 12.50*qnt;
				continue;
			case 3:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 12.50*qnt;
				continue;
			case 4:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 5*qnt;
				continue;
			case 5:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 5*qnt;
				continue;
			case 6:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 5*qnt;
				continue;
			case 7:
				System.out.println("Quantas bebidas desejas ? ");
				qnt=leia.nextInt();
				total += 5*qnt;
				continue;
		}
		}else if(resposta == 4){
			System.out.println(sobremesas);
			System.out.println("Digite qual o sabor deseja");
			sabor=leia.nextInt();
			switch(sabor) {
			case 1:
				System.out.println("Quantas sobremesas desejas ? ");
				qnt=leia.nextInt();
				total += 19.90*qnt;
				continue;
			case 2:
				System.out.println("Quantas sobremesas desejas ? ");
				qnt=leia.nextInt();
				total += 24.90*qnt;
				continue;
			case 3:
				System.out.println("Quantas sobremesas desejas ? ");
				qnt=leia.nextInt();
				total += 22.50*qnt;
				continue;
			case 4:
				System.out.println("Quantas sobremesas desejas ? ");
				qnt=leia.nextInt();
				total += 19.90*qnt;
				continue;
			case 5:
				System.out.println("Quantas sobremesas desejas ? ");
				qnt=leia.nextInt();
				total += 18.50*qnt;
				continue;
			}
		}
		}while(resposta != 0);
																															for(int i =0; i<50; i++) {
																																System.out.println();
																															}
		System.out.println("1-Entrega\n2-Retirada");
		retirada=leia.nextInt();
		if(retirada == 1) {
			System.out.println("Qual seu endereço ?");
			endereco=leia.next();
			
			System.out.println("O total da compra foi de: " + total + "R$;"
				+"\nE será entregue no endereço passado em até 45 min");
		}else {
			System.out.println("O total da compra foi de : " + total + "R$;"
					+ "\nO seu pedido estará pronto para retirada em 20 minutos");
		}
		
	}
}

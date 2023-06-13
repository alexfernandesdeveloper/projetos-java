package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO");
		
		System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
		
		if(Bill.feeding() > 30.0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", Bill.cover());

		}
		
		System.out.printf("Ingresso = R$ %.2f%n", Bill.ticket());
		System.out.println();
		
		System.out.printf("Valor a pagar = %.2f%n", Bill.total());
		
		sc.close();
	}

}

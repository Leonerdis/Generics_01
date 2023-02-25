package aplicacao;

import java.util.Scanner;

import servicos.PrintService;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		PrintService<String> ps = new PrintService<String>();
		System.out.print("Entre com a quantidade de números ou nomes:");
		
		int n = sc.nextInt();	
		
		for(int i=0; i<n; i++ ) {
			String valor= sc.next();
			ps.addValor(valor);
		}
		
		ps.print();
		System.out.println("Primeiro: " + ps.primeiro() );
		
		sc.close();

	}

}

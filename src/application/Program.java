/*
Programa que calcula o fatorial de um número inteiro fornecido pelo usuário.
Ex: 5! = 120 (5 X 4 X 3 X 2 X 1)
*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = sc.nextInt();
		
		int multiplicacao = 1;
		
		System.out.println(fatorial +"! = ");
		for(int i = fatorial ; i >= 1 ; i --) {
			multiplicacao = multiplicacao * i;
		}
		System.out.println(multiplicacao);
	}
}

/**
 * 
 */
package com.cursojava.raphael.exercicio1;

import java.util.Scanner;

/**
 * @author raphael
 *
 */
public class Exercicio1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor em euros: ");
		double valor = scanner.nextDouble();
		double operacao = valor * 2.5;
		
		System.out.print("O valor convertido em reais é: ");
		System.out.println(operacao);
	}

}

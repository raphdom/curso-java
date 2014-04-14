/**
 * 
 */
package com.cursojava.raphael.exercicio2;

import java.util.Scanner;

/**
 * @author raphael
 *
 */
public class Exercicio2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		int peso = scanner.nextInt();
		
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print("O seu IMC é: ");
		System.out.println(imc);
		
	}

}

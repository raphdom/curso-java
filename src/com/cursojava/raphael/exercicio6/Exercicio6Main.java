/**
 * 
 */
package com.cursojava.raphael.exercicio6;

import java.util.Scanner;

/**
 * @author raphael
 *
 */
public class Exercicio6Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		if (idade < 16){
			System.out.println("Não pode votar!");
		}else if(idade == 16 || idade == 17 || idade > 70 ){
			System.out.println("Voto facultativo!");
		}else if(idade >= 18 && idade <= 70){
			System.out.println("Voto obrigatório!");
		}
	}

}

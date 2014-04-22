/**
 * 
 */
package com.cursojava.raphael.exercicio11;

/**
 * @author Raphael
 *
 */
public class Exercicio11Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		//Criação da Conta
		banco.criarConta(123456, 1000, true, 400);
		
		//Operações de Conta
		banco.deposito(123456, 650.25, "Ordenado Janeiro");
		banco.levantamento(123456, 20, "Farmácia");
		banco.deposito(123456, 215.15, "Venda de Coisas");
		banco.levantamento(123456, 32.25, "Jantar H3");
		banco.levantamento(123456, 350, "Renda da Casa");
		
		//Consulta de Conta
		System.out.println(banco.emitirExtrato(123456));
		System.out.println(banco.emitirSaldo(123456));

	}

}

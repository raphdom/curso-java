/**
 * 
 */
package com.cursojava.raphael.exercicio9;

/**
 * @author raphael
 *
 */
public class Exercicio9Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Clara Joaquina";
		funcionario1.departamento = "Financeiro";
		funcionario1.ordenado =  2020.54;
		funcionario1.dataEntrada = "20/02/1998";
		funcionario1.documentoIdentificacao = 142586932;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "André Coelho";
		funcionario2.departamento = "Entrega";
		funcionario2.ordenado =  1532.35;
		funcionario2.dataEntrada = "20/02/2005";
		funcionario2.documentoIdentificacao = 152436889;
		
		System.out.println("###FUNCIONARIO 1####");
		System.out.println("Nome:" + funcionario1.nome);
		System.out.println("Departamento:" + funcionario1.departamento);
		System.out.println("Ordenado:" + funcionario1.ordenado);
		System.out.println("Data de Entrada:" + funcionario1.dataEntrada);
		System.out.println("Documento de Identificação:" + funcionario1.documentoIdentificacao);
		
		System.out.println("###FUNCIONARIO 2####");
		System.out.println("Nome:" + funcionario2.nome);
		System.out.println("Departamento:" + funcionario2.departamento);
		System.out.println("Ordenado:" + funcionario2.ordenado);
		System.out.println("Data de Entrada:" + funcionario2.dataEntrada);
		System.out.println("Documento de Identificação:" + funcionario2.documentoIdentificacao);
	}

}

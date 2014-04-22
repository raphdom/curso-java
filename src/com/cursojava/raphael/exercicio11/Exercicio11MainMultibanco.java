package com.cursojava.raphael.exercicio11;

import java.util.Scanner;

/**
 * @author Raphael Domingues
 *
 */
public class Exercicio11MainMultibanco {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Banco banco = new Banco();
		
		System.out.println("Bem vindo ao banco do Raphael, escolha uma op��o");
		int opcao = -1;
		while (opcao != 0){
			System.out.println("1-Criar conta | 2-Consutar saldo | 3-Consulta extrato | 4-Fazer levantamento | 5-Fazer dep�sito | 0-Sair");
			
			opcao = scanner.nextInt();
			
			if (opcao == 1){
				System.out.print("Digite o numero da conta:");
				int numeroConta = scanner.nextInt();
				banco.criarConta(numeroConta, 0, false, 200);
				System.out.println("Conta criada com sucesso");
			}
			
			if (opcao == 2){
				System.out.print("Digite o numero da conta:");
				int numeroConta = scanner.nextInt();
				System.out.println(banco.emitirSaldo(numeroConta));
			}
			
			if (opcao == 3){
				System.out.print("Digite o numero da conta:");
				int numeroConta = scanner.nextInt();
				System.out.println(banco.emitirExtrato(numeroConta));
			}
			
			if (opcao == 4){
				System.out.print("Digite o numero da conta:");
				int numeroConta = scanner.nextInt();
				System.out.print("Digite o valor:");
				double valor = scanner.nextDouble();
				System.out.print("Digite a descri��o:");
				String descricao = scanner.next();
				banco.levantamento(numeroConta, valor, descricao);
			}
			
			if (opcao == 5){
				System.out.print("Digite o numero da conta:");
				int numeroConta = scanner.nextInt();
				System.out.print("Digite o valor:");
				double valor = scanner.nextDouble();
				System.out.print("Digite a descri��o:");
				String descricao = scanner.next();
				banco.deposito(numeroConta, valor, descricao);
			}
			
			
		}
		
		scanner.close();


	}

}

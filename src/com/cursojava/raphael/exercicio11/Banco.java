package com.cursojava.raphael.exercicio11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael Domingues
 *
 */
public class Banco {
	
	private List<Conta> contas = new ArrayList<Conta>();
	
	public void criarConta(int numero, double saldo, boolean especial, double limite){
		Conta conta = new Conta(saldo);
		conta.setNumero(numero);
		conta.setEspecial(especial);
		conta.setLimite(limite);
		contas.add(conta);
	}
	
	public boolean levantamento(int numero, double valor, String descricao){
		Conta conta = getConta(numero);
		if (valor > conta.getLimite()){
			return false;
		}
		if (valor > conta.getSaldo()){
			return false;
		}
		Movimentacao movimento = new Movimentacao();
		movimento.setDescricao(descricao);
		movimento.setTipo("debito");
		movimento.setValor(valor);
		conta.adicionarMovimento(movimento);
		return true;
	}
	
	public void deposito(int numero, double valor, String descricao){
		Conta conta = getConta(numero);
		Movimentacao movimento = new Movimentacao();
		movimento.setDescricao(descricao);
		movimento.setTipo("credito");
		movimento.setValor(valor);
		conta.adicionarMovimento(movimento);
	}
	
	public String emitirSaldo(int numero){
		Conta conta = getConta(numero);
		return "O saldo da conta é:" + conta.getSaldo();
	}
	
	public String emitirExtrato(int numero){
		Conta conta = getConta(numero);
		return conta.emitirExtrato();
	}
	
	private Conta getConta(int numero){
		for(Conta conta: contas){
			if (conta.getNumero()==numero){
				return conta;
			}
		}
		return null;
	}

}

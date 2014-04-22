package com.cursojava.raphael.exercicio11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael Domingues
 *
 */
public class Conta {
	
	private int numero;
	private double saldo;
	private boolean especial;
	private double limite;
	private List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
	
	public Conta(){
		
	}
	
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void adicionarMovimento(Movimentacao movimento){
		this.movimentacoes.add(movimento);
		if (movimento.getTipo().equals("credito")){
			this.saldo = this.saldo + movimento.getValor();
		}else{
			this.saldo = this.saldo - movimento.getValor();
		}
	}
	
	public String emitirExtrato(){
		String resumo = "######EXTRATO DA CONTA#######";
		for (Movimentacao movimentacao : movimentacoes){
			resumo = resumo + movimentacao.getTipo() + movimentacao.getValor() +
					movimentacao.getDescricao() + "\n";
		}
		return resumo;
	}

}

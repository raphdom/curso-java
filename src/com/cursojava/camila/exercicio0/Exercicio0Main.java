/**
 * 
 */
package com.cursojava.camila.exercicio0;

import java.util.ArrayList;
import java.util.List;

import com.cursojava.raphael.exercicio10.Carro;
import com.cursojava.raphael.exercicio9.Funcionario;

/**
 * @author camila
 *
 */
public class Exercicio0Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println ("Hello World");	
		
				
		//Funcionario[] funcionarios = new Funcionario[10];
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Funcionario funcionario0 = new Funcionario();
		funcionario0.nome = "Raphael";
		funcionarios.add(funcionario0);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Camila";
		funcionarios.add(funcionario1);
		
		
		for(int i=0; i<funcionarios.size(); i++){
			Funcionario func = funcionarios.get(i);
			System.out.println("Funcionarios nome="+func.nome);
		}
		
		for(Funcionario func : funcionarios){
			System.out.println("Funcionarios nome="+func.nome);
		}
		
		
		Carro peugeout = new Carro();
		
		
	}

}

package br.com.cdb.heranca;

import br.com.cdb.heranca.model.Aluno;
import br.com.cdb.heranca.model.Faxineiro;
import br.com.cdb.heranca.model.Funcionario;
import br.com.cdb.heranca.model.Pessoa;
import br.com.cdb.heranca.model.Professor;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		//int numeroInteiro = 0;
		//numeroInteiro = input.nextInt()
		
		Pessoa fulano = new Pessoa("fulano");
		//fulano.nome ="fulano";
		fulano.cpf = 1234567891;
		
		
		Aluno aluno1 = new Aluno("cleiton" ,123 );
		//aluno1.nome = "cleiton";
		aluno1.cpf = 454646465;
//		aluno1.apresentacao();
		
		Funcionario funcionario = new Funcionario("dani");
		//funcionario.nome ="dani";
		
		Professor prof = new Professor("denis");
		prof.cpf = 556464646;
		//prof.nome = "denis";
		prof.salario = 1;
		prof.numeroDeAulas = 60;
		//prof.novoSalario(2,30);
		
		Faxineiro faxineiro = new Faxineiro("ze");
		faxineiro.turno = "Noturno";
		
		ArrayList<Pessoa> listaDaEscola = new ArrayList<>();
		listaDaEscola.add(fulano);
		listaDaEscola.add(prof);
		listaDaEscola.add(aluno1);
		listaDaEscola.add(funcionario);
		listaDaEscola.add(faxineiro);
		
		for (Pessoa p : listaDaEscola) {
			p.apresentacao();
			
			if(p instanceof Professor)
			{
				System.out.println(" e tenho "+((Professor) p).numeroDeAulas + " numero de aulas");
			}
		}
		
		//System.out.print(faxineiro.nome);
	}

}

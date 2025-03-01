package br.com.cdb.heranca;

import br.com.cdb.heranca.model.Aluno;
import br.com.cdb.heranca.model.Faxineiro;
import br.com.cdb.heranca.model.Funcionario;
import br.com.cdb.heranca.model.Pessoa;
import br.com.cdb.heranca.model.Professor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa fulano = new Pessoa("fulano");
		//fulano.nome ="fulano";
		fulano.cpf = 1234567891;
		
		fulano.apresentacao();
		
		Aluno aluno1 = new Aluno("cleiton" ,123 );
		//aluno1.nome = "cleiton";
		aluno1.cpf = 454646465;
		
		Funcionario funcionario = new Funcionario("dani");
		//funcionario.nome ="dani";
		
		Professor prof = new Professor("denis");
		prof.cpf = 556464646;
		//prof.nome = "denis";
		prof.salario = 1;
		prof.numeroDeAulas = 60;
		
		Faxineiro faxineiro = new Faxineiro("ze");
		faxineiro.turno = "Noturno";
	}

}

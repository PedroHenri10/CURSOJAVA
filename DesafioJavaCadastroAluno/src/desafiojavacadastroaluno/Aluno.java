/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiojavacadastroaluno;

/**
 *
 * @author 2830482411031
 */
public class Aluno {
    public String nome;
    public String matricula;
    public String curso;
    public String cpf;
    public String cep;
    public String numero;
    public String bairro;
    public String cidade;
    public String rua;
    public String telefone;

    public Aluno(String nome, String matricula, String curso, String cpf, String cep, String numero, String bairro, String cidade, String rua, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.rua = rua;
        this.telefone = telefone;
    }
    
    public Object[] obterDados(){
        return new Object[] {nome, matricula, curso, cpf, cep, numero, bairro, cidade, rua, telefone};
    }
}

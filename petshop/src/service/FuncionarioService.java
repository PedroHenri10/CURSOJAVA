package service;

import domain.funcionario.Funcionario;
import domain.funcionario.FuncionarioCompleto;
import domain.funcionario.LavadorEspecializado;
import domain.funcionario.TosadorEspecializado;

import java.util.ArrayList;

public class FuncionarioService {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public ArrayList<Funcionario> adicionarFuncionarios(){

        FuncionarioCompleto f1 = new FuncionarioCompleto("Maria", 100);
        LavadorEspecializado f2 = new LavadorEspecializado("Elizeu", 2);
        TosadorEspecializado f3 = new TosadorEspecializado("Camila", 5);
        FuncionarioCompleto f4 = new FuncionarioCompleto("Jones", 0);
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);

        return funcionarios;
    }

    public void listarFuncionarios(){
        if(funcionarios.isEmpty()){
            System.out.println("Não há funcionários cadastrados");
            return;
        }

        for(Funcionario f: funcionarios){
            System.out.println(f);
        }
    }
}

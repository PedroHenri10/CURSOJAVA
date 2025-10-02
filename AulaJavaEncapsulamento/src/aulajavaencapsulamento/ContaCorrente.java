/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajavaencapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author 2830482411031
 */
public class ContaCorrente {
    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueada;
    private int numConta;
    
    public ContaCorrente(String cliente, float saldo, int senha, int numConta){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueada = false;
        this.numConta = numConta;
    }
    
    //metodo comum para exibir os dados da conta cliente
    public void exibirDadosContaCliente(){
        System.out.println("Nome do cliente: "+ getCliente());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("senha: "+ getSenha());
    }
    
    public void exibirDadosSaldo(){
        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possivel verificar o saldo! ");            
        }else{
            System.out.println("Cliente: "+ getCliente() + " Seu saldo é: "+ getSaldo());
        }
    }
    
    //metodo para modificar o saldo da conta do cliente
    public void realizarSaque(){
        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar saque! ");            
        }else{
            float vlrSaque;
            vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
            if(vlrSaque < getSaldo()){
                setSaldo(getSaldo() - vlrSaque);
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            }
        }
    }
    
    public void Depositar(){
        int contaDepositar = Integer.parseInt(JOptionPane.showInputDialog("qual conta será depositada? "));
        
        if(contaDepositar == getNumConta()){
            float vlrDeposito;
            vlrDeposito = Float.parseFloat(JOptionPane.showInputDialog("Valor a depositar: "));
            setSaldo(getSaldo() + vlrDeposito);
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel depositar ");     
        }
    }
    
    public void TrocarSenha(){
        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null, "Não foi possivel trocar a senha: ");     
        }else{
            int pwdNovo = Integer.parseInt(JOptionPane.showInputDialog("senha nova: "));
            setSenha(pwdNovo);
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso! ");     
        }
    }
    
    //metodo para validar senha em diversas operacoes
    private boolean verificarSenha(){
        int tentativas = 3;
        do{
            int pwd = Integer.parseInt(JOptionPane.showInputDialog("senha: "));
            if(pwd == getSenha()){
                return true;
            }else{
                tentativas--;
                JOptionPane.showMessageDialog(null, "Senha invalida! tentativas restantes: " + tentativas);     
            }
        }while(tentativas > 0);
        
        setBloqueada(true);
        JOptionPane.showMessageDialog(null, "Conta bloqueada por 1 hora!");
        return false;
    }
    
    //metodos acessores
    //guarda a informação do atributo
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    //retorna o conteudo do atributo
    private float getSaldo(){
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    
}

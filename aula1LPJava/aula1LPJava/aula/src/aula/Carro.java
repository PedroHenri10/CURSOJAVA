/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author 2830482411031
 */
public class Carro {
    public String modelo;
    public int anoFabricacao;
    private String cor;
    private boolean estado;
    
    public void ligar(){
        estado = true;
    }
    
    public void desligar(){
        estado = false;
    }
    
    public boolean getEstado(){
        return estado;
    }
}

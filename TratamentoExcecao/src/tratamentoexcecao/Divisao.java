/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoexcecao;

import javax.swing.JOptionPane;

/**
 *
 * @author 2830482411031
 */
public class Divisao {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
         int a, b,divi , div = 0;
        a = 12;
        b = 5;
        
        String numA, numB;
        
        numA = JOptionPane.showInputDialog("Digite o valor de A");
        numB = JOptionPane.showInputDialog("Digite o valor de B");
        
        try{
            a = Integer.parseInt(numA);
            b = Integer.parseInt(numB);
            
            div =a/b;
            divi = dividir(a,b);
            System.out.println("Divisao" + div);
        }
        catch(ArithmeticException e){
            System.out.println("Nao existe divisao por zero!! ");
        }
        catch(NumberFormatException e){
            System.out.println("Digite apenas numeros!!!");
        }
        catch(DivisaoExcecao e){
            System.out.println("Ocorreu uma excecao do tipo:" + e.toString());
        }
        catch(Exception e){
            System.out.println("Ocorreu um excecao do tipo: " + e.toString());
        }
    }// fim do programa
    
    
    public static int dividir(int a, int b) throws DivisaoExcecao{
        if(a<b)
            throw new DivisaoExcecao();
        if(b > 500)
            throw new DivisaoExcecao(b);
        if(a < 0 || b <0)
            throw new DivisaoExcecao("wwwS");
        return a/b;
    }
    
}// fim da classe

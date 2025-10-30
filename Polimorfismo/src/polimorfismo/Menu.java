/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *Classe para instanciar menu com diversos sabores de pizza
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public class Menu {
    Pizza pizza ;
    Forno forno = new Forno();
    String msg;
    
    public Menu(){
        int opc = 0;
        msg = "1 - Frango com catupiry";
        msg = msg + "\n2 - Calabresa";
        msg = msg + "\n3 - CincoQueijos";
        msg = msg + "\n4 - Marguerita";
        msg = msg + "\n5 - Napolitana";
        msg = msg + "\n6 - Portuguesa";
        msg = msg + "\n7 - Romeu e Juleita";
        msg = msg + "\n8 - Sorvete";
        msg = msg + "\n9 - Pao Caseiro";
        msg = msg + "\n10 - Finalizar";
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: pizza = new FrangoCatupiry();
                break;
            case 2:
                pizza = new Calabresa();
                break;
            case 3:
                pizza = new CincoQueijos();
                break;
            case 4:
                pizza = new Marguerita();
                break;
            case 5:
                pizza = new Napolitana();
                break;
            case 6:
                pizza = new Portuguesa();
                break;
            case 7:
                pizza = new RomeuJulieta();
                break;
            case 8:
                pizza = new Sorvete();
                break;
            case 9:
                pizza = new PaoCaseiro();
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Encerrando o programa. Até mais!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }//fim do switch
        forno.preparar(pizza);
        
    }// fim do constructot
}

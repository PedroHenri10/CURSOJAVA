/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrencia;

import java.awt.Color;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 2830482411031
 */
public class Janela extends Thread{
    JFrame frame = new JFrame();
    
    JPanel panel = new JPanel();
    JTextField texto = new JTextField();
    int sleepTime;
    float r,g,b;
    
    public Janela(){
        int x = (int)(Math.random()*1520);
        int y = (int)(Math.random()*680);
        texto.setText("Vasco");
        panel.add(texto);
        
        r = (float)(Math.random()*150);
        g = (float)(Math.random()*450);
        b = (float)(Math.random()*217);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("messiCareca.jpg"));
        Image img = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        JLabel imagem = new JLabel(new ImageIcon(img));
 
        // Adiciona a imagem ao painel
        panel.add(imagem);
 
       // painel.setBackground(Color.getHSBColor((float) Math.random(), (float) Math.random(), (float) Math.random()));
        
        sleepTime = (int) (Math.random() * 100);
        
        frame.setSize(400, 400); // x e y largura e altura
        frame.add(panel);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(10000);
            frame.dispose();
        }catch(InterruptedException ex){
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

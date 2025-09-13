/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro henrique
 * @since 11/09/2025
 */
public class Concessionaria {
    
    public static void main(String[] args) {
        //variavel de referencia 
       Carro carro = new Carro("Mercedes", "CLA250", "Rosa", 2022, (float)800000, false, 250);
       //carro.exibirDadosCarroGUI();
       /*carro.exibirDadosVeiculo();
       Carro c1;
       c1 = new Carro();
       c1.exibirDadosCarroGUI();
       Caminhao ca2;
       ca2 = new Caminhao();
       ca2.exibirDadosCaminhaoGUI();*/
       
       Carro c2 = new Carro("BMW", "320i", "Preto", 2023, 250000f, false, 240);
        Carro c3 = new Carro("Audi", "A3", "Branco", 2021, 200000f, false, 230);
        Carro c4 = new Carro("Toyota", "Corolla", "Prata", 2020, 150000f, false, 210);
        Carro c5 = new Carro("Honda", "Civic", "Azul", 2022, 160000f, false, 220);
        
        Caminhao ca1 = new Caminhao("Volvo", "FH", "Branco", 2019, 450000f, "metal", 9000, 3000);
        Caminhao ca2 = new Caminhao("Scania", "R450", "Vermelho", 2021, 500000f, "metal",8000,3500);

        carro.exibirDadosVeiculo();
        c2.exibirDadosVeiculo();
        c3.exibirDadosVeiculo();
        c4.exibirDadosVeiculo();
        c5.exibirDadosVeiculo();
        ca1.exibirDadosVeiculo();
        ca2.exibirDadosVeiculo();

        String[] colunas = {"Tipo", "Marca", "Modelo", "Cor", "Ano", "Preço"};
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);

        modeloTabela.addRow(new Object[]{"Carro", carro.getMarca(), carro.getModelo(), carro.getCor(), carro.getAno(), carro.getValor()});
        modeloTabela.addRow(new Object[]{"Carro", c2.getMarca(), c2.getModelo(), c2.getCor(), c2.getAno(), c2.getValor()});
        modeloTabela.addRow(new Object[]{"Carro", c3.getMarca(), c3.getModelo(), c3.getCor(), c3.getAno(), c3.getValor()});
        modeloTabela.addRow(new Object[]{"Carro", c4.getMarca(), c4.getModelo(), c4.getCor(), c4.getAno(), c4.getValor()});
        modeloTabela.addRow(new Object[]{"Carro", c5.getMarca(), c5.getModelo(), c5.getCor(), c5.getAno(), c5.getValor()});

        modeloTabela.addRow(new Object[]{"Caminhão", ca1.getMarca(), ca1.getModelo(), ca1.getCor(), ca1.getAno(), ca1.getValor()});
        modeloTabela.addRow(new Object[]{"Caminhão", ca2.getMarca(), ca2.getModelo(), ca2.getCor(), ca2.getAno(), ca2.getValor()});

       Carro c8;
       c8 = new Carro();
       c8.exibirDadosCarroGUI();
       Caminhao ca3;
       ca3 = new Caminhao();
       ca3.exibirDadosCaminhaoGUI();
       
       modeloTabela.addRow(new Object[]{"Carro", c8.getMarca(), c8.getModelo(), c8.getCor(), c8.getAno(), c8.getValor()});
        modeloTabela.addRow(new Object[]{"Caminhão", ca3.getMarca(), ca3.getModelo(), ca3.getCor(), ca3.getAno(), ca3.getValor()});
        
        JTable tabela = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabela);
        JOptionPane.showMessageDialog(null, scrollPane, "Veículos disponíveis", JOptionPane.INFORMATION_MESSAGE);

        Pessoa p1 = new Pessoa();
        p1.exibirDadosPessoa();
        p1.exibirDadosPessoaGUI();

        String[] opcoes = {"Mercedes CLA250", "BMW 320i", "Audi A3", "Toyota Corolla", "Honda Civic", "Volvo FH", "Scania R450"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha um veículo para comprar:",
                "Compra de Veículo", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog(null, p1.getNome() + " comprou o veículo: " + escolha + "\nCompra efetivada com sucesso!");
        
    }
    
    
}

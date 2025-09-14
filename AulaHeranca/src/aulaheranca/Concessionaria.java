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
        
        Carro c8 = new Carro();
        c8.exibirDadosCarroGUI();
        Caminhao ca3 = new Caminhao();
        ca3.exibirDadosCaminhaoGUI();
        
        Veiculo[] veiculos = {
            carro, c2, c3, c4, c5, ca1, ca2,c8,ca3
        };
        
        String[] colunas = {"Tipo", "Marca", "Modelo", "Cor", "Ano", "Preço"};
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);

        for (Veiculo v : veiculos) {
            String tipo = (v instanceof Carro) ? "Carro" : "Caminhão";
            modeloTabela.addRow(new Object[]{
                tipo, v.getMarca(), v.getModelo(), v.getCor(), v.getAno(), v.getValor()
            });
        }

        JTable tabela = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabela);
        JOptionPane.showMessageDialog(null, scrollPane, "Veículos disponíveis", JOptionPane.INFORMATION_MESSAGE);

        Pessoa p1 = new Pessoa();
        
        String[] opcoes = new String[veiculos.length];
        for (int i = 0; i < veiculos.length; i++) {
            opcoes[i] = veiculos[i].getMarca() + " " + veiculos[i].getModelo();
        }

        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Escolha um veículo para comprar:",
                "Compra de Veículo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        for (Veiculo v : veiculos) {
            if ((v.getMarca() + " " + v.getModelo()).equals(escolha)) {
                p1.setVeiculoComprado(v); 
                break;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                p1.getNome() + " comprou o veículo: " +
                p1.getVeiculoComprado().getMarca() + " " +
                p1.getVeiculoComprado().getModelo() +
                "\nCompra efetivada com sucesso!"
        );
        p1.exibirDadosPessoaGUI();
    }
    
    
}

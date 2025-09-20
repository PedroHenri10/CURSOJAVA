/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiojavacadastroaluno;
import desafiojavacadastroaluno.Pessoa;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 2830482411031
 */
public class PessoaDAO {
    
    private Conexao conexao;
    private Connection conn;
    
    public PessoaDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Pessoa pessoa){
        String sql = "INSERT INTO pessoa (id, nome, sexo, idioma) VALUES (?,?,?,?);";
        try{
            PreparedStatement stmt  = this.conn.prepareStatement(sql);
            stmt.setInt(1, pessoa.getId());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getSexo());
            stmt.setString(4, pessoa.getIdioma());
            stmt.execute();
        } catch(SQLException ex){
            System.out.println("erro ao inserir pessoa: " +ex.getMessage());
        }
        
    }
}

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
    
    public Pessoa getPessoa(int id) {
    String sql = "SELECT * FROM pessoa where id = ?";
    
    try{
        PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Pessoa p = new Pessoa();
        
        rs.first();
        p.setId(id);
        p.setNome(rs.getString("Nome"));
        p.setSexo(rs.getString("sexo"));
        p.setNome(rs.getString("idioma"));
        return p;
    }catch(SQLException ex){
        System.out.println("Erro ao consultar pessoa: "+ex.getMessage());
        return null;
    }
}
    
    public void editar(Pessoa pessoa){
        try{
            String sql = "UPDATE pessoa SET nome = ?, sexo = ?, idioma = ? WHERE id = ?";
 
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.setInt(4, pessoa.getId());

            stmt.execute();
            System.out.println("Pessoa atualizada com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar pessoa: " + ex.getMessage());

            }
    }
    
    public void excluir(int id){
        try{
            String sql = "delete from pessoa where id=?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao excluir pessoa: " + ex.getMessage());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiojavacadastroaluno;

/**
 *
 * @author 2830482411031
 */
public class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private String idioma;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Pessoa(int id, String nome, String sexo, String idioma) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }
            
     public Pessoa(){
         
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescrita;

/**
 *
 * @author 2830482411031
 */
public class Aluno extends Pessoa{
    private int ra;
    private float media;
    private int faltas;
    private boolean dependencias;

    public Aluno(String nome, int idade, Float altura,int ra, float media, int faltas, boolean dependencias) {
        super(nome, idade, altura);
        this.ra = ra;
        this.media = media;
        this.faltas = faltas;
        this.dependencias = dependencias;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public boolean isDependencias() {
        return dependencias;
    }

    public void setDependencias(boolean dependencias) {
        this.dependencias = dependencias;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Ra: "+ ra+ " tem a media: "+media+ " a quantidades de faltas: "+faltas+ " e dependencia é: " +dependencias);
    }
    
    public void exibirDados(boolean bo){
        super.exibirDados();
        System.out.println("Ra: " + ra);
        System.out.println("media: " + media);
        System.out.println("faltas: " + faltas);
        if(dependencias){
            System.out.println("o aluno tem dependencias ");
        }else{
            System.out.println("o aluno não tem dependencias ");
        }
    }
    
    public void exibirDados(int x){
        System.out.println("Ra: " + ra);
        System.out.println("media: " + media);
    }
}

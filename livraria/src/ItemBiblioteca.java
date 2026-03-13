import java.util.Scanner;

public class ItemBiblioteca {
    private String codigo;
    private String titulo;
    private int anoPublicado;
    private boolean emprestado = false;
    private static int totalItensCadastrados = 0;

    public ItemBiblioteca(String codigo, String titulo, int anoPublicado) {
        if (codigo.isBlank() || codigo == null) {
            System.out.println("Não é permitido codigo vazio");
        } else {
            this.codigo = codigo;
        }

        if (titulo.isBlank() || titulo == null) {
            System.out.println("Não é permitido titulo vazio");
        } else {
            this.titulo = titulo;
        }

        if (anoPublicado <= 0) {
            System.out.println("Não é permitido ano mmenor ou igual a zero");
        } else {
            this.anoPublicado = anoPublicado;
        }

        totalItensCadastrados++;
    }

    public double calcularMulta(int diasAtraso){
        return diasAtraso * 1.0;
    }

    public void emprestar(){
        if(!isEmprestado()){
            emprestado = true;
        }
    }

    public void devolver(){
        if(!isEmprestado()){
            System.out.println("O item não foi emprestado!");
        }else{
            emprestado = false;
        }
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnoPublicado(){
        return anoPublicado;
    }

    public static int getTotalItensCadastrados() {
        return totalItensCadastrados;
    }

    @Override
    public String toString() {
        return "ItemBiblioteca - " + getCodigo() + " - "+ getTitulo()+ " - " + getAnoPublicado()+ " - " + isEmprestado();
    }
}

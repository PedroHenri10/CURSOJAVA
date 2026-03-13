public class Livro extends ItemBiblioteca{
    private String autor;


    public Livro(String codigo, String titulo, int anoPublicado, String autor) {
        super(codigo, titulo, anoPublicado);
        this.autor= autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso * 1.50;
    }

    @Override
    public String toString() {

        return "LIVRO - " + getCodigo() + " - "+ getTitulo()+ " - " + getAnoPublicado()+ " - " + isEmprestado()+
                " - " + autor;
    }
}

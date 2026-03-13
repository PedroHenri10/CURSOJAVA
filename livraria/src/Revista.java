public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String codigo, String titulo, int anoPublicado, int edicao) {
        super(codigo, titulo, anoPublicado);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso * 0.75;
    }

    @Override
    public String toString() {
        return "REVISTA - " + getCodigo() + " - " + getTitulo()+ " - " + getAnoPublicado()+ " - " + isEmprestado()+
                " - "  + edicao;
    }
}

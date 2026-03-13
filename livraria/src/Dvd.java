public class Dvd extends ItemBiblioteca{
    private int duracaoMinutos;

    public Dvd(String codigo, String titulo, int anoPublicado, int duracaoMinutos) {
        super(codigo, titulo, anoPublicado);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso * 3.00;
    }

    @Override
    public String toString() {
        return "DVD - " + getCodigo() + " - " + getTitulo()+ " - " + getAnoPublicado()+ " - " + isEmprestado()+
                " - " + duracaoMinutos;
    }
}

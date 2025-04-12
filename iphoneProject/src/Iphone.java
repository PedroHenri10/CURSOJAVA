public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos de NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.ligar("123456789");
        iphone.exibirPagina("www.exemplo.com");
    }
}

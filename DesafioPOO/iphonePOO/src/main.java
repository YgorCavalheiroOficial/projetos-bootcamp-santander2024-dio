public class main {
    public static void main(String[] args) {
        iphone iphone = new iphone("iPhone 2007", 64);

        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba("https://www.google.com.br");
        iphone.atualizarPagina("https://www.google.com.br");
        iphone.fecharPagina("https://www.google.com.br");

        iphone.ligar("40028922");
        iphone.atender("40028922");
        iphone.iniciarCorreioVoz("40028922");

        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();

    }
}

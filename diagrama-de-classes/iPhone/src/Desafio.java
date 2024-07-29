public class Desafio {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 12", "iOS 14");

        // Testando ReprodutorMusical
        meuIphone.adicionarMusica("Musica1");
        meuIphone.adicionarMusica("Musica2");
        meuIphone.selecionarMusica("Musica1");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando AparelhoTelefonico
        meuIphone.ligar("123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}


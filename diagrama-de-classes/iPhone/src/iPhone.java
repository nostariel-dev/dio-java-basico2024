import java.util.ArrayList;
import java.util.List;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String versaoSO;

    private List<String> biblioteca;
    private String musicaAtual;

    private List<String> abas;

    public iPhone(String modelo, String versaoSO) {
        this.modelo = modelo;
        this.versaoSO = versaoSO;
        this.biblioteca = new ArrayList<>();
        this.abas = new ArrayList<>();
    }

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("Música pausada: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (biblioteca.contains(musica)) {
            musicaAtual = musica;
            System.out.println("Música selecionada: " + musicaAtual);
        } else {
            System.out.println("Música não encontrada na biblioteca.");
        }
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        abas.add("Nova aba");
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }

    // Métodos adicionais
    public void adicionarMusica(String musica) {
        biblioteca.add(musica);
        System.out.println("Música adicionada à biblioteca: " + musica);
    }

    public List<String> getBiblioteca() {
        return biblioteca;
    }

    public List<String> getAbas() {
        return abas;
    }
}


public abstract class ConteudoAbstrato implements Conteudo {
    protected String titulo;
    protected String descricao;

    // Getters e setters comuns para todos os conteúdos
    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public abstract double calcularXp();
}


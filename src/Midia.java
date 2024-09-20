public class Midia {
    protected String titulo;
    protected String tipoMidia;
    protected int copiasDisponiveis;
    protected int duracaoEmprestimo;

    public Midia(String titulo, String tipoMidia, int copiasDisponiveis, int duracaoEmprestimo) {
        this.titulo = titulo;
        this.tipoMidia = tipoMidia;
        this.copiasDisponiveis = copiasDisponiveis;
        this.duracaoEmprestimo = duracaoEmprestimo;
    }

    public boolean emprestarMidia(Usuario usuario) {
        if (copiasDisponiveis > 0 && usuario.podeEmprestar()) {
            copiasDisponiveis--;
            usuario.adicionarEmprestimo(this);
            return true;
        }
        return false;
    }

    public void devolverMidia(Usuario usuario) {
        copiasDisponiveis++;
        usuario.removerEmprestimo(this);
    }

    public int getDuracaoEmprestimo() {
        return duracaoEmprestimo;
    }
}

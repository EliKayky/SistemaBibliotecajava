import java.util.ArrayList;

public class Usuario {
    protected String nome;
    protected String tipoUsuario;
    protected int limiteEmprestimos;
    protected ArrayList<Midia> emprestimos;
    protected int bonusFidelidade;
    protected int maxRenovacoes;

    public Usuario(String nome, String tipoUsuario, int limiteEmprestimos, int maxRenovacoes) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.limiteEmprestimos = limiteEmprestimos;
        this.maxRenovacoes = maxRenovacoes;
        this.emprestimos = new ArrayList<>();
        this.bonusFidelidade = 1;  // Bônus de +1
    }


    public boolean podeEmprestar() {
        return emprestimos.size() < limiteEmprestimos + bonusFidelidade;
    }

    public void adicionarEmprestimo(Midia midia) {
        emprestimos.add(midia);
    }

    public void removerEmprestimo(Midia midia) {
        emprestimos.remove(midia);
    }

    public ArrayList<Midia> getEmprestimos() {
        return emprestimos;
    }

    public boolean podeRenovar() {
        return maxRenovacoes > 0;
    }

    public void reduzirRenovacoes() {
        if (maxRenovacoes > 0) {
            maxRenovacoes--;
        }
    }
}

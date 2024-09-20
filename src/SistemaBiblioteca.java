import java.util.ArrayList;

public class SistemaBiblioteca {
    private ArrayList<Midia> catalogo;
    private ArrayList<Usuario> usuarios;

    public SistemaBiblioteca() {
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Adicionar mídia ao catálogo
    public void adicionarMidia(Midia midia) {
        catalogo.add(midia);
    }

    // Registrar um novo usuário
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Emprestar mídia a um usuário
    public String emprestarMidia(Usuario usuario, String tituloMidia) {
        for (Midia midia : catalogo) {
            if (midia.titulo.equals(tituloMidia)) {
                if (midia.emprestarMidia(usuario)) {
                    return tituloMidia + " emprestado com sucesso.";
                } else {
                    return "Não é possível emprestar: limite atingido ou sem cópias disponíveis.";
                }
            }
        }
        return "Mídia não encontrada.";
    }

    // Devolver mídia de um usuário
    public String devolverMidia(Usuario usuario, String tituloMidia) {
        for (Midia midia : usuario.getEmprestimos()) {
            if (midia.titulo.equals(tituloMidia)) {
                midia.devolverMidia(usuario);
                return tituloMidia + " devolvido com sucesso.";
            }
        }
        return "Mídia não encontrada nos empréstimos do usuário.";
    }

    // Renovar mídia para um usuário
    public String renovarMidia(Usuario usuario, String tituloMidia) {
        for (Midia midia : usuario.getEmprestimos()) {
            if (midia.titulo.equals(tituloMidia)) {
                if (usuario.podeRenovar()) {
                    usuario.reduzirRenovacoes();
                    return tituloMidia + " renovado com sucesso.";
                } else {
                    return "Limite de renovações atingido.";
                }
            }
        }
        return "Mídia não encontrada nos empréstimos do usuário.";
    }
}

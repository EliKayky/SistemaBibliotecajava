public class Main {
    public static void main(String[] args) {
        // Inicializa o sistema da biblioteca
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        // Adiciona mídias ao catálogo
        Midia livro = new SubMidia("O Grande Gatsby", "LivroFisico");
        Midia dvd = new SubMidia("A Origem", "DVD");
        Midia ebook = new SubMidia("Fortaleza Digital", "EBook");

        biblioteca.adicionarMidia(livro);
        biblioteca.adicionarMidia(dvd);
        biblioteca.adicionarMidia(ebook);

        // Cria usuários
        Usuario estudante = new Usuario("João Silva", "Estudante", 3, 1);  // 1 renovação para estudantes
        Usuario professor = new Usuario("Maria Santos", "Professor", 6, 3);  // 3 renovações para professores

        biblioteca.adicionarUsuario(estudante);
        biblioteca.adicionarUsuario(professor);

        // Estudante empresta um livro
        System.out.println(biblioteca.emprestarMidia(estudante, "O Grande Gatsby"));

        // Professor empresta um ebook
        System.out.println(biblioteca.emprestarMidia(professor, "Fortaleza Digital"));

        // Devolução de um livro
        System.out.println(biblioteca.devolverMidia(estudante, "O Grande Gatsby"));

        // Renovar um ebook para o professor
        System.out.println(biblioteca.renovarMidia(professor, "Fortaleza Digital"));
    }
}

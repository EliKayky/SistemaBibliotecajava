public class SubMidia extends Midia {

    public SubMidia(String titulo, String tipo) {
        super(titulo, tipo, calcularCopias(tipo), calcularDuracao(tipo));
    }

    // Calcula o número de cópias com base no tipo de mídia
    private static int calcularCopias(String tipo) {
        switch (tipo) {
            case "LivroFisico":
                return 3;  // Exemplo: 3 cópias de livros
            case "DVD":
                return 2;  // Exemplo: 2 cópias de DVDs
            case "EBook":
                return Integer.MAX_VALUE;  // Cópias infinitas para eBooks
            default:
                return 1;
        }
    }

    // Calcula a duração do empréstimo com base no tipo de mídia
    private static int calcularDuracao(String tipo) {
        switch (tipo) {
            case "LivroFisico":
                return 14;  // 14 dias para livros
            case "DVD":
                return 7;  // 7 dias para DVDs
            case "EBook":
                return 21;  // 21 dias para eBooks
            default:
                return 0;
        }
    }
}

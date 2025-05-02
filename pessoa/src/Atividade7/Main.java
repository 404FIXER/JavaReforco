package Atividade7;

public class Main {
    public static void main(String[] args) {
        Livro[] acervo = {
                new Livro("Dom Casmurro",          "Machado de Assis"),
                new Livro("1984",                  "George Orwell"),
                new Livro("O Hobbit",              "J. R. R. Tolkien"),
                new Livro("A Revolução dos Bichos","George Orwell"),
                new Livro("O Pequeno Príncipe",    "Antoine de Saint-Exupéry")
        };
        System.out.println("— Estado inicial —");
        for (Livro livro : acervo) livro.informar();
        System.out.println();
        // 📚 1º empréstimo: "O Hobbit"
        acervo[2].emprestar();

        // 📚 2º empréstimo: tentar emprestar "O Hobbit" de novo (gera erro)
        acervo[2].emprestar();

        // 📚 Devolução: "O Hobbit"
        acervo[2].devolver();

        // 📚 3º empréstimo: "Dom Casmurro"
        acervo[0].emprestar();
        System.out.println("\n— Estado final —");

        for (Livro l : acervo) l.informar();

    }
}

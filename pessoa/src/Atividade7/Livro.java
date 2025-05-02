package Atividade7;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;




    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;

    }
    public boolean emprestar () {
        if (emprestado) {
            System.out.println( "Erro! " + titulo + " já emprestado! ");
            return false;
        }
        emprestado = true;
        System.out.println("Titulo: " + titulo + " Emprestado com sucesso! ");
        return true;

    }
    public boolean devolver() {
        if (!emprestado) {
            System.out.println("Erro! " + titulo + " não foi emprestado!");
            return false;

        }
        System.out.println(" Titulo " + titulo + " foi devolvido com sucesso!" );
        return true;
    }
    public void informar() {
        String status = emprestado? "Emprestado" : "Disponivel";
        System.out.printf("\"%s\" de %s  —  %s%n", titulo, autor, status);
    }
}

package Atividade2;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Cobertor");
        p1.setPreco(8.99);
        p1.setEstoque(10);
        p1.abastecer(10);
    }
}

package Atividade2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean comprar(int qtd) {
        if (qtd < 0) {
            System.out.println("Quantidade Invalida para a Compra!");
            return false;
        }
        if (qtd > estoque) {
            System.out.println("O Nivel de estoque do produto selecionado está escasso, selecione um numero menor ou espere o produto ser reabastecido! ");
            return false;
        }
        estoque -= qtd;
        double total = qtd * preco;
        System.out.println(" Produto: " + nome + " \n Quantidade: " + qtd + " \n Total: " + total);
        return true;
    }

    public boolean abastecer(int qtd) {
        int estoqueanterior = estoque;
        estoque += qtd;

        if (qtd <= 0) {
            System.out.println("Quantidade inválida para abastecimento.");
            return false;
        }

            System.out.println(" Produto: " + nome);
            System.out.println(" Estoque anterior: " + estoqueanterior + " + " + qtd + " Unidade(s)");
            System.out.println(" Estoque atual : " + estoque + " adicionado(s) ao estoque ");
            return true;

    }
}

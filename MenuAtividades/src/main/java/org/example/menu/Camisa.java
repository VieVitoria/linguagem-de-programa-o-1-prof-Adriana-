package org.example.menu;

public class Camisa {
    private String cor;
    private String estampa;
    private double preco;

    public Camisa(String cor, String estampa, double preco) {
        this.cor = cor;
        this.estampa = estampa;
        this.preco = preco;
    }

    public String descrever() {
        return "Camisa " + cor + " com estampa " + estampa + ", preço " + Formato.reais(preco) + ".";
    }

    public double calcularTotal(int quantidade) {
        return preco * quantidade;
    }

    public String trocarCor(String novaCor) {
        if (novaCor == null || novaCor.isBlank()) return "Informe a nova cor.";
        cor = novaCor.trim();
        return "Cor trocada para " + cor + ".";
    }
}

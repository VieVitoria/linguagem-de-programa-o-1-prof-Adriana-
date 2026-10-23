package org.example.menu;

public class Terno {
    private String cor;
    private String tamanho;
    private double preco;

    public Terno(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String descrever() {
        return "Terno " + cor + ", tamanho " + tamanho + ", preço " + Formato.reais(preco) + ".";
    }

    public String aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) return "Desconto inválido (use de 0 a 100).";
        preco -= preco * percentual / 100.0;
        return "Desconto de " + Formato.numero(percentual) + "% aplicado. Novo preço: " + Formato.reais(preco) + ".";
    }

    public String ajustarTamanho(String novoTamanho) {
        if (novoTamanho == null || novoTamanho.isBlank()) return "Informe o novo tamanho.";
        tamanho = novoTamanho.trim();
        return "Tamanho ajustado para " + tamanho + ".";
    }
}

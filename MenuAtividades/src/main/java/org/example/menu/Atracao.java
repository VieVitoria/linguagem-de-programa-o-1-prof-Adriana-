package org.example.menu;

public class Atracao {
    private String nome;
    private String cidade;
    private double precoIngresso;

    public Atracao(String nome, String cidade, double precoIngresso) {
        this.nome = nome;
        this.cidade = cidade;
        this.precoIngresso = precoIngresso;
    }

    public String descrever() {
        return "Atração " + nome + " em " + cidade + ", ingresso " + Formato.reais(precoIngresso) + ".";
    }

    public double calcularTotal(int ingressos) {
        return precoIngresso * ingressos;
    }

    public String aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) return "Desconto inválido (use de 0 a 100).";
        precoIngresso -= precoIngresso * percentual / 100.0;
        return "Desconto de " + Formato.numero(percentual) + "% aplicado. Novo ingresso: " + Formato.reais(precoIngresso) + ".";
    }
}

package org.example.menu;

public class Passeio {
    private String roteiro;
    private int duracaoHoras;
    private double preco;

    public Passeio(String roteiro, int duracaoHoras, double preco) {
        this.roteiro = roteiro;
        this.duracaoHoras = duracaoHoras;
        this.preco = preco;
    }

    public String descrever() {
        return "Passeio \"" + roteiro + "\" com duração de " + duracaoHoras + "h, preço " + Formato.reais(preco) + ".";
    }

    public double calcularPrecoPorHora() {
        return preco / duracaoHoras;
    }

    public String estenderDuracao(int horasExtras) {
        duracaoHoras += horasExtras;
        return "Duração estendida. Nova duração: " + duracaoHoras + "h.";
    }
}

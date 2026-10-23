package org.example.menu;

public class Tambor {
    private String nome;
    private double diametroCm;
    private String material;
    private boolean afinado = false;

    public Tambor(String nome, double diametroCm, String material) {
        this.nome = nome;
        this.diametroCm = diametroCm;
        this.material = material;
    }

    public String descrever() {
        return "Tambor " + nome + ", " + Formato.numero(diametroCm) + " cm de diâmetro, de " + material
                + (afinado ? " (afinado)." : " (desafinado).");
    }

    public String tocar(String ritmo) {
        if (ritmo == null || ritmo.isBlank()) return "Informe o ritmo.";
        return "Tocando o tambor " + nome + " no ritmo " + ritmo.trim() + ".";
    }

    public String afinar() {
        afinado = true;
        return "O tambor " + nome + " foi afinado.";
    }
}

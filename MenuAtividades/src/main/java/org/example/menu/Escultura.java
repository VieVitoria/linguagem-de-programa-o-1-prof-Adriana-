package org.example.menu;

public class Escultura {
    private String nome;
    private double alturaCm;
    private String material;
    private boolean polida = false;

    public Escultura(String nome, double alturaCm, String material) {
        this.nome = nome;
        this.alturaCm = alturaCm;
        this.material = material;
    }

    public String descrever() {
        return "Escultura " + nome + ", " + Formato.numero(alturaCm) + " cm, de " + material
                + (polida ? " (polida)." : " (não polida).");
    }

    public String redimensionar(double novaAlturaCm) {
        if (novaAlturaCm <= 0) return "A altura deve ser maior que zero.";
        alturaCm = novaAlturaCm;
        return "Escultura redimensionada para " + Formato.numero(alturaCm) + " cm.";
    }

    public String polir() {
        polida = true;
        return "A escultura " + nome + " foi polida.";
    }
}

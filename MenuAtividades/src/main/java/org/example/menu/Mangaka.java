package org.example.menu;

public class Mangaka {
    private String nome;
    private String obraPrincipal;
    private int anosCarreira;

    public Mangaka(String nome, String obraPrincipal, int anosCarreira) {
        this.nome = nome;
        this.obraPrincipal = obraPrincipal;
        this.anosCarreira = anosCarreira;
    }

    public String apresentar() {
        return "Mangaká " + nome + ", autor de \"" + obraPrincipal + "\", com " + anosCarreira + " ano(s) de carreira.";
    }

    public String desenharCapitulo(int numero) {
        return nome + " desenhou o capítulo " + numero + " de \"" + obraPrincipal + "\".";
    }

    public String publicarObra(String revista) {
        if (revista == null || revista.isBlank()) return "Informe a revista.";
        return "\"" + obraPrincipal + "\" foi publicada na revista " + revista.trim() + ".";
    }
}

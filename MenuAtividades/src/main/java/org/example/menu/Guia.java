package org.example.menu;

public class Guia {
    private String nome;
    private String idioma;
    private int anosExperiencia;

    public Guia(String nome, String idioma, int anosExperiencia) {
        this.nome = nome;
        this.idioma = idioma;
        this.anosExperiencia = anosExperiencia;
    }

    public String apresentar() {
        return "Guia " + nome + ", fala " + idioma + ", com " + anosExperiencia + " ano(s) de experiência.";
    }

    public String conduzirGrupo(int pessoas) {
        return nome + " está conduzindo um grupo de " + pessoas + " pessoa(s) em " + idioma + ".";
    }

    public String trocarIdioma(String novoIdioma) {
        if (novoIdioma == null || novoIdioma.isBlank()) return "Informe o novo idioma.";
        idioma = novoIdioma.trim();
        return "Idioma trocado para " + idioma + ".";
    }
}

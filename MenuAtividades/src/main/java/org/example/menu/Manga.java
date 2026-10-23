package org.example.menu;

public class Manga {
    private String titulo;
    private String autor;
    private int volumes;

    public Manga(String titulo, String autor, int volumes) {
        this.titulo = titulo;
        this.autor = autor;
        this.volumes = volumes;
    }

    public String descrever() {
        return "Mangá \"" + titulo + "\" de " + autor + ", com " + volumes + " volume(s).";
    }

    public String lancarVolume() {
        volumes++;
        return "Novo volume lançado! \"" + titulo + "\" agora tem " + volumes + " volume(s).";
    }

    public int calcularPaginas(int paginasPorVolume) {
        return volumes * paginasPorVolume;
    }
}

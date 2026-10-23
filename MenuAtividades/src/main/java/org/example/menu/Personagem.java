package org.example.menu;

public class Personagem {
    private String nome;
    private String estilo;
    private int idade;

    public Personagem(String nome, String estilo, int idade) {
        this.nome = nome;
        this.estilo = estilo;
        this.idade = idade;
    }

    public String apresentar() {
        return "Personagem " + nome + ", " + idade + " ano(s), estilo " + estilo + ".";
    }

    public String desenhar(String cena) {
        if (cena == null || cena.isBlank()) return "Informe a cena.";
        return "Desenhando " + nome + " na cena: " + cena.trim() + ".";
    }

    public String mudarEstilo(String novoEstilo) {
        if (novoEstilo == null || novoEstilo.isBlank()) return "Informe o novo estilo.";
        estilo = novoEstilo.trim();
        return "Estilo alterado para " + estilo + ".";
    }
}

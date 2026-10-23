package org.example.menu;

public class Roupas {
    private String nome;
    private String cidade;
    private int estoque;

    public Roupas(String nome, String cidade, int estoque) {
        this.nome = nome;
        this.cidade = cidade;
        this.estoque = estoque;
    }

    public String apresentar() {
        return "Loja " + nome + " em " + cidade + " com " + estoque + " peça(s) em estoque.";
    }

    public String receberMercadoria(int quantidade) {
        estoque += quantidade;
        return "Recebidas " + quantidade + " peça(s). Estoque atual: " + estoque + ".";
    }

    public String venderPecas(int quantidade) {
        if (quantidade > estoque) {
            return "Estoque insuficiente. Disponível: " + estoque + " peça(s).";
        }
        estoque -= quantidade;
        return "Vendidas " + quantidade + " peça(s). Estoque atual: " + estoque + ".";
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }
}


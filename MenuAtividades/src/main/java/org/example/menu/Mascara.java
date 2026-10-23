package org.example.menu;

public class Mascara {
    private String nome;
    private String origem;
    private String material;
    private boolean conservada = true;

    public Mascara(String nome, String origem, String material) {
        this.nome = nome;
        this.origem = origem;
        this.material = material;
    }

    public String descrever() {
        return "Máscara " + nome + ", origem " + origem + ", feita de " + material
                + (conservada ? " (bem conservada)." : " (precisa de restauração).");
    }

    public String usarEmCerimonia(String cerimonia) {
        if (cerimonia == null || cerimonia.isBlank()) return "Informe a cerimônia.";
        conservada = false;
        return "A máscara " + nome + " foi usada na cerimônia " + cerimonia.trim() + " e precisa de restauração.";
    }

    public String restaurar() {
        conservada = true;
        return "A máscara " + nome + " foi restaurada.";
    }
}

package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class camelo {

    @FXML
    private Label lblResultado;

    @FXML
    private void distribuir() {

        int total = 35 + 1;

        int primeiro = total / 2;
        int segundo = total / 3;
        int terceiro = total / 9;

        int sobra = total - primeiro - segundo - terceiro;

        lblResultado.setText(
                "Quantidade original: 35\n"
                        + "Camelo acrescentado: 1\n"
                        + "Total para divisão: " + total + "\n\n"
                        + "Primeiro irmão: " + primeiro + " camelos\n"
                        + "Segundo irmão: " + segundo + " camelos\n"
                        + "Terceiro irmão: " + terceiro + " camelos\n\n"
                        + "Camelo que sobrou: " + sobra
        );
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
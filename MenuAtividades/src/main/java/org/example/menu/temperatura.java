package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class temperatura {

    @FXML
    private Label lblResultado;

    @FXML
    private void mostrarTemperaturas() {

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        int[] temperaturas = {
                24, 24, 24, 22, 19, 18, 18, 19, 20, 22, 23, 24
        };

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < meses.length; i++) {

            String classificacao = temperaturas[i] < 18
                    ? "Frio"
                    : "Temperatura agradável";

            resultado.append(meses[i])
                    .append(": ")
                    .append(temperaturas[i])
                    .append(" °C - ")
                    .append(classificacao)
                    .append("\n");
        }

        resultado.append(
                "\nA temperatura de São José dos Campos é agradável."
        );

        lblResultado.setText(resultado.toString());
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
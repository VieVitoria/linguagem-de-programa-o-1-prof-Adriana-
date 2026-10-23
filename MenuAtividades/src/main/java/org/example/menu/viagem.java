package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class viagem {

    @FXML
    private TextField txtDistancia;

    @FXML
    private TextField txtPreco;

    @FXML
    private Label lblResultado;

    private double ler(String texto) {
        double valor = Double.parseDouble(
                texto.trim().replace(",", ".")
        );

        if (!Double.isFinite(valor) || valor < 0) {
            throw new NumberFormatException();
        }

        return valor;
    }

    @FXML
    private void calcularViagem() {
        try {
            double distancia = ler(txtDistancia.getText());
            double preco = ler(txtPreco.getText());

            double litros = distancia / 12.0;
            double custo = litros * preco;

            if (distancia > 500) {
                custo *= 0.95;
            }

            lblResultado.setText(
                    String.format(
                            Locale.forLanguageTag("pt-BR"),
                            "Distância: %.2f km%n"
                                    + "Combustível: %.2f litros%n"
                                    + "Custo da viagem: R$ %.2f",
                            distancia, litros, custo
                    )
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                    "Digite uma distância e um preço válidos e não negativos."
            );
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
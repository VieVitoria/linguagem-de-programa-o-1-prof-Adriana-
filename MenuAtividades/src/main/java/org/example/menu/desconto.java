package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class desconto {

    @FXML private TextField txtArroz;
    @FXML private TextField txtFeijao;
    @FXML private TextField txtOleo;
    @FXML private TextField txtAcucar;
    @FXML private TextField txtCafe;
    @FXML private TextField txtMacarrao;
    @FXML private TextField txtFarinha;
    @FXML private TextField txtFuba;
    @FXML private TextField txtMolho;
    @FXML private TextField txtSal;

    @FXML private Label lblResultado;

    private double ler(TextField campo) {
        String valor = campo.getText().trim().replace(",", ".");

        double numero = Double.parseDouble(valor);

        if (!Double.isFinite(numero) || numero < 0) {
            throw new NumberFormatException();
        }

        return numero;
    }

    @FXML
    private void calcularCompra() {
        try {
            double total =
                    ler(txtArroz)
                            + ler(txtFeijao)
                            + ler(txtOleo)
                            + ler(txtAcucar)
                            + ler(txtCafe)
                            + ler(txtMacarrao)
                            + ler(txtFarinha)
                            + ler(txtFuba)
                            + ler(txtMolho)
                            + ler(txtSal);

            double desconto = total > 100 ? total * 0.10 : 0;
            double valorFinal = total - desconto;

            lblResultado.setText(
                    String.format(
                            Locale.forLanguageTag("pt-BR"),
                            "Total: R$ %.2f%nDesconto: R$ %.2f%nValor final: R$ %.2f",
                            total,
                            desconto,
                            valorFinal
                    )
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                    "Preencha os dez preços com valores válidos e não negativos."
            );
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
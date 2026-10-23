package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class multiplo {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Label lblResultado;

    @FXML
    private void verificarMultiplos() {
        try {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());

            if (num1 == 0 && num2 == 0) {
                lblResultado.setText(
                        "Digite pelo menos um número diferente de zero."
                );
            } else if (num1 == 0 || num2 == 0) {
                lblResultado.setText(
                        "O zero é múltiplo de qualquer número inteiro diferente de zero."
                );
            } else if (num1 % num2 == 0 || num2 % num1 == 0) {
                lblResultado.setText(
                        num1 + " e " + num2 + " são múltiplos entre si."
                );
            } else {
                lblResultado.setText(
                        num1 + " e " + num2 + " não são múltiplos entre si."
                );
            }

        } catch (NumberFormatException e) {
            lblResultado.setText(
                    "Por favor, digite dois números inteiros válidos."
            );
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
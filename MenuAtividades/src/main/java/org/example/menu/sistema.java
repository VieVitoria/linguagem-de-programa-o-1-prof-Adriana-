package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class sistema {

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Label lblResultado;

    @FXML
    private void verificarSenha() {
        String senha = txtSenha.getText();

        if (senha == null || !senha.matches("\\d{4}")) {
            lblResultado.setText(
                    "Digite uma senha com exatamente 4 números!"
            );
        } else {
            lblResultado.setText(
                    "Senha de quatro números aceita!"
            );
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
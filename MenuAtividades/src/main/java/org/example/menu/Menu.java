package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Menu {

    @FXML
    private void abrirBotoesExercicios(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }

    @FXML
    private void abrirBotoesImagem(ActionEvent event) {
        Navegacao.ir(event, "BotoesImagem.fxml", "Imagens");
    }
}
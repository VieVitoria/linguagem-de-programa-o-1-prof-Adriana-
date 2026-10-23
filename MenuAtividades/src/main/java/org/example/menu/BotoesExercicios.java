package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BotoesExercicios {

    @FXML
    private void abrirMultiplo(ActionEvent event) {
        Navegacao.ir(event, "multiplo.fxml", "Verificação de Múltiplos");
    }

    @FXML
    private void abrirSistema(ActionEvent event) {
        Navegacao.ir(event, "sistema.fxml", "Sistema de Login");
    }

    @FXML
    private void abrirDescontos(ActionEvent event) {
        Navegacao.ir(event, "desconto.fxml", "Compra com Desconto");
    }

    @FXML
    private void abrirTemperatura(ActionEvent event) {
        Navegacao.ir(event, "temperatura.fxml", "Temperaturas");
    }

    @FXML
    private void abrirCamelo(ActionEvent event) {
        Navegacao.ir(event, "camelo.fxml", "Os Trinta e Cinco Camelos");
    }

    @FXML
    private void abrirViagem(ActionEvent event) {
        Navegacao.ir(event, "viagem.fxml", "Calculadora de Viagem");
    }

    @FXML
    private void abrirAluguel(ActionEvent event) {
        Navegacao.ir(event, "aluguel.fxml", "Aluguel de Carro");
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "Menu.fxml", "Menu");
    }
}
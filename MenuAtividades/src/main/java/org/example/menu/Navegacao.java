package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class Navegacao {

    /** Troca a tela da janela onde o botão foi clicado. */
    public static void ir(ActionEvent event, String arquivoFxml, String titulo) {
        try {
            Parent tela = carregar(arquivoFxml);
            Stage janela = (Stage) ((Node) event.getSource()).getScene().getWindow();
            janela.setTitle(titulo);
            janela.setScene(new Scene(tela, 800, 700));
            janela.show();
        } catch (IOException | RuntimeException e) {
            erro(arquivoFxml, e);
        }
    }

    /** Abre a tela em uma janela nova. */
    public static void abrirJanela(String arquivoFxml, String titulo) {
        try {
            Parent tela = carregar(arquivoFxml);
            Stage janela = new Stage();
            janela.setTitle(titulo);
            janela.setScene(new Scene(tela, 800, 700));
            janela.show();
        } catch (IOException | RuntimeException e) {
            erro(arquivoFxml, e);
        }
    }

    private static Parent carregar(String arquivoFxml) throws IOException {
        return new FXMLLoader(Navegacao.class.getResource(arquivoFxml)).load();
    }

    private static void erro(String arquivoFxml, Exception e) {
        e.printStackTrace();
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText("Não foi possível abrir a tela: " + arquivoFxml);
        alerta.setContentText(String.valueOf(e.getMessage()));
        alerta.showAndWait();
    }
}

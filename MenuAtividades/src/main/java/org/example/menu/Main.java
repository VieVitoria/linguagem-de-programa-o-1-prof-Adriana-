package org.example.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Menu.fxml"));
        stage.setTitle("Menu");
        stage.setScene(new Scene(loader.load(), 800, 700));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
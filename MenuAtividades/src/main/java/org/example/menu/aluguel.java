
package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class aluguel {

    @FXML
    private TextField txtDias;

    @FXML
    private TextField txtKm;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcularAluguel() {
        try {
            int dias = Integer.parseInt(txtDias.getText().trim());

            double km = Double.parseDouble(
                    txtKm.getText().trim().replace(",", ".")
            );

            if (dias <= 0 || !Double.isFinite(km) || km < 0) {
                lblResultado.setText(
                        "Informe dias positivos e quilometragem não negativa."
                );
                return;
            }

            double franquia = dias * 100.0;
            double total = dias * 100.0;

            if (km > franquia) {
                total += (km - franquia) * 2.0;
            }

            lblResultado.setText(
                    String.format(
                            Locale.forLanguageTag("pt-BR"),
                            "Diárias: R$ %.2f%n"
                                    + "Franquia: %.0f km%n"
                                    + "Valor total: R$ %.2f",
                            dias * 100.0,
                            franquia,
                            total
                    )
            );

        } catch (NumberFormatException e) {
            lblResultado.setText(
                    "Digite uma quantidade de dias inteira e quilômetros válidos."
            );
        }
    }

    @FXML
    private void voltar(ActionEvent event) {
        Navegacao.ir(event, "BotoesExercicios.fxml", "Exercícios");
    }
}
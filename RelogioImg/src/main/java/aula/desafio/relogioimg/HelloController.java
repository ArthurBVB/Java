package aula.desafio.relogioimg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Date;

public class HelloController {
    @FXML
    private Label lblHora;
    private Button btnHora;

    @FXML
    private void clicouBotao(ActionEvent event){
        Date relogio = new Date();
        lblHora.setText(relogio.toString());
    }
}

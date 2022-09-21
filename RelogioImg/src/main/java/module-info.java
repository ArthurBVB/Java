module aula.desafio.relogioimg {
    requires javafx.controls;
    requires javafx.fxml;


    opens aula.desafio.relogioimg to javafx.fxml;
    exports aula.desafio.relogioimg;
}
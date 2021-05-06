package sample.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;


public class Home {

    @FXML
    private Button btnCirculo;
    @FXML
    private Button btnRetangulo;


    @FXML
    public void calcularR(ActionEvent actionEvent) throws  Exception{
        if(actionEvent.getSource() == btnRetangulo){
            Main m = new Main();
            m.changeScene("scenes/retangulo.fxml");
            System.out.println("Acessa tela de retangulo");
        }

    }
    @FXML
    public void calcularC(ActionEvent actionEvent) throws  Exception{
        if (actionEvent.getSource() == btnCirculo){
            Main m = new Main();
            m.changeScene("scenes/circulo.fxml");
            System.out.println("Acessa tela de circulo");
        }
    }

}

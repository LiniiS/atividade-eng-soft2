package sample.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Main;

import java.text.DecimalFormat;

public class Area {

    @FXML
    private TextField tfLargura;
    @FXML
    private TextField tfComprimento;
    @FXML
    private TextField tfRaio;
    @FXML
    private TextField tfCircunferencia; //verificar a necessidade
    @FXML
    private Button btnHome;
    @FXML
    private Button btnCalcAreaRetangulo;
    @FXML
    private Button btnCalcAreaCirculo;
    @FXML
    private Label labelResultadoArea;
    @FXML
    private Label labelResultadoPisos;
    @FXML
    private Label labelPerimetro;

    private double area;
    private double quantidadePisos;
    private double perimetro;
    private final double areaPiso = 360;


    @FXML
    public void calcularArea(ActionEvent actionEvent){
        if(actionEvent.getSource() == btnCalcAreaRetangulo){
            calcularAreaRetangulo();
            calcularPisos();
            calcularPerimetroRetangulo();

        }
        if (actionEvent.getSource() == btnCalcAreaCirculo){
            calcularAreaCirculo();
            calcularPisos();
            calcularPerimetroCirculo();

        }
        mostrarResultado();
    }

    private double calcularAreaRetangulo(){
        double largura = Double.parseDouble(tfLargura.getText());
        double comprimento = Double.parseDouble((tfComprimento.getText()));
        this.area = largura * comprimento;
        return area;
    }

    private double calcularAreaCirculo(){
        double raio = Double.parseDouble(tfRaio.getText())/2;
    //    double circunferencia = Double.parseDouble((tfCircunferencia.getText()));
        this.area = 2 * Math.PI * Math.pow(raio,2);

        return area;
    }

    private double calcularPisos(){

        quantidadePisos = area/areaPiso;

        return quantidadePisos;
    }

    private double calcularPerimetroCirculo(){
        double raio = Double.parseDouble(tfRaio.getText())/2;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
    private double calcularPerimetroRetangulo(){
        double largura = Double.parseDouble(tfLargura.getText());
        double comprimento = Double.parseDouble((tfComprimento.getText()));
        this.perimetro = ((largura * 2) + (comprimento * 2));

        return perimetro;
    }

    private void mostrarResultado(){
        DecimalFormat df = new DecimalFormat("#,###.##");
        labelResultadoArea.setText("Área: " + df.format(area) + " m²");
        labelResultadoPisos.setText("Pisos: " + df.format(quantidadePisos) + " unidades");
        labelPerimetro.setText("Perímetro: " + df.format(perimetro) + " m");
    }

    @FXML
    public void voltarHome(ActionEvent actionEvent) throws  Exception{
        if(actionEvent.getSource() == btnHome){
            Main m = new Main();
            m.changeScene("scenes/sample.fxml");
            System.out.println("Volar para Home");
        }
    }

    

}

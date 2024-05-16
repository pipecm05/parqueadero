package co.edu.uniquindio.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class facturaController {


      @FXML
    private TextField txt_mostrarID;

    @FXML
    private TextField txt_mostrarNombre;

        @FXML
    private Label label_nombre;


    

    public void recibir_infoMotos(String nombre , String cedula , TipoMoto tipo , String velocidad 
    , String placa , String modelo){

      label_nombre.setText(nombre);
      label_nombre.visibleProperty();
      
  }
    
    
    

}

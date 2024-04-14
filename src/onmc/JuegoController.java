
package onmc;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class JuegoController {
    
    private tablajuego pantano1;
    
    @FXML
    private Button config, salir;
    
    @FXML
    private ProgressBar vida1;
    private ProgressBar vida2;
   
    @FXML
    public void initialize(){
        pantano1=new tablajuego();
        pantano1.pantanoPersonas();
        pantano1.pantanoCazadores();
    }

   @FXML
    public void btnConfig(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Escenas/Inicio.fxml"));
            Stage stage = (Stage) config.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.setFullScreen(true);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    
    @FXML
    public void btnSalir(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Escenas/Perfil.fxml"));
            Stage stage = (Stage) salir.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.setFullScreen(true);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    
    public double barraVida(ProgressBar barra, int x, int y){
        if(pantano1.comprobarCasilla(x,y) == 2){
            pantano1.restaurarCasilla(x,y);
            pantano1.pantanoCazadores();
            return barra.getProgress()-0.33333333333;
        }
        return barra.getProgress();
    }
   
    public void b00(ActionEvent event){
        int x=0,y=0;
   
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b01(ActionEvent event){
        int x=0,y=1;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b02(ActionEvent event){
        int x=0,y=2;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b03(ActionEvent event){
        int x=0,y=3;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b04(ActionEvent event){
        int x=0,y=4;
       
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b10(ActionEvent event){
        int x=1,y=0;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b11(ActionEvent event){
        int x=1,y=1;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b12(ActionEvent event){
        int x=1,y=2;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b13(ActionEvent event){
        int x=1,y=3;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
    }
    public void b14(ActionEvent event){
        int x=1,y=4;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b20(ActionEvent event){
        int x=2,y=0;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b21(ActionEvent event){
        int x=2,y=1;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b22(ActionEvent event){
        int x=2,y=2;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b23(ActionEvent event){
        int x=2,y=3;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b24(ActionEvent event){
        int x=2,y=4;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b30(ActionEvent event){
        int x=3,y=0;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b31(ActionEvent event){
        int x=3,y=1;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b32(ActionEvent event){
        int x=3,y=2;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b33(ActionEvent event){
        int x=3,y=3;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b34(ActionEvent event){
        int x=3,y=4;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b40(ActionEvent event){
        int x=4,y=0;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b41(ActionEvent event){
        int x=4,y=1;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b42(ActionEvent event){
        int x=4,y=2;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b43(ActionEvent event){
        int x=4,y=3;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
    public void b44(ActionEvent event){
        int x=4,y=4;
        
        System.out.println(pantano1.comprobarCasilla(x, y));
        vida1.setProgress(barraVida(vida1,x,y));
    }
}

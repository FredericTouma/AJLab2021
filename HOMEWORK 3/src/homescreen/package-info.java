package homescreen;
package homework2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Signupandlogin extends Application {
      @Override
    public void start(Stage primaryStage) {
       // Label l1=new Label("");//add picture Later 
      //  Image i=new Image("");
       // Image i1=new Image("");
       // ImageView is=new ImageView(i);
       // ImageView im=new ImageView(i1);
        Button l = new Button("Login");
        Button s=new Button("Sign Up");
        l.setPrefWidth(227);
        s.setPrefWidth(227);
        VBox v=new VBox();
        v.setAlignment(Pos.CENTER);
        v.setSpacing(20);
        v.getChildren().addAll(l,s);
       
        Scene scene = new Scene(v, 500, 400);
        primaryStage.setTitle("Main");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        l.setOnAction(e ->{
        LoginForm log= new LoginForm();
        primaryStage.close();
        log.start(primaryStage);    
        });
        
        s.setOnAction(e ->{
        Signup log1= new Signup();
        primaryStage.close();
        log1.start(primaryStage);    
        });
        
        
        
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
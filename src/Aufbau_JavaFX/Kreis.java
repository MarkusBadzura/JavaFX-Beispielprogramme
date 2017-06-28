package Aufbau_JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 * Beispielprogramm Kreis
 * @author Markus Badzura
 */
public class Kreis extends Application
{
  @Override
  public void start(Stage stage) 
  {
        Circle circ = new Circle(60, 60, 40);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 300, 150);
        stage.setTitle("Ein runder Kreis xD");
        stage.setScene(scene);
        stage.show();
    }
}

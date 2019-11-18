package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

  // Views
  @FXML Label label;
  @FXML TextField field;

  private Main main;

  public void setMain(Main main){
    this.main = main;
  }

  public void handleButton(){
    String text = field.getText();
    label.setText(text);
    field.clear();
  }
}

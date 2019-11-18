package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;

public class MainWindowController {

  // Views
  @FXML Label label;
  @FXML TextField field;

  private Person person;

  private Main main;

  public void setMain(Main main){
    this.main = main;
    person = new Person("Charly","Brown","25");
  }

  public void handleButton(){
    String text = field.getText();
    person.setFirstName("Peter");
    label.setText(person.getFirstName());
    field.clear();
  }
}

package unnc.cs.grape.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PreferenceController {

	 private Stage dialogStage;
	 public static Color color=Color.valueOf("#ADD8E6");

	 @FXML
	 private JFXColorPicker colorPicker;

	  /**
	   * Initializes the controller class. This method is automatically called
	   ** after the fxml file has been loaded.
	   */
	  @FXML
	  private void initialize() {
	  }

	  /**
	   * Sets the stage of this dialog.
	   **
	   * @param dialogStage
	   */
	  public void setDialogStage(Stage dialogStage) {
	      this.dialogStage = dialogStage;
	  }

	    @FXML
	    private void handleApply() {
	    	color=colorPicker.getValue();
	    	System.out.println(colorPicker.getValue());
	        dialogStage.close();
	    }
}

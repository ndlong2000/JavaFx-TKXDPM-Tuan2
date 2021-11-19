package common.exception;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

public class InvalidTransactionAmountException {
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private Button testBtn;
	
	@FXML
	public void bonk() {
		BackgroundImage myBI= new BackgroundImage(new Image("D:/workspace/eclipse-workspace/Project/CheemsBonk/src/assets/images/after_bonk.PNG"), null, null, null, null);
		anchorPane.setBackground(new Background(myBI));
	} //..\assets\images\book1.jpg
	
	@FXML
	public void unBonk() {
		BackgroundImage myBI= new BackgroundImage(new Image("D:/workspace/eclipse-workspace/Project/CheemsBonk/src/assets/images/before_bonk.PNG"), null, null, null, null);
		anchorPane.setBackground(new Background(myBI));
	}
}

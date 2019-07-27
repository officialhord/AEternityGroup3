package Home;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {


    @FXML
    private TextField usertxt;

    @FXML
    private PasswordField passtxt;

    @FXML
    private Button loginbtn;

    @FXML
    private Label registeralab;

    @FXML
    void loginact(ActionEvent event) throws Exception{

        String username, password;
        username = usertxt.getText();
        password = passtxt.getText();

        boolean test = username.equals("Test") && password.equals("Test");
        if (test) {
            Stage stage = new Stage();
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("/Home/HomePage/HomePage.fxml"));
            Loader.load();
            Parent root;
            root = Loader.getRoot();
            Scene scene = new Scene(root);
            stage.setScene(scene);

            stage.setMaximized(true);
            stage.show();
        }

    }

    void outputs() {

        System.out.println("Test Succesful");
    }

    @FXML
    void regact(MouseEvent event) {

    }

}

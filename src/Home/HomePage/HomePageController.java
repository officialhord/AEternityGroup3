package Home.HomePage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private ImageView newpost;

    @FXML
    private ImageView homepage;

    @FXML
    private ImageView notifications;

    @FXML
    private ImageView messages;

    @FXML
    private ImageView wallet;

    @FXML
    void gohomepage(MouseEvent event) {

    }

    @FXML
    void gonewpost(MouseEvent event) throws Exception {

        if (event.getClickCount() == 1) {
            Stage stage = new Stage();
            ((Node)(event.getSource())).getScene().getWindow().hide();

            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("/Home/HomePage/newPost.fxml"));
            Loader.load();
            Parent root;
            root = Loader.getRoot();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        }

    }

    @FXML
    void gomessages(MouseEvent event) {

    }

    @FXML
    void gonotification(MouseEvent event) {

    }


    @FXML
    private ImageView comment;

    @FXML
    void gocomment(MouseEvent event) throws Exception{

        if (event.getClickCount() == 1) {
            Stage stage = new Stage();
            ((Node)(event.getSource())).getScene().getWindow().hide();

            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("/Home/HomePage/comment.fxml"));
            Loader.load();
            Parent root;
            root = Loader.getRoot();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        }

    }
    @FXML
    void gowallet(MouseEvent event) throws Exception {

        if (event.getClickCount() == 1) {
            Stage stage = new Stage();
            ((Node)(event.getSource())).getScene().getWindow().hide();

            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("/Home/Wallet/WalletView.fxml"));
            Loader.load();
            Parent root;
            root = Loader.getRoot();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        }
    }
}

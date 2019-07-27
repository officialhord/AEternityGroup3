package Home.Wallet;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class WalletViewController {

    @FXML
    private ImageView home;

    @FXML
    void gohome(MouseEvent event) throws Exception {
        if (event.getClickCount() == 1) {
            Stage stage = new Stage();
            ((Node)(event.getSource())).getScene().getWindow().hide();

            FXMLLoader Loader = new FXMLLoader();
            Loader.setLocation(getClass().getResource("/Home/HomePage/HomePage.fxml"));
            Loader.load();
            Parent root;
            root = Loader.getRoot();
            //newWallet controller = Loader.getController();
            //controller.getUser(owner);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.show();
        }
    }
}

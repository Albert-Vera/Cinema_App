import LlegirXML.CiclesLlegir;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Cicle;
import model.Item;
import model.ItemCicle;

import java.util.ArrayList;
import java.util.List;

public class CiclesController{//} extends Application {
//
//
//    @FXML
//    TableView<ItemCicle> tabCicles = new TableView<>();
//    private ObservableList<ItemCicle> dataCicles = FXCollections.observableArrayList();
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//
//    }
//    void setTabCicles(List<Cicle> llistaCicles){
//
//        System.out.println("llista ante de entrar: " + llistaCicles.size());
//        if (llistaCicles.size() == 0) {
//            CiclesLlegir ciclesLlegir = new CiclesLlegir();
//            llistaCicles = ciclesLlegir.llegirXmlCicles(llistaCicles);
//            System.out.println("llista de cicles habidos : " + llistaCicles.get(0).getCicleNom());
//            TableColumn cicleId = new TableColumn("cicleId");
//            TableColumn cicleNom = new TableColumn("cicleNom");
//            TableColumn cicleInfo = new TableColumn("cicleInfo");
//
//            cicleId.setCellValueFactory(new PropertyValueFactory<Item, String>("cicleId"));
//            cicleNom.setCellValueFactory(new PropertyValueFactory<Item, String>("cicleNom"));
//            cicleInfo.setCellValueFactory(new PropertyValueFactory<Item, String>("cicleInfo"));
//
//            tabCicles.getColumns().addAll(cicleId, cicleNom, cicleInfo);
//            tabCicles.setItems(dataCicles);
//
//            for (Cicle cicle : llistaCicles) {
//                dataCicles.add(new ItemCicle(cicle.getClicleId(), cicle.getCicleNom(), cicle.getCicleInfo()));
//
//            }
//        }
//    }
}

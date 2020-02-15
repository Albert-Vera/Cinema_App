import LlegirXML.SalasCinema;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Item;
import model.ItemSales;
import model.Sales;

import java.util.ArrayList;
import java.util.List;

public class CinemasFragmentController{ //extends Application {
//    @FXML PieChart quesitoCinemas;
//    @FXML TableView<ItemSales> tabSalas;
//    private ObservableList<ItemSales> dataSales = FXCollections.observableArrayList();
//    private ObservableList<PieChart.Data> quesitoCinesData = FXCollections.observableArrayList();
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//
//    }
//    void setTabSalas( ) {
//        List<Sales> llistaSales = new ArrayList<>();
//        System.out.println("llista cinemas:antes " + llistaSales.size());
//
//        if (llistaSales.size() == 0) {
//            List<Integer> percentatgesSales;
//            System.out.println("llista cinemas: " + llistaSales.size());
//            SalasCinema salasCinema = new SalasCinema();
//            llistaSales = salasCinema.llegirXmlSalesCinema(llistaSales);
//            PercentatgesPieChar percentatgesPieChar = new PercentatgesPieChar();
//            percentatgesSales = percentatgesPieChar.percentatgeProvincias(llistaSales);
//            quesitoCinesData.add(new PieChart.Data("Barcelona", percentatgesSales.get(0).intValue()));
//            quesitoCinesData.add(new PieChart.Data("Girona", percentatgesSales.get(1).intValue()));
//            quesitoCinesData.add(new PieChart.Data("Tarragona", percentatgesSales.get(2).intValue()));
//            quesitoCinesData.add(new PieChart.Data("Lleida", percentatgesSales.get(3).intValue()));
//            quesitoCinesData.add(new PieChart.Data("Illes Balears", percentatgesSales.get(4).intValue()));
//
//            quesitoCinemas.setData(quesitoCinesData);
//            quesitoCinemas.setTitle("Sales de cine per provincia");
//
//            TableColumn id = new TableColumn("id");
//            TableColumn nom = new TableColumn("nom");
//            TableColumn adreca = new TableColumn("adreca");
//            TableColumn localitat = new TableColumn("localitat");
//            TableColumn comarca = new TableColumn("comarca");
//            TableColumn provincia = new TableColumn("provincia");
//
//            id.setCellValueFactory(new PropertyValueFactory<Item, String>("id"));
//            nom.setCellValueFactory(new PropertyValueFactory<Item, String>("nom"));
//            adreca.setCellValueFactory(new PropertyValueFactory<Item, String>("adreca"));
//            localitat.setCellValueFactory(new PropertyValueFactory<Item, String>("localitat"));
//            comarca.setCellValueFactory(new PropertyValueFactory<Item, String>("comarca"));
//            provincia.setCellValueFactory(new PropertyValueFactory<Item, String>("provincia"));
//            tabSalas.getColumns().addAll(id, nom, adreca, localitat, comarca, provincia);
//            tabSalas.setItems(dataSales);
//
//            for (Sales sales : llistaSales) {
//                dataSales.add(new ItemSales(sales.getId(), sales.getNom(), sales.getAdreca(), sales.getLocalitat(), sales.getComarca(), sales.getProvincia()));
//            }
//        }
//    }
}

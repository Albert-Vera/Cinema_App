import LlegirXML.Pelicules;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Item;
import model.Pelis;

import java.util.List;

public class PeliculesController{//} extends Application {

//    @FXML private ImageView imagePeli;
//    @FXML private Label sinopsisPeli;
//
//    @FXML TableView<Item> tabPeliculas;
//    private ObservableList<Item> dataPeliculas = FXCollections.observableArrayList();
//
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//
//    }
//    void setTabPeliculas(List<Pelis> llistaPelis) {
//        Pelicules pelicules = new Pelicules();
//        llistaPelis = pelicules.llegirXmlPelis(llistaPelis);
//
//        TableColumn name = new TableColumn("name");
//        TableColumn any = new TableColumn("any");
//        TableColumn original = new TableColumn("original");
//        TableColumn direccio = new TableColumn("direccio");
//        TableColumn versio = new TableColumn("versio");
//        TableColumn idioma = new TableColumn("idioma");
//        TableColumn dataEstrena = new TableColumn("dataEstrena");
//        TableColumn interpret = new TableColumn("interpret");
//
//        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
//        any.setCellValueFactory(new PropertyValueFactory<Item, String>("any"));
//        original.setCellValueFactory(new PropertyValueFactory<Item, String>("original"));
//        direccio.setCellValueFactory(new PropertyValueFactory<Item, String>("direccio"));
//        versio.setCellValueFactory(new PropertyValueFactory<Item, String>("versio"));
//        idioma.setCellValueFactory(new PropertyValueFactory<Item, String>("idioma"));
//        dataEstrena.setCellValueFactory(new PropertyValueFactory<Item, String>("dataEstrena"));
//        interpret.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("interpret"));
//        tabPeliculas.getColumns().addAll(name, any, original, direccio, versio, idioma, dataEstrena, interpret );
//        tabPeliculas.setItems(dataPeliculas);
//
//        for (Pelis pelis : llistaPelis) {
//            dataPeliculas.add(new Item(pelis.getTitol(), pelis.getAny(), pelis.getOriginal(),pelis.getDireccio(), pelis.getVersio(), pelis.getIdioma(), pelis.getDataEstrena(), pelis.getCartell(),pelis.getSinopsi(), pelis.getInterprets()));
//
//        }
//    }
//    void mostrarPeli(){
//        String urlImage = "http://www.gencat.cat/llengua/cinema/" + tabPeliculas.getSelectionModel().getSelectedItem().getCartell();
//        Image image = new Image (urlImage);
//        String text = tabPeliculas.getSelectionModel().getSelectedItem().getSinopsi();
//        String textTitol = tabPeliculas.getSelectionModel().getSelectedItem().getName();
//
//        imagePeli.setImage(image);
//        sinopsisPeli.setText("Titol:  "+  textTitol + "\n\nSinopsi:\n\n" + text );
//        sinopsisPeli.setWrapText(true);
//    }
//    public void mouseClickPeli(MouseEvent event){
////        if (event.getClickCount() == 1) {//Checking one click
////
////            new Home().clickItem();
////        }
//    }
}

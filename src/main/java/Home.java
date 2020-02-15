import LlegirXML.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import model.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Home  {

    @FXML private ImageView flecha1;
    @FXML private ImageView flecha2;
    @FXML private ImageView flecha3;
    @FXML private ImageView flecha4;
    @FXML private ImageView flecha5;
    @FXML private AnchorPane anchopaneHome;
    @FXML private AnchorPane anchopaneCinemas;
    @FXML private AnchorPane anchopanePeliculas;
    @FXML private AnchorPane anchopaneSessions;
    @FXML private AnchorPane anchopaneCicles;
    @FXML private AnchorPane masInfoPeli;
    @FXML private ImageView imagePeli;
    @FXML private Label sinopsisPeli;
    @FXML private ImageView image0, image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13;
    public List<Pelis> llistaPelis = new ArrayList<>();
    public List<Sales> llistaSales = new ArrayList<>();
    public List<Sessions> llistaSessions = new ArrayList<>();
    public List<Cicle> llistaCicles = new ArrayList<>();
    List<Integer> percentatgesSales = new ArrayList<>();
    String[] cartell = new String[14];



    @FXML TableView<Item> tabPeliculas;
    @FXML TableView<ItemSales> tabSalas;
    @FXML TableView <ItemSessions> tabSessions;
    @FXML TableView <ItemCicle> tabCicles;
    @FXML PieChart quesitoCinemas;

    private ObservableList<ItemSales> dataSales = FXCollections.observableArrayList();
    private ObservableList<Item> dataPeliculas = FXCollections.observableArrayList();
    private ObservableList<ItemSessions> dataSessions = FXCollections.observableArrayList();
    private ObservableList<PieChart.Data> quesitoCinesData = FXCollections.observableArrayList();
    private ObservableList<ItemCicle> dataCicles = FXCollections.observableArrayList();

    @FXML
    public void clickItem(MouseEvent event) {

        if (event.getClickCount() == 1) {//Checking one click
            anchopanePeliculas.setVisible(false);
            masInfoPeli.setVisible(true);
            String urlImage = "http://www.gencat.cat/llengua/cinema/" + tabPeliculas.getSelectionModel().getSelectedItem().getCartell();
            Image image = new Image (urlImage);
            String text = tabPeliculas.getSelectionModel().getSelectedItem().getSinopsi();
            String textTitol = tabPeliculas.getSelectionModel().getSelectedItem().getName();

            imagePeli.setImage(image);
            sinopsisPeli.setText("Titol:  "+  textTitol + "\n\nSinopsi:\n\n" + text );
            sinopsisPeli.setWrapText(true);
        }
    }
    public void onClickHome (MouseEvent mouseEvent){
        anchopaneHome.setVisible(true);
        flecha1.setVisible(true);
        anchopaneCinemas.setVisible(false);
        flecha2.setVisible(false);
        anchopanePeliculas.setVisible(false);
        flecha3.setVisible(false);
        anchopaneSessions.setVisible(false);
        flecha4.setVisible(false);
        anchopaneCicles.setVisible(false);
        flecha5.setVisible(false);
        masInfoPeli.setVisible(false);
        setHome();
    }

    public void onClickSalesCinema(MouseEvent mouseEvent) throws IOException {
        anchopaneHome.setVisible(false);
        flecha1.setVisible(false);
        anchopaneCinemas.setVisible(true);
        flecha2.setVisible(true);
        anchopanePeliculas.setVisible(false);
        flecha3.setVisible(false);
        anchopaneSessions.setVisible(false);
        flecha4.setVisible(false);
        anchopaneCicles.setVisible(false);
        flecha5.setVisible(false);
        masInfoPeli.setVisible(false);

        if (llistaSales.size() == 0) {
            System.out.println("kukksklk");
            setTabSalas();
        }
    }
    public void onClickPeliculas (MouseEvent mouseEvent) throws IOException, SAXException, ParserConfigurationException {

        anchopaneHome.setVisible(false);
        flecha1.setVisible(false);
        anchopaneCinemas.setVisible(false);
        flecha2.setVisible(false);
        anchopanePeliculas.setVisible(true);
        flecha3.setVisible(true);
        anchopaneSessions.setVisible(false);
        flecha4.setVisible(false);
        anchopaneCicles.setVisible(false);
        flecha5.setVisible(false);
        masInfoPeli.setVisible(false);
        System.out.println("llista: " +llistaPelis.size());
        if (llistaPelis.size() == 0) {

            setTabPeliculas();
        }
    }
    public void onClickSessions (MouseEvent mouseEvent){
        anchopaneHome.setVisible(false);
        flecha1.setVisible(false);
        anchopaneCinemas.setVisible(false);
        flecha2.setVisible(false);
        anchopanePeliculas.setVisible(false);
        flecha3.setVisible(false);
        anchopaneSessions.setVisible(true);
        flecha4.setVisible(true);
        anchopaneCicles.setVisible(false);
        flecha5.setVisible(false);
        masInfoPeli.setVisible(false);

        if (llistaSessions.size() == 0) {
            setTabSessions();
        }
    }
    public void onClickCicles (MouseEvent mouseEvent){
        anchopaneHome.setVisible(false);
        flecha1.setVisible(false);
        anchopaneCinemas.setVisible(false);
        flecha2.setVisible(false);
        anchopanePeliculas.setVisible(false);
        flecha3.setVisible(false);
        anchopaneSessions.setVisible(false);
        flecha4.setVisible(false);
        anchopaneCicles.setVisible(true);
        flecha5.setVisible(true);
        masInfoPeli.setVisible(false);

        if (llistaCicles.size() == 0) {
            setTabCicles();
        }
    }

    public void onClickBtnEnrerePeli(){
        masInfoPeli.setVisible(false);
        anchopanePeliculas.setVisible(true);
    }
    void setHome(){
        llistaPelis = new Pelicules().llegirXmlPelis(llistaPelis);
        String urlImage = "http://www.gencat.cat/llengua/cinema/";

        if (cartell[0] == null) {
            System.out.println("Calculo array: " );
            for (int i = 0; i < 14; i++) {
                cartell[i] = urlImage + llistaPelis.get(i).getCartell();
            }
            llistaPelis.clear();
        }
        Image image = new Image(cartell[0]);
        image0.setImage( image);
        image0.setFitHeight(270);

        image = new Image(cartell[1]);
        image1.setImage(image);
        image1.setFitHeight(270);

        image = new Image(cartell[2]);
        image2.setImage(image);
        image2.setFitHeight(270);

        image = new Image(cartell[3]);
        image3.setImage(image);
        image3.setFitHeight(270);

        image = new Image(cartell[4]);
        image4.setImage(image);
        image4.setFitHeight(270);
        image = new Image(cartell[5]);
        image5.setImage(image);
        image5.setFitHeight(270);
        image = new Image(cartell[6]);
        image6.setImage(image);
        image6.setFitHeight(270);
        image = new Image(cartell[7]);
        image7.setImage(image);
        image7.setFitHeight(270);
        image = new Image(cartell[8]);
        image8.setImage(image);
        image8.setFitHeight(270);
        image = new Image(cartell[9]);
        image9.setImage(image);
        image9.setFitHeight(270);
        image = new Image(cartell[10]);
        image10.setImage(image);
        image10.setFitHeight(270);
        image = new Image(cartell[11]);
        image11.setImage(image);
        image11.setFitHeight(270);
        image = new Image(cartell[12]);
        image12.setImage(image);
        image12.setFitHeight(270);
        image = new Image(cartell[13]);
        image13.setImage(image);
        image13.setFitHeight(270);
    }
    void setTabCicles(){
        llistaCicles = new CiclesLlegir().llegirXmlCicles(llistaCicles);
        System.out.println("tamay de llista cicles: " + llistaCicles.get(0).getClicleId());

        TableColumn cicleId = new TableColumn("cicleId");
        TableColumn cicleNom = new TableColumn("cicleNom");
        TableColumn cicleInfo = new TableColumn("cicleInfo");


        cicleId.setCellValueFactory(new PropertyValueFactory<ItemCicle, String>("cicleId"));
        cicleNom.setCellValueFactory(new PropertyValueFactory<ItemCicle, String>("cicleNom"));
        cicleInfo.setCellValueFactory(new PropertyValueFactory<ItemCicle, String>("cicleInfo"));

        tabCicles.getColumns().addAll(cicleId, cicleNom, cicleInfo);
        tabCicles.setItems(dataCicles);

        for (Cicle cicle : llistaCicles) {
            dataCicles.add(new ItemCicle(cicle.getClicleId(), cicle.getCicleNom(), cicle.getCicleInfo()));

        }

    }
    void setTabSalas( ) {
        llistaSales = new SalasCinema().llegirXmlSalesCinema(llistaSales);

        // if (percentatgesSales.size() == 0) {
        PercentatgesPieChar percentatgesPieChar = new PercentatgesPieChar();
        percentatgesSales = percentatgesPieChar.percentatgeProvincias(llistaSales);
        // }
        quesitoCinesData.add(new PieChart.Data("Barcelona", percentatgesSales.get(0).intValue()));
        quesitoCinesData.add(new PieChart.Data("Girona", percentatgesSales.get(1).intValue()));
        quesitoCinesData.add(new PieChart.Data("Tarragona", percentatgesSales.get(2).intValue()));
        quesitoCinesData.add(new PieChart.Data("Lleida", percentatgesSales.get(3).intValue()));
        quesitoCinesData.add(new PieChart.Data("Illes Balears", percentatgesSales.get(4).intValue()));

        quesitoCinemas.setData(quesitoCinesData);
        quesitoCinemas.setTitle("Sales de cine per provincia");

        TableColumn id = new TableColumn("id");
        TableColumn nom = new TableColumn("nom");
        TableColumn adreca = new TableColumn("adreca");
        TableColumn localitat = new TableColumn("localitat");
        TableColumn comarca = new TableColumn("comarca");
        TableColumn provincia = new TableColumn("provincia");

        id.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("id"));
        nom.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("nom"));
        adreca.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("adreca"));
        localitat.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("localitat"));
        comarca.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("comarca"));
        provincia.setCellValueFactory(new PropertyValueFactory<ItemSales, String>("provincia"));
        tabSalas.getColumns().addAll(id, nom, adreca, localitat, comarca, provincia);
        tabSalas.setItems(dataSales);

        for (Sales sales : llistaSales) {
            dataSales.add(new ItemSales(sales.getId(), sales.getNom(), sales.getAdreca(),sales.getLocalitat(), sales.getComarca(), sales.getProvincia()));
        }
    }
    void setTabPeliculas() {
        llistaPelis = new Pelicules().llegirXmlPelis(llistaPelis);
        System.out.println("llista:dentro " +llistaPelis.size());

        TableColumn name = new TableColumn("name");
        TableColumn any = new TableColumn("any");
        TableColumn original = new TableColumn("original");
        TableColumn direccio = new TableColumn("direccio");
        TableColumn versio = new TableColumn("versio");
        TableColumn idioma = new TableColumn("idioma");
        TableColumn dataEstrena = new TableColumn("dataEstrena");
        TableColumn interpret = new TableColumn("interpret");

        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        any.setCellValueFactory(new PropertyValueFactory<Item, String>("any"));
        original.setCellValueFactory(new PropertyValueFactory<Item, String>("original"));
        direccio.setCellValueFactory(new PropertyValueFactory<Item, String>("direccio"));
        versio.setCellValueFactory(new PropertyValueFactory<Item, String>("versio"));
        idioma.setCellValueFactory(new PropertyValueFactory<Item, String>("idioma"));
        dataEstrena.setCellValueFactory(new PropertyValueFactory<Item, String>("dataEstrena"));
        interpret.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("interpret"));
        tabPeliculas.getColumns().addAll(name, any, original, direccio, versio, idioma, dataEstrena, interpret );
        tabPeliculas.setItems(dataPeliculas);

        for (Pelis pelis : llistaPelis) {
            dataPeliculas.add(new Item(pelis.getTitol(), pelis.getAny(), pelis.getOriginal(),pelis.getDireccio(), pelis.getVersio(), pelis.getIdioma(), pelis.getDataEstrena(), pelis.getCartell(),pelis.getSinopsi(), pelis.getInterprets()));

        }
    }
    void setTabSessions() {
        List<Sessions> llistaSessions = new ArrayList<>();
        llistaSessions = new Lsessions().llegirXmlSessions(llistaSessions);

        TableColumn idFilm = new TableColumn("idFilm");
        TableColumn ses_id = new TableColumn("ses_id");
        TableColumn cineId = new TableColumn("Cine iD");
        TableColumn titol = new TableColumn("Titol");
        TableColumn ses_data = new TableColumn("Sessio Data");
        TableColumn cineNom = new TableColumn("Nom Cinema");
        TableColumn localitat = new TableColumn("Localitat");
        TableColumn comarca = new TableColumn("Comarca");
        TableColumn cicleId = new TableColumn("Cicle Id");
        TableColumn ver = new TableColumn("ver");
        TableColumn preu = new TableColumn("preu");
        TableColumn orderSessio = new TableColumn("Ordre Sessio");

        idFilm.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("idFilm"));
        ses_id.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("ses_id"));
        cineId.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("cineId"));
        titol.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("titol"));
        ses_data.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("ses_data"));
        cineNom.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("cineNom"));
        localitat.setCellValueFactory(new PropertyValueFactory<ItemSessions, String>("localitat"));
        comarca.setCellValueFactory(new PropertyValueFactory<ItemSessions, List<String>>("comarca"));
        cicleId.setCellValueFactory(new PropertyValueFactory<ItemSessions, List<String>>("cicleId"));
        ver.setCellValueFactory(new PropertyValueFactory<ItemSessions, List<String>>("ver"));
        preu.setCellValueFactory(new PropertyValueFactory<ItemSessions, List<String>>("preu"));
        orderSessio.setCellValueFactory(new PropertyValueFactory<ItemSessions, List<String>>("orderSessio"));

        tabSessions.getColumns().addAll(idFilm, ses_id, cineId, titol, ses_data, cineNom, localitat, comarca, cicleId, ver, preu, orderSessio);
        tabSessions.setItems(dataSessions);

        for (Sessions sessio : llistaSessions) {
            dataSessions.add(new ItemSessions(sessio.getIdFilm(), sessio.getSes_id(), sessio.getCineId(),sessio.getTitol(),
                    sessio.getSes_data(), sessio.getCineNom(), sessio.getLocalitat(), sessio.getComarca(),
                    sessio.getCicleId(), sessio.getVer(), sessio.getPreu(), sessio.getOrderSessio()));

        }
    }
}
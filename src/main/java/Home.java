import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Home {

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
    private float percentatgeA, percentatgeB, percentatgeC, getPercentatgeD;
    public List<Pelis> llistaPelis = new ArrayList<>();
    public List<Sales> llistaSales = new ArrayList<>();
    public List<Sessions> llistaSessions = new ArrayList<>();


    @FXML TableView<Item> tabPeliculas;
    @FXML TableView<ItemSales> tabSalas;
    @FXML TableView <ItemSessions> tabSessions;
    @FXML PieChart quesitoCinemas;
    @FXML PieChart quesitoPelicules;

    private ObservableList<ItemSales> dataSales = FXCollections.observableArrayList();
    private ObservableList<Item> dataPeliculas = FXCollections.observableArrayList();
    private ObservableList<ItemSessions> dataSessions = FXCollections.observableArrayList();
    private ObservableList<PieChart.Data> quesitoCinesData = FXCollections.observableArrayList();



    private ObservableList<PieChart.Data> quesitoPelisData = FXCollections.observableArrayList();

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

            if (llistaSales.size() == 0) {
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
        }
    void setTabSalas( ) {
        List<Sales> llistaSales = llegirXmlSalesCinema();

        PercentatgesPieChar percentatgesPieChar = new PercentatgesPieChar();
        List<Long> percentatges =  percentatgesPieChar.percentatgeProvincias(llistaSales);
        quesitoCinesData.add(new PieChart.Data("Barcelona", percentatges.get(0).intValue()));
        quesitoCinesData.add(new PieChart.Data("Girona", percentatges.get(1).intValue()));
        quesitoCinesData.add(new PieChart.Data("Tarragona", percentatges.get(2).intValue()));
        quesitoCinesData.add(new PieChart.Data("Lleida", percentatges.get(3).intValue()));
        quesitoCinesData.add(new PieChart.Data("Illes Balears", percentatges.get(4).intValue()));
        quesitoCinemas.setData(quesitoCinesData);
        quesitoCinemas.setTitle("Sales de cine per provincia");

        TableColumn id = new TableColumn("id");
        TableColumn nom = new TableColumn("nom");
        TableColumn adreca = new TableColumn("adreca");
        TableColumn localitat = new TableColumn("localitat");
        TableColumn comarca = new TableColumn("comarca");
        TableColumn provincia = new TableColumn("provincia");

        id.setCellValueFactory(new PropertyValueFactory<Item, String>("id"));
        nom.setCellValueFactory(new PropertyValueFactory<Item, String>("nom"));
        adreca.setCellValueFactory(new PropertyValueFactory<Item, String>("adreca"));
        localitat.setCellValueFactory(new PropertyValueFactory<Item, String>("localitat"));
        comarca.setCellValueFactory(new PropertyValueFactory<Item, String>("comarca"));
        provincia.setCellValueFactory(new PropertyValueFactory<Item, String>("provincia"));
        tabSalas.getColumns().addAll(id, nom, adreca, localitat, comarca, provincia);
        tabSalas.setItems(dataSales);

        for (Sales sales : llistaSales) {
            dataSales.add(new ItemSales(sales.getId(), sales.getNom(), sales.getAdreca(),sales.getLocalitat(), sales.getComarca(), sales.getProvincia()));
        }
    }
    void setTabPeliculas() {

        List<Pelis> llistaPelis = llegirXmlPelis();

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
        tabPeliculas.getColumns().addAll(name, any, original, direccio, versio, idioma, dataEstrena, interpret);
        tabPeliculas.setItems(dataPeliculas);

        for (Pelis pelis : llistaPelis) {
            dataPeliculas.add(new Item(pelis.getTitol(), pelis.getAny(), pelis.getOriginal(),pelis.getDireccio(), pelis.getVersio(), pelis.getIdioma(), pelis.getDataEstrena(), pelis.getInterprets()));

        }
    }
    void setTabSessions() {

        List<Sessions> llistaSessions = llegirXmlSessions();

        TableColumn idFilm = new TableColumn("idFilm");
        TableColumn ses_id = new TableColumn("ses_id");
        TableColumn cineId = new TableColumn("Cine iD");
        TableColumn titol = new TableColumn("Titol");
        TableColumn ses_data = new TableColumn("Sessio Data");
        TableColumn cineNom = new TableColumn("Nom Cinema");
        TableColumn localitat = new TableColumn("Localitat");
        TableColumn comarca = new TableColumn("Comarca");
        TableColumn cicleId = new TableColumn("Cicle Id");
        TableColumn ver = new TableColumn("Versio");
        TableColumn preu = new TableColumn("Preu");
        TableColumn orderSessio = new TableColumn("Ordre Sessio");

        idFilm.setCellValueFactory(new PropertyValueFactory<Item, String>("idFilm"));
        ses_id.setCellValueFactory(new PropertyValueFactory<Item, String>("ses_id"));
        cineId.setCellValueFactory(new PropertyValueFactory<Item, String>("cineId"));
        titol.setCellValueFactory(new PropertyValueFactory<Item, String>("titol"));
        ses_data.setCellValueFactory(new PropertyValueFactory<Item, String>("ses_data"));
        cineNom.setCellValueFactory(new PropertyValueFactory<Item, String>("cineNom"));
        localitat.setCellValueFactory(new PropertyValueFactory<Item, String>("localitat"));
        comarca.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("comarca"));
        cicleId.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("cicleId"));
        ver.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("ver"));
        preu.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("preu"));
        orderSessio.setCellValueFactory(new PropertyValueFactory<Item, List<String>>("orderSessio"));

        tabSessions.getColumns().addAll(idFilm, ses_id, cineId, titol, ses_data, cineNom, localitat, comarca, cicleId, ver, preu, orderSessio);
        tabSessions.setItems(dataSessions);

        for (Sessions sessio : llistaSessions) {
            dataSessions.add(new ItemSessions(sessio.getIdFilm(), sessio.getSes_id(), sessio.getCineId(),sessio.getTitol(),
                    sessio.getSes_data(), sessio.getCineNom(), sessio.getLocalitat(), sessio.getComarca(),
                    sessio.getCicleId(), sessio.getVer(), sessio.getPreu(), sessio.getOrderSessio()));

        }
    }
    List<Pelis> llegirXmlPelis(){
        try {
            llistaPelis = new Pelicules().llegirPelicules();
        }catch (IOException e){

            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return llistaPelis;
    }
    List<Sales> llegirXmlSalesCinema(){
        try {
            llistaSales = new SalasCinema().llegirSalas();
        }catch (IOException e){
            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return llistaSales;
    }
    List<Sessions> llegirXmlSessions(){
        try {
            llistaSessions = new Lsessions().llegirSessions();
        }catch (IOException e){
            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return llistaSessions;
    }
    }

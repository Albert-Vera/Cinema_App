package LlegirXML;

import model.Sales;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class SalasCinema {

    public List<Sales> llegirXmlSalesCinema(List<Sales> llistaSales){
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
    List<Sales> llegirSalas() throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL("http://gencat.cat/llengua/cinema/cinemes.xml");
        List<Sales> sales;

        LlegirSalasCinema llegirSalasCinema = new LlegirSalasCinema();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader myReader =  saxParser.getXMLReader();
        myReader.setContentHandler(llegirSalasCinema);
        myReader.parse(new InputSource(url.openStream()));
        sales = llegirSalasCinema.getListSalas();

        return sales;
    }



}

package LlegirXML;

import model.Pelis;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Pelicules {

    public List<Pelis> llegirXmlPelis(List<Pelis> llistaPelis){
        try {
            llistaPelis = new Pelicules().llegirPelicules();
        }catch (IOException e){

            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            System.out.println("Error1 a llegir Pelis XML");

            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            System.out.println("Error a llegir Pelis XML");
            e.printStackTrace();
        }
        return llistaPelis;
    }
    List<Pelis> llegirPelicules() throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL("http://gencat.cat/llengua/cinema/provacin.xml");
        List<Pelis> pelis;

        LlegirXmlPeliculas llegirXmlPeliculas = new LlegirXmlPeliculas();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader myReader =  saxParser.getXMLReader();
        myReader.setContentHandler(llegirXmlPeliculas);
        myReader.parse(new InputSource(url.openStream()));
        pelis = llegirXmlPeliculas.getListPelis();

      return pelis;
    }
}

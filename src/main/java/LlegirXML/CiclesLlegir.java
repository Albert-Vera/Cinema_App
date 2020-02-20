package LlegirXML;

import model.Cicle;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class CiclesLlegir {
    public List<Cicle> llegirXmlCicles(List<Cicle> llistaCicles){
        try {
            llistaCicles = new CiclesLlegir().llegirCicles();
        }catch (IOException e){
            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            System.out.println("Error1 a llegir CICLES XML");

            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            System.out.println("Error2 a llegir CICLES XML");

            e.printStackTrace();
        }

        return llistaCicles;
    }
    List<Cicle> llegirCicles() throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL("http://gencat.cat/llengua/cinema/cicles.xml");
        List<Cicle> cicle;

        LlegirXmlCicles llegirXmlCicles = new LlegirXmlCicles();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader myReader =  saxParser.getXMLReader();
        myReader.setContentHandler(llegirXmlCicles);
        myReader.parse(new InputSource(url.openStream()));
        cicle = llegirXmlCicles.getListCicle();
        return cicle;
    }
}

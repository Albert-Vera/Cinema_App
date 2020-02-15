package LlegirXML;

import LlegirXML.LlegirXmlSessions;
import model.Sessions;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Lsessions {

    public List<Sessions> llegirXmlSessions(List<Sessions> llistaSessions){
        try {
            llistaSessions = new Lsessions().llegirSessions();
        }catch (IOException e){
            System.out.println("Ha habido un problema al leer datos");
        } catch (SAXException e) {
            System.out.println("Error1 a llegir SESSIONS XML");

            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            System.out.println("Error2 a llegir SESSIONS XML");

            e.printStackTrace();
        }
        return llistaSessions;
    }

    public List<Sessions> llegirSessions() throws ParserConfigurationException, SAXException, IOException {
        URL url = new URL("http://www.gencat.cat/llengua/cinema/film_sessions.xml");
        List<Sessions> sessio;
        LlegirXmlSessions llegirXmlSessions = new LlegirXmlSessions();

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader myReader =  saxParser.getXMLReader();
        myReader.setContentHandler(llegirXmlSessions);
        myReader.parse(new InputSource(url.openStream()));
        sessio = llegirXmlSessions.getListSessions();

        return sessio;
    }
}

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

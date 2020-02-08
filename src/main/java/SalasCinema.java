
import model.Pelis;
import model.Sales;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalasCinema {
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

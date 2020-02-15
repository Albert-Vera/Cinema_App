package LlegirXML;

import model.Pelis;
import model.Sales;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class LlegirSalasCinema extends DefaultHandler {
    private boolean id;
    private boolean nom;
    private boolean adreca;
    private boolean localitat;
    private boolean comarca;
    private boolean provincia;
    //  private boolean interpret;

    private Sales actualSala = new Sales();
    private List<Sales> salasList = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        super.startElement(uri, localName, qName, attributes);
        if (qName.equalsIgnoreCase("Cineid")) {
            id = true;
        }else
        if (qName.equalsIgnoreCase("cinenom")) {
            nom = true;
        }else
        if (qName.equalsIgnoreCase("cineadreca")) {
            adreca = true;
        }else
        if (qName.equalsIgnoreCase("localitat")) {
            localitat = true;
        }else
        if (qName.equalsIgnoreCase("comarca")) {
            comarca = true;
        }else
        if (qName.equalsIgnoreCase("provincia")) {
            provincia = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (id) {
            actualSala.setId(new String(ch, start, length));
            id = false;
        }
        if (nom) {
            actualSala.setNom(new String(ch, start, length));
            nom = false;
        }
        if (adreca) {
            actualSala.setAdreca(new String(ch, start, length));
            adreca = false;
        }
        if (localitat) {
            actualSala.setLocalitat(new String(ch, start, length));
            localitat = false;
        }
        if (comarca) {
            actualSala.setComarca(new String(ch, start, length));
            comarca = false;
        }
        if (provincia) {
            actualSala.setProvincia(new String(ch, start, length));
            provincia = false;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("CINEMES")) {
            salasList.add(actualSala);
            actualSala = new Sales();
        }
    }

    public List<Sales> getListSalas() {
        return salasList;
    }
}


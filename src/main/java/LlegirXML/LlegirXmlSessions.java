package LlegirXML;

import model.Sessions;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class LlegirXmlSessions extends DefaultHandler {
    private boolean idFilm;
    private boolean ses_id;
    private boolean cineId;
    private boolean titol;
    private boolean ses_data;
    private boolean cineNom;
    private boolean localitat;
    private boolean comarca;
    private boolean cicleId;
    private boolean ver;
    private boolean preu;
    private boolean orderSessio;

    private Sessions actualSessio = new Sessions();
    private List<Sessions> sessioList = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        super.startElement(uri, localName, qName, attributes);
        if (qName.equalsIgnoreCase("IDFILM")) {
            idFilm = true;
        }else
        if (qName.equalsIgnoreCase("ses_id")) {
            ses_id = true;
        }else
        if (qName.equalsIgnoreCase("CINEID")) {
            cineId = true;
        }else
        if (qName.equalsIgnoreCase("TITOL")) {
            titol = true;
        }else
        if (qName.equalsIgnoreCase("ses_data")) {
            ses_data = true;
        }else
        if (qName.equalsIgnoreCase("CINENOM")) {
            cineNom = true;
        }else
        if (qName.equalsIgnoreCase("LOCALITAT")) {
            localitat = true;
        }else
        if (qName.equalsIgnoreCase("COMARCA")) {
            comarca = true;
        }else
        if (qName.equalsIgnoreCase("CICLEID")) {
            cicleId = true;
        }else
        if (qName.equalsIgnoreCase("ver")) {
            ver = true;
        }else
        if (qName.equalsIgnoreCase("preu")) {
            preu = true;
        }else
        if (qName.equalsIgnoreCase("ORDRESESSIO")) {
            orderSessio = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (idFilm) {
            actualSessio.setIdFilm(new String(ch, start, length));
            idFilm = false;
        }
        if (ses_id) {
            actualSessio.setSes_id(new String(ch, start, length));
            ses_id = false;
        }
        if (cineId) {
            actualSessio.setCineId(new String(ch, start, length));
            cineId = false;
        }
        if (titol) {
            actualSessio.setTitol(new String(ch, start, length));
            titol = false;
        }
        if (ses_data) {
            actualSessio.setSes_data(new String(ch, start, length));
            ses_data = false;
        }
        if (cineNom) {
            actualSessio.setCineNom(new String(ch, start, length));
            cineNom = false;
        }
        if (localitat) {
            actualSessio.setLocalitat(new String(ch, start, length));
            localitat = false;
        }
        if (comarca) {
            actualSessio.setComarca(new String(ch, start, length));
            comarca = false;
        }
        if (cicleId) {
            actualSessio.setCicleId(new String(ch, start, length));
            cicleId = false;
        }
        if (ver) {
            actualSessio.setVer(new String(ch, start, length));
            ver = false;
        }
        if (preu) {
            actualSessio.setVer(new String(ch, start, length));
            preu = false;
        }
        if (orderSessio) {
            actualSessio.setOrderSessio(new String(ch, start, length));
            orderSessio = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("SESSIONS")) {
            sessioList.add(actualSessio);
            actualSessio = new Sessions();
        }
    }

    public List<Sessions> getListSessions() {
        return sessioList;
    }
}


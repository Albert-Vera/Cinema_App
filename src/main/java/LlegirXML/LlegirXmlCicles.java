package LlegirXML;

import model.Cicle;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

    public class LlegirXmlCicles extends DefaultHandler {
        private boolean cicleId;
        private boolean cicleNom;
        private boolean cicleInfo;


        private Cicle actualCicle = new Cicle();
        private List<Cicle> cicleList = new ArrayList<>();

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            super.startElement(uri, localName, qName, attributes);
            if (qName.equalsIgnoreCase("CICLEID")) {
                cicleId = true;
            }else
            if (qName.equalsIgnoreCase("CicleNom")) {
                cicleNom = true;
            }else
            if (qName.equalsIgnoreCase("CicleInfo")) {
                cicleInfo = true;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (cicleId) {
                actualCicle.setClicleId(new String(ch, start, length));
                cicleId = false;
            }
            if (cicleNom) {
                actualCicle.setCicleNom(new String(ch, start, length));
                cicleNom = false;
            }
            if (cicleInfo) {
                actualCicle.setCicleInfo(new String(ch, start, length));
                cicleInfo = false;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("CICLE")) {
                cicleList.add(actualCicle);
                actualCicle = new Cicle();
            }
        }

        public List<Cicle> getListCicle() {
            return cicleList;
        }
    }


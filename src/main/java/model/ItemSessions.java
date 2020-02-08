package model;

public class ItemSessions  {
    private String idFilm, ses_id, cineId, titol, ses_data, cineNom, localitat, comarca, cicleId, ver, preu, orderSessio;

    public ItemSessions(String idFilm, String ses_id, String cineId, String titol, String ses_data, String cineNom, String localitat, String comarca, String cicleId, String ver, String preu, String orderSessio) {

        this.idFilm = idFilm;
        this.ses_id = ses_id;
        this.cineId = cineId;
        this.titol = titol;
        this.ses_data = ses_data;
        this.cineNom = cineNom;
        this.localitat = localitat;
        this.comarca = comarca;
        this.cicleId = cicleId;
        this.ver = ver;
        this.preu = preu;
        this.orderSessio = orderSessio;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public String getSes_id() {
        return ses_id;
    }

    public String getCineId() {
        return cineId;
    }

    public String getTitol() {
        return titol;
    }

    public String getSes_data() {
        return ses_data;
    }

    public String getCineNom() {
        return cineNom;
    }

    public String getLocalitat() {
        return localitat;
    }

    public String getComarca() {
        return comarca;
    }

    public String getCicleId() {
        return cicleId;
    }

    public String getVer() {
        return ver;
    }

    public String getPreu() {
        return preu;
    }

    public String getOrderSessio() {
        return orderSessio;
    }
}

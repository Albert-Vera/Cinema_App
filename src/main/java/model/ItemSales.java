package model;

public class ItemSales {
    private String id, nom, adreca, localitat, comarca, provincia;

    public ItemSales(String id, String nom, String adreca, String localitat, String comarca, String provincia) {
        this.id = id;
        this.nom = nom;
        this.adreca = adreca;
        this.localitat = localitat;
        this.comarca = comarca;
        this.provincia = provincia;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public String getLocalitat() {
        return localitat;
    }

    public String getComarca() {
        return comarca;
    }

    public String getProvincia() {
        return provincia;
    }
}

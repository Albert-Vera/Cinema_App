package model;

public class ItemCicle {
    private String clicleId;
    private String cicleNom, cicleInfo;

    public ItemCicle(String clicleId, String cicleNom, String cicleInfo) {
        this.clicleId = clicleId;
        this.cicleNom = cicleNom;
        this.cicleInfo = cicleInfo;
    }

    public String getClicleId() {
        return clicleId;
    }

    public void setClicleId(String clicleId) {
        this.clicleId = clicleId;
    }

    public String getCicleNom() {
        return cicleNom;
    }

    public void setCicleNom(String cicleNom) {
        this.cicleNom = cicleNom;
    }

    public String getCicleInfo() {
        return cicleInfo;
    }

    public void setCicleInfo(String cicleInfo) {
        this.cicleInfo = cicleInfo;
    }
}

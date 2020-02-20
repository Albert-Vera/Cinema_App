package model;

public class ItemCicle {
    private String cicleId;
    private String cicleNom, cicleInfo, imageCicle;

    public ItemCicle(String cicleId, String cicleNom, String cicleInfo, String imageCicle) {
        this.cicleId = cicleId;
        this.cicleNom = cicleNom;
        this.cicleInfo = cicleInfo;
        this.imageCicle = imageCicle;
    }

    public String getImageCicle() {
        return imageCicle;
    }

    public String getCicleId() {
        return cicleId;
    }

    public void setCicleId(String cicleId) {
        this.cicleId = cicleId;
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

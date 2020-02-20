package model;

import java.util.List;

public class Pelis {

    private String idFilm, titol, original, direccio, versio, idioma;
    private String any, cartell, sinopsi;
    private String dataEstrena;
    private List<String> interprets;

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getCartell() {
        return cartell;
    }

    public void setCartell(String cartell) {
        this.cartell = cartell;
    }

    public String getSinopsi() {
        return sinopsi;
    }

    public void setSinopsi(String sinopsi) {
        this.sinopsi = sinopsi;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getVersio() {
        return versio;
    }

    public void setVersio(String versio) {
        this.versio = versio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idiomas) {
        this.idioma = idiomas;
    }

    public String getDataEstrena() {
        return dataEstrena;
    }

    public void setDataEstrena(String dataEstrena) {
        this.dataEstrena = dataEstrena;
    }

    public List<String> getInterprets() {
        return interprets;
    }

    public void setInterprets(List<String> interprets) {
        this.interprets = interprets;
    }


}

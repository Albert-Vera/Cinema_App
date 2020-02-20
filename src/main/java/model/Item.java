package model;

import java.util.List;

public class Item {

    private String idFilm;
    private String name;
    private String any;
    private String original;
    private String direccio;
    private String versio;
    private String idioma;
    private String dataEstrena;
    private String cartell;
    private String sinopsi;
    private List<String> interpret;

    public Item(String idFilm, String name, String any, String original, String direccio, String versio, String idioma, String dataEstrena, String cartell, String sinopsi, List<String> interpret) {
        this.idFilm = idFilm;
        this.name = name;
        this.any = any;
        this.original = original;
        this.direccio = direccio;
        this.versio = versio;
        this.idioma = idioma;
        this.dataEstrena = dataEstrena;
        this.cartell = cartell;
        this.sinopsi = sinopsi;
        this.interpret = interpret;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public String getCartell() {
        return cartell;
    }

    public String getSinopsi() {
        return sinopsi;
    }

    public String getName() {
        return name;
    }

    public String getAny() {
        return any;
    }

    public String getOriginal() {
        return original;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getVersio() {
        return versio;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getDataEstrena() {
        return dataEstrena;
    }

    public List<String> getInterpret() {
        return interpret;
    }
}

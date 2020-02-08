package model;

import java.util.List;

public class Item {

    private String name;
    private String any;
    private String original;
    private String direccio;
    private String versio;
    private String idioma;
    private String dataEstrena;
    private List<String> interpret;

    public Item(String name, String any, String original, String direccio, String versio, String idioma, String data, List<String> interpret) {
        this.name = name;
        this.any = any;
        this.original = original;
        this.direccio = direccio;
        this.versio = versio;
        this.idioma = idioma;
        this.dataEstrena = data;
        this.interpret = interpret;
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

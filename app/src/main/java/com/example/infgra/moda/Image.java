package com.example.infgra.moda;

public class Image {
    private String urlImagen;
    private String username;
    private String cantidadDias;
    private String cantidadMeGustas;

    public Image(String urlImagen, String username, String cantidadDias, String cantidadMeGustas) {
        this.setUrlImagen(urlImagen);
        this.setUsername(username);
        this.setCantidadDias(cantidadDias);
        this.setCantidadMeGustas(cantidadMeGustas);
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getCantidadMeGustas() {
        return cantidadMeGustas;
    }

    public void setCantidadMeGustas(String cantidadMeGustas) {
        this.cantidadMeGustas = cantidadMeGustas;
    }
}

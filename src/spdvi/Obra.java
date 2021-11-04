/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;

import java.awt.image.BufferedImage;


/**
 *
 * @author DevMike
 */
public class Obra {

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagen() {
        return imatge;
    }

    public void setImagen(String imagen) {
        this.imatge = imagen;
    }
    
    public void setPictureModified(boolean pictureModified) {
        this.pictureModified = pictureModified;
    }
    
    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }

    public String getOldPictureFileName() {
        return oldPictureFileName;
    }

    public void setOldPictureFileName(String oldPictureFileName) {
        this.oldPictureFileName = oldPictureFileName;
    }
    
    private String oldPictureFileName;
    private BufferedImage picture;
    private boolean pictureModified = false;
    private String registre;
    private String titol;
    private String any;
    private String format;
    private String autor;
    private String imatge;

    @Override
    public String toString() {
        return registre + ": " + titol + ", " + any + " (" + format + "). " + autor + "." + imatge; 
    }
    
    
}

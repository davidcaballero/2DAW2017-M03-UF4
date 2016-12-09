/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import java.util.ArrayList;

/**
 *
 * @author David Caballero
 */
public abstract class Usuari implements InUsuari {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String nom;
    private String pri_cog;
    private String seg_cog;
    private ArrayList<Articles> articulos;
        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    private void setNom(String nom) {
         if (nom==null){
            throw new IllegalArgumentException(String.format("El campo nombre del usuario esta vacio."));
        }
        
        this.nom = nom;
    }

    /**
     * @return the pri_cog
     */
    @Override
    public String getPri_cog() {
        return pri_cog;
    }

    /**
     * @param pri_cog the pri_cog to set
     */
    private void setPri_cog(String pri_cog) {
         if (pri_cog==null){
            throw new IllegalArgumentException(String.format("El campo primer apellido del usuario esta vacio."));
        }
        
        this.pri_cog = pri_cog;
    }

    /**
     * @return the seg_cog
     */
    @Override
    public String getSeg_cog() {
        return seg_cog;
    }

    /**
     * @param seg_cog the seg_cog to set
     */
    private void setSeg_cog(String seg_cog) {
        
         if (seg_cog==null){
            throw new IllegalArgumentException(String.format("El campo segundo apellido del usuario esta vacio."));
        }
        
        this.seg_cog = seg_cog;
    }
    
      /**
     * @return the articulo
     */
    public ArrayList<Articles> getArticulo() {
        return articulos;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(ArrayList<Articles> articulo) {
        this.articulos = articulo;
    }

    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    private Usuari(String nom, String pri_cog, String seg_cog, ArrayList<Articles> articulos) {
        this.nom = nom;
        this.pri_cog = pri_cog;
        this.seg_cog = seg_cog;
        this.articulos = articulos;
    }
    
    
     
    public Usuari(String nom, String pri_cog, String seg_cog) {
        this(nom, pri_cog, seg_cog, new ArrayList<>());
        
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    
    public abstract TipoUsuari getTipoUsu();
    public abstract boolean getMenor();
    
    @Override
    public boolean potAgafarArticle(Articles a){
        
        if(this.getTipoUsu().tipoUsu()==true && this.getArticulo().size()<this.getTipoUsu().cant() && !teArticle(a) && a.getEstadoArt()==0){
            return true;
        }else if(this.getTipoUsu().tipoUsu()==false && this.getArticulo().size()<this.getTipoUsu().cant() && !teArticle(a) && a.getEstadoArt()==0){
            return true;
        }else{
            return false;
        }
    
    }
   
    @Override
    public void agafaArticle(Articles a){
        
        if(potAgafarArticle(a)){
            /*
            canvio el valor del estado del articulo y le pongo 1 para que no 
            se pueda volver a coger.
            */
            a.setEstadoArt(1);
            getArticulo().add(a);
         
       }else{
            System.out.println("No puedes cogerlo");
        }    
    }
     
    @Override
    public boolean teArticle(Articles a){
        return getArticulo().contains(a);
    }
    
    @Override
    public void retornaArticle(Articles a){
        /*
        le vuelvo a poner 0 en el campo del estado del articulo para que se pueda
         volver a coger.
        */
        a.setEstadoArt(0);
        getArticulo().remove(a);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
      @Override
    public String toString(){
        return String.format("Nombre: %s%nPrimer apellido: %s%nSegundo apellido: %s", getNom(), getPri_cog(),getSeg_cog());
    }
    
//</editor-fold>
    
//</editor-fold>
   
}

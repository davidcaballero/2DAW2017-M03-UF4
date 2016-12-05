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
    ArrayList<Articles> articulos;
        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the nom
     */
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
     
    public Usuari(String nom, String pri_cog, String seg_cog) {
        this.nom = nom;
        this.pri_cog = pri_cog;
        this.seg_cog = seg_cog;
        
    }

   
    
    
   
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    
    public abstract TipoUsuari getTipoUsu();
    public abstract boolean getMenor();
    
    public boolean potAgafarArticle(Articles a){
        int cont=0;
        
        if(this.getTipoUsu().tipoUsu()==true && cont<this.getTipoUsu().cant() && teArticle(a)==false){
            cont++;
            return true;
        }else if(this.getTipoUsu().tipoUsu()==false && cont<this.getTipoUsu().cant() && teArticle(a)==false){
            cont++;
            return true;
        }else{
            return false;
        }
    }
   
    public void agafaArticle(Articles a){
        if(potAgafarArticle(a)!=false){
            articulos.add(a);
        }
            System.out.println("No puedes cogerlo");
    }
     
    public boolean teArticle(Articles a){
        if(articulos.contains(a)==true){
            return true;
        }else{
            return false;
        }
    }
    
    public void retornaArticle(Articles a){
        articulos.remove(a);
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

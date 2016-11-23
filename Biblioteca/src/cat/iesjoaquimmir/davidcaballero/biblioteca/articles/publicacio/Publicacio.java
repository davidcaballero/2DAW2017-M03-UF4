/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Categoria;

/**
 *
 * @author alumne
 */
public abstract class Publicacio extends Articles {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private int numPagines;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     /**
     * @return the numPagines
     */
    public int getNumPagines() {
        return numPagines;
    }

    /**
     * @param numPagines the numPagines to set
     */
    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }

    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
   
    public Publicacio(String titol, String autor, Categoria categoria,int numPagines) {
        super(titol, autor, categoria);
        this.numPagines = numPagines;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
       @Override
    public String toString() {
        return String.format("%sNumero de paginas: %s", super.toString(),getNumPagines());
    }
    
//</editor-fold>
    
//</editor-fold>
    
}

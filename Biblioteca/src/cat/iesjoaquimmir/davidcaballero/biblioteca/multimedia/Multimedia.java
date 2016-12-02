/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.multimedia;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Categoria;

/**
 *
 * @author David Caballero
 */
public abstract class Multimedia extends Articles {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private int minutos;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    private void setMinutos(int minutos) {
        
         if (minutos<=0){
            throw new IllegalArgumentException(String.format("Los minutos son incorrectos."));
        }
        
        this.minutos = minutos;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    
    public Multimedia(String titol, String autor, Categoria categoria, int minutos) {
        super(titol, autor, categoria);
        this.minutos = minutos;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
    @Override
    public String toString() {
        return String.format("%sMinutos: %s%n",super.toString(),getMinutos());
    }
    
//</editor-fold>
    
//</editor-fold>
   
}

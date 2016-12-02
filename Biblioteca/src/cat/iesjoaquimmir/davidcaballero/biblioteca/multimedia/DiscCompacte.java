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
public class DiscCompacte extends Multimedia {
    
      
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String ismn;    
  
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    
    /**
     * @return the ismn
     */
    public String getIsmn() {
        return ismn;
    }

    /**
     * @param ismn the ismn to set
     */
    private void setIsmn(String ismn) {
         if (ismn==null){
            throw new IllegalArgumentException(String.format("El campo ismn esta vacio.", ismn));
        }
        this.ismn = ismn;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public DiscCompacte(String titol, String autor, Categoria categoria, int min, String ismn) {
        super(titol, autor, categoria, min);
        this.setIsmn(ismn);
    }

   //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobrescritura">
    
    @Override
    public String toString() {
        return String.format("%nCD:%n-------------%sISMN: %s %n",super.toString(),getIsmn());
    }
 
    
//</editor-fold>
    
//</editor-fold>
 
}

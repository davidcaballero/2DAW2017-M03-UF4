/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Categoria;

/**
 *
 * @author David Caballero
 */
public class Llibre extends Publicacio{
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
   
    private String isbn;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Llibre(String titol, String autor, Categoria categoria, int numPagines,String isbn) {
        super(titol, autor, categoria, numPagines);
        this.isbn = isbn;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
             @Override
    public String toString() {
        return String.format("%nLlibre:%n-------------%s%nISBN: %s %n",super.toString(),getIsbn());
    }
    
//</editor-fold>
    
//</editor-fold>

}

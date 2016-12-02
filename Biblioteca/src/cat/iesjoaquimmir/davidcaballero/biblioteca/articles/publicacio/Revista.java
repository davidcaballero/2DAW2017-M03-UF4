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
public class Revista extends Publicacio {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String issn;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     * @param issn the issn to set
     */
    private void setIssn(String issn) {
        
         if (issn==null){
            throw new IllegalArgumentException(String.format("El campo issn esta vacio.", issn));
        }
        this.issn = issn;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Revista(String titol, String autor, Categoria categoria, int numPagines, String issn) {
        super(titol, autor, categoria, numPagines);
        this.issn = issn;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
          @Override
    public String toString() {
        return String.format("%nRevista:%n-------------%s%nISSN: %s %n",super.toString(),getIssn());
    }
    
    
//</editor-fold>
    
//</editor-fold>
    
}

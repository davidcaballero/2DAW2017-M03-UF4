/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.multimedia;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Categoria;

/**
 *
 * @author David Caballero
 */
public class DiscVersatilDigital extends Multimedia {
      
//<editor-fold defaultstate="collapsed" desc="Atributos">
   
    private String isan;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    
     public String getIsan() {
        return isan;
    }


    private void setIsan(String isan) {
         if (isan==null){
            throw new IllegalArgumentException(String.format("El campo isan esta vacio.", isan));
        }
        this.isan = isan;
    }
    

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="constructores">

    public DiscVersatilDigital(String titol, String autor, Categoria categoria, int min, String isan) {
        super(titol, autor, categoria, min);
        this.setIsan(isan);
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    @Override
    public String toString() {
        return String.format("%nDVD:%n-------------%sISAN: %s %n", super.toString(),getIsan());
    }
//</editor-fold>
    
//</editor-fold>
    
}

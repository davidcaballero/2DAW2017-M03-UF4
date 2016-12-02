/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.articles;

/**
 *
 * @author David Caballero
 */
public enum Categoria {
    A("Infantil"),
    B("Juvenil"),
    C("Adult");
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String mssg;
    
//</editor-fold>   
//<editor-fold defaultstate="collapsed" desc="Metodos">
   
    //<editor-fold defaultstate="collapsed" desc="Metodos de objeto">
    
    /**
     * @return the mssg
     */
    public String getMssg() {
        return mssg;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
   
    Categoria(String mssg) {
        this.mssg = mssg;
    }

    
    
//</editor-fold>
    
//</editor-fold>

}
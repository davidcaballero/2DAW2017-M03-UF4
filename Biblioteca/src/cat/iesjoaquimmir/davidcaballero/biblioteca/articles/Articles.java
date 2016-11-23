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
public abstract class Articles implements InArticle {
   
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String titol;
    private String autor;
    private Categoria categoria;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the titol
     */
    public String getTitol() {
        return titol;
    }

    /**
     * @param titol the titol to set
     */
    private void setTitol(String titol) {
        this.titol = titol;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    private void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Articles(String titol, String autor, Categoria categoria) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
     @Override
    public String toString() {
        return String.format("%nTitol: %s %nAutor: %s %nCategoria: %s %n",getTitol(),getAutor(),getCategoria());
    }
    
//</editor-fold>
    
//</editor-fold>

}

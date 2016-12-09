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
    private int estadoArt;
    
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
         if (titol==null){
            throw new IllegalArgumentException(String.format("El campo titulo esta vacio."));
        }
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
         if (autor==null){
            throw new IllegalArgumentException(String.format("El campo autor esta vacio."));
        }
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
         if (categoria==null){
            throw new IllegalArgumentException(String.format("El campo categoria esta vacio."));
        }
        this.categoria = categoria;
    }
    
    /**
     * @return the estadoArt
     */
    public int getEstadoArt() {
        return estadoArt;
    }

    /**
     * @param estadoArt the estadoArt to set
     */
    public void setEstadoArt(int estadoArt) {
        this.estadoArt = estadoArt;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Articles(String titol, String autor, Categoria categoria, int estadoArt) {
        this.titol = titol;
        this.autor = autor;
        this.categoria = categoria;
        this.estadoArt = estadoArt;
    }
    
    
    public Articles(String titol, String autor, Categoria categoria) {
        this(titol, autor, categoria,0);
    }

   
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
     @Override
    public String toString() {
        return String.format("%nTitol: %s %nAutor: %s %nCategoria: %s %n",getTitol(),getAutor(),categoria.getMssg());
    }
    
//</editor-fold>
    
//</editor-fold>

}

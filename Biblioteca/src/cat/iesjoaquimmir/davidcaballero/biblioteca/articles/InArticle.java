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
public interface InArticle {
    
    String getTitol();
    String getAutor();
    Categoria getCategoria();
    @Override
    String toString();
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;

/**
 *
 * @author David Caballero
 */
public interface InUsuari {
    
    String getNom();
    String getPri_cog();
    String getSeg_cog();
    boolean potAgafarArticle(Articles a);
    void agafaArticle(Articles a);
    boolean teArticle(Articles a);
    void retornaArticle(Articles a);
    
    @Override
    String toString();
    
}

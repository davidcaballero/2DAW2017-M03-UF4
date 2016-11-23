/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.publicacio.Llibre;
import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.publicacio.Revista;
import cat.iesjoaquimmir.davidcaballero.biblioteca.multimedia.DiscCompacte;
import cat.iesjoaquimmir.davidcaballero.biblioteca.multimedia.DiscVersatilDigital;
import java.util.ArrayList;

/**
 *
 * @author David Caballero
 */
public class ArticleTest {

public ArrayList<Articles>articles;
 
      public static void main(String[] args){
    
DiscCompacte a0 = new DiscCompacte("Mis grandes éxitos","Luis Miguel", Categoria.ADULT, 65,"04900009");
DiscVersatilDigital a1 = new DiscVersatilDigital("Bamby", "Walt Disney", Categoria.INFANTIL, 89, "90843089");
DiscVersatilDigital a2 = new DiscVersatilDigital("Crepusculo", "Warner", Categoria.JUVENIL, 129, "480980983");
Llibre a3 = new Llibre("Ulises", "James Joyce", Categoria.ADULT, 456, "940943322");
Llibre a4 = new Llibre("Tina Super Bruixa", "Enid Blyton", Categoria.JUVENIL, 456, "342090233");
Revista a5 = new Revista("Patufet", "Ed. Infantil", Categoria.INFANTIL, 87, "80002122");
        
     
    ArrayList<Articles> articles=new ArrayList<Articles>();
                      
        articles.add(a0);
        articles.add(a1);
        articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
        
        
        for (Articles a:articles){
              System.out.println(a);
        }
      
            
      }
    
}

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
import cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios.TipoUsuari;
import cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios.Usuari;
import cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios.UsuariAdult;
import cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios.UsuariMenorEdat;
import java.util.ArrayList;

/**
 *
 * @author David Caballero
 */
public class BibliotecaTest {
    
/*    
  
Para que un articulo solo se pueda coger una vez he creado un atributo en la clase 
Articles que se llama EstadoArt, que por defecto cuando se crea el Articulo en el
constructor le añador el valor 0, despues en el potAgafarArticle miro
que ese Articulo en el campo EstadoArt sea 0, y una vez se añade el articulo el estado
del articulo pasar a ser 1 para que volver a coger.
    
*/    
    public static void main(String[] args) {
        ArrayList<Usuari> usuaris = carregaUsuaris();
	ArrayList<Articles> articles = carregaArticles();
		
	Biblioteca biblioteca = new Biblioteca(usuaris, articles);
		
	while(biblioteca.inici());    
    }
    
    private static ArrayList<Usuari> carregaUsuaris() {
        UsuariAdult usuariPremium = new UsuariAdult("498878974K", TipoUsuari.Premium, "Pepe", "Carrasco", "Coronado");
	UsuariAdult usuariNormal = new UsuariAdult("498878214M", TipoUsuari.Normal, "Paco", "Soler", "Picasso");
        UsuariMenorEdat usuariMenorPremium = new UsuariMenorEdat(usuariPremium, "Pedro", "Garcia", "Saez");
	UsuariMenorEdat usuariMenorNormal = new UsuariMenorEdat(usuariNormal, "Paulo", "Lopez", "Moliere");		
	
        ArrayList<Usuari> usuaris = new ArrayList<Usuari>();
        usuaris.add(usuariPremium);
        usuaris.add(usuariNormal);
        usuaris.add(usuariMenorPremium);
        usuaris.add(usuariMenorNormal);
        
        return usuaris;
    }
	
    private static ArrayList<Articles> carregaArticles() {
        
    DiscCompacte a0 = new DiscCompacte("Mis grandes éxitos","Luis Miguel", Categoria.C, 65,"04900009");
    DiscVersatilDigital a1 = new DiscVersatilDigital("Bamby", "Walt Disney", Categoria.A, 89, "90843089");
    DiscVersatilDigital a2 = new DiscVersatilDigital("Crepusculo", "Warner", Categoria.B, 129, "480980983");
    Llibre a3 = new Llibre("Ulises", "James Joyce", Categoria.C, 456, "940943322");
    Llibre a4 = new Llibre("Tina Super Bruixa", "Enid Blyton", Categoria.B, 456, "342090233");
    Revista a5 = new Revista("Patufet", "Ed. Infantil", Categoria.A, 87, "80002122");

	ArrayList<Articles> articles = new ArrayList<Articles>();
	articles.add(a0);
        articles.add(a1);
	articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
	return articles;
    }
}


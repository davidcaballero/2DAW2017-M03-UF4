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
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UsuariTest {
    
    public static void main(String[] args) {
        int opc;
        Scanner input= new Scanner(System.in);
        
        ArrayList<Articles> articles= new ArrayList<Articles>();
        ArrayList<Usuari> usuarios=new ArrayList<Usuari>();
        
        
        
UsuariAdult usuariPremium = new UsuariAdult("498878974K", TipoUsuari.Premium, "Pepe", "Carrasco", "Coronado");
UsuariAdult usuariNormal = new UsuariAdult("498878214M", TipoUsuari.Normal, "Paco", "Soler", "Picasso");
UsuariMenorEdat usuariMenorPremium = new UsuariMenorEdat(usuariPremium, "Pedro", "Garcia", "Saez");
UsuariMenorEdat usuariMenorNormal = new UsuariMenorEdat(usuariNormal, "Paulo", "Lopez", "Moliere");

usuarios.add(usuariPremium);
usuarios.add(usuariNormal);
usuarios.add(usuariMenorPremium);
usuarios.add(usuariMenorNormal);

DiscCompacte a0 = new DiscCompacte("Mis grandes éxitos","Luis Miguel", Categoria.C, 65,"04900009");
DiscVersatilDigital a1 = new DiscVersatilDigital("Bamby", "Walt Disney", Categoria.A, 89, "90843089");
DiscVersatilDigital a2 = new DiscVersatilDigital("Crepusculo", "Warner", Categoria.B, 129, "480980983");
Llibre a3 = new Llibre("Ulises", "James Joyce", Categoria.C, 456, "940943322");
Llibre a4 = new Llibre("Tina Super Bruixa", "Enid Blyton", Categoria.B, 456, "342090233");
Revista a5 = new Revista("Patufet", "Ed. Infantil", Categoria.A, 87, "80002122");
                           
        articles.add(a0);
        articles.add(a1);
        articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
        
        
        do{
            
            System.out.println("1-Biblioteca \n2-Mostrar article\n3-Sortir");
            System.out.println("Elige una opcion: ");
            opc=input.nextInt();
        if (opc==1){
            funcAgafarUsuari(usuarios, articles);
        }else if (opc==2){
            funcMostrarArticle(articles);   
        }else if (opc==3){
            System.exit(0);
        }
        }while (opc<=0 || opc>3);
    }
    
//<editor-fold defaultstate="collapsed" desc="funcAgafarUsuari">
     public static void funcAgafarUsuari(ArrayList<Usuari>usuarios, ArrayList<Articles>articles){
            
        int usu;
        int opc;
        Scanner input= new Scanner(System.in);
        
                                                      
        for(int x=0; x<usuarios.size(); x++){
            System.out.printf("%n%nUsuario: %d %s",x+1,usuarios.get(x).toString());
        }
           
        System.out.printf("%n%nSelecciona un Usuario: ");
        
        usu=input.nextInt();
        
        System.out.printf("%n1-Devolver articulo%n2-Coger articulo");
        System.out.printf("%nElige una opcion: ");
        
        opc=input.nextInt();
        
        if(opc==1){
            funcRetornarArticle(usuarios.get(usu-1),articles);
        }else if(opc==2){
            funcAgafarArticle(usuarios.get(usu-1),articles);
        }
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="funcAgafarArticle">
         
public static void funcAgafarArticle(Usuari usuario,ArrayList<Articles> articles){
    
     int arts;
     Scanner input= new Scanner(System.in);
     
    do{
    

    System.out.printf("%n--Articulos que tenemos disponibles--%n");
        
            for  (int x=0;x<articles.size(); x++){
                System.out.printf("%n---Articulo: %d---%n%s",x+1,articles.get(x));
            }
            
    System.out.printf("%nSelecciona un Articulo (0) para salir: ");
    arts=input.nextInt();
    
    usuario.agafaArticle(articles.get(arts));
    
    }while(arts!=0);
   
   
}
        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="funcMostarArticle">

public static void funcMostrarArticle(ArrayList<Articles> articles){
    
     int opc;
     
   do{
    Scanner input= new Scanner(System.in);

    System.out.printf("%n--Articulos que tenemos disponibles--%n");
        
            for  (int x=0;x<articles.size(); x++){
                System.out.printf("%n---Articulo: %d---%n%s",x+1,articles.get(x));
            }
            
    System.out.printf("%n(0) para salir: ");
    opc=input.nextInt();
   
    
    }while(opc!=0);
   
   
}

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="funcRetornaArticle">
public static void funcRetornarArticle(Usuari usuario, ArrayList<Articles> articles){
        
    int art;
    Scanner input= new Scanner(System.in);

   
    System.out.printf("%n--Articulos para devolver--%n");
        
            for  (int x=0;x<articles.size(); x++){
                System.out.printf("%n---Articulo: %d---%n%s",x+1,articles.get(x));
            }
            
    System.out.printf("%nSelecciona un Articulo para devolver (0) para salir: ");
    art=input.nextInt();
    
     usuario.retornaArticle(articles.get(art-1));
    
              
           
    }


//</editor-fold>
   
}

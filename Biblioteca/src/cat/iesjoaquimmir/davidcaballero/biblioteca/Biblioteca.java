/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios.Usuari;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author David Caballero
 */
public class Biblioteca {

//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private ArrayList<Articles> articles;
    private ArrayList<Usuari> usuaris;
        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
      /**
     * @return the articles
     */
    public ArrayList<Articles> getArticles() {
        return articles;
    }

    /**
     * @param articles the articles to set
     */
    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    /**
     * @return the usuaris
     */
    public ArrayList<Usuari> getUsuaris() {
        return usuaris;
    }

    /**
     * @param usuaris the usuaris to set
     */
    public void setUsuaris(ArrayList<Usuari> usuaris) {
        this.usuaris = usuaris;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
   
    public Biblioteca(ArrayList<Usuari> usuaris, ArrayList<Articles> articles) {
        this.articles = articles;
        this.usuaris = usuaris;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">

        //<editor-fold defaultstate="collapsed" desc="funcInici">
 
    public boolean inici() {
        
        Scanner input= new Scanner(System.in);
        int opc;
           
        do{
          
            System.out.println("\n\n---Biblioteca--- \n1-Agafar\n2-Retornar\n3-Mostrar Usuaris\n4-Mostrar Articles\n5-Salir");
            System.out.println("Elige una opcion: ");
            opc=input.nextInt();
            if (opc==1){
                agafar();
            }else if(opc==2){
                retornar();
            }else if(opc==3){   
                mostrarUsu();
            }else if(opc==4){
                mostrarArt();
            }else if(opc==5){
                System.exit(0);
                return false;
            }
        }while(opc<=0 || opc>5);
        return true;
    }
    
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="funcAgafar">
    
     public boolean agafar(){
    
        int usu;
        int art;
        Scanner input= new Scanner(System.in);
        
        do{
          
            mostrarUsu();
        
        System.out.printf("%n%nSelecciona un Usuario: ");
        usu=input.nextInt();
            
        
        }while(usu<=0 || usu>this.usuaris.size());

        
        System.out.printf("%n--Articulos que tenemos disponibles--%n");
        
        do{
        for  (int x=0;x<this.articles.size(); x++){
            System.out.printf("%n---Articulo: %d---%n%s",x+1,this.articles.get(x).toString());
        }
            
        System.out.printf("%nSelecciona un Articulo: ");
        art=input.nextInt();
        
        }while(art<=0 || art>this.articles.size());
        
        
        // Cogemos la funcion del potAgafarArticle del usuario que hemos selecionado
        // y le pasamos el articulo que hemos escogido.
        
        if(this.usuaris.get(usu-1).potAgafarArticle(this.articles.get(art-1))){
            
            System.out.printf("%nArticulo cogido");
            return true;
        }else{
            System.out.printf("%No puedes selecionar ese Articulo!!");
            return true;
        }

    }
    
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="funcRetornar">

    public boolean retornar(){
    
        int usu;
        int art;
        Scanner input= new Scanner(System.in);
        
        do{
          
            mostrarUsu();
            System.out.printf("%n%nSelecciona un Usuario: ");
            usu=input.nextInt();
        
        }while(usu<=0 || usu>this.usuaris.size());
        
            //Miro el array de los articulos del usuario selecionado
            if(this.usuaris.get(usu-1).getArticulo().size()==0){
                System.out.printf("\nEste usuario no tiene articulos cogidos.");
                return true;
            }else{
              
                for(int x=0;x<this.usuaris.get(usu-1).getArticulo().size(); x++){
                    System.out.printf("%n---Articulo: %d---%n%s",x+1,this.usuaris.get(usu-1).getArticulo().get(x).toString());
                }
              
            do{
                System.out.printf("%nSelecciona un Articulo a devolver: ");
                art=input.nextInt();
        
            }while(art<=0 || art>this.usuaris.get(usu-1).getArticulo().size());
        
          //devuelvo el articulo que seleciono de los articulos que tiene el usuario cogidos.    
          this.usuaris.get(usu-1).retornaArticle(this.articles.get(art-1));
        
            return true;
        }
    }
     
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="funcMostrarUsu">
    
     public boolean mostrarUsu(){
               
        for(int x=0; x<this.usuaris.size(); x++){
            System.out.printf("%n%nUsuarios: %d %s",x+1,this.usuaris.get(x).toString());
        }
      return true;
    }
    
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="funcMostrarArt">
    
      public boolean mostrarArt(){
        
        Scanner input= new Scanner(System.in);
        int opc;
           
        do{
          
            System.out.println("\n1-Articles Agafats\n2-Articles Disponibles\n3-Tots els Articles");
            System.out.println("Elige una opcion: ");
            opc=input.nextInt();
            if (opc==1){
                ArtsAgafats();
            }else if(opc==2){
                ArtsDispo();
            }else if(opc==3){   
                TotsArts();
            }
            }while(opc<=0 || opc>3);
             return true;
    }
    
    
   public boolean ArtsAgafats() {
        
       System.out.printf("%n---Articles Agafats---%n");
                
        for  (int x=0;x<this.articles.size(); x++){
            
        //miro los articulos que estan cogidos mirando el campo del estado del articulo.
        if(this.articles.get(x).getEstadoArt()==1){
            
            System.out.printf("%n---Articulo: %d---%n%s",x+1,this.articles.get(x).toString());
         }
        
        }
      
        return true;
    }
   
   public boolean ArtsDispo() {
        
        System.out.printf("%n---Articles Disponible---%n");
                
        for  (int x=0;x<this.articles.size(); x++){
            
        //miro los articulos que estan disponible mirando el campo del estado del articulo.
        if(this.articles.get(x).getEstadoArt()==0){
            
            System.out.printf("%n---Articulo: %d---%n%s",x+1,this.articles.get(x).toString());
        }
        
        }
       
        return true;
    }
     
    public boolean TotsArts() {
        
        System.out.printf("%n---Tots els Articles---%n");
                
        for  (int x=0;x<this.articles.size(); x++){
            System.out.printf("%n---Articulo: %d---%n%s",x+1,this.articles.get(x).toString());
        }
        
        return true;
    }
     
     
//</editor-fold>
    
    //</editor-fold>
    
//</editor-fold>
  
}

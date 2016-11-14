/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import java.util.Scanner;

/**
 *
 * @author David Caballero
 */
public class Application {
    
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="menu">
     
       int  opc;
        Scanner input = new Scanner(System.in); 
        
        do{
        System.out.println("\n1-Square\n2-Rectangle\n3-Cercle\n4-Sphere\n5-Color"
                + "\n6-Color aleatorio\n7-toHexString\n8-AlphaColor\n9-Salir\nElije la opcion que quieras: ");
        opc=input.nextInt();                   
                   
        if (opc==1){
            funcSquare();
        }else if(opc==2){
            funcRectangle();
        }else if(opc==3){
            funcCercle();
        }else if (opc==4){
            funcSphere();
        }else if(opc==5){
            funcColor();
        }else if(opc==6){    
            funcColAlea();
            
         }else if(opc==7){    
            functoHexString();   
            
        }else if(opc==8){
            funcAlpha();
         
        }else if(opc==9){
            System.exit(0);
        }
        }while(opc<=0 || opc>9);

//</editor-fold>   
    }
    
//<editor-fold defaultstate="collapsed" desc="funciones">
      
    //<editor-fold defaultstate="collapsed" desc="Square">
    
        
    public static void funcSquare(){
        
        double lado;
      
        
        Scanner input = new Scanner(System.in); 
        System.out.printf("Introduce el costado del cuadrado: ");
        lado=input.nextDouble();       
      
          
        Square cuadrado= new Square(lado);
        System.out.printf("\n---Cuadrado ---\n");
        System.out.printf("\nÁrea: %s",cuadrado.getArea());         
        System.out.printf("\nPerímetro: %s\n",cuadrado.getPerimeter());
        System.out.printf("%s %n",cuadrado.toString());
    
    }
        
//</editor-fold>  
    //<editor-fold defaultstate="collapsed" desc="Rectangle">
         
    public static void funcRectangle(){
    
        double alt;
        double bas;
        Scanner input = new Scanner(System.in);
        System.out.printf("Introduce la altura del rectangulo: ");
        alt=input.nextDouble();
        
        System.out.printf("Introduce la base del rectangulo: ");
        bas=input.nextDouble();   
        
              
        Rectangle rectangulo= new Rectangle(alt,bas);
       // Rectangle rectangulo2=new Rectangle(alt);
        System.out.printf("---Rectangle--- %n");
        System.out.printf("\nÁrea: %s",rectangulo.getArea());         
        System.out.printf("\nPerímetro: %s",rectangulo.getPerimeter());
        
        /*System.out.printf("\n---Rectangle 2--- %n");
        System.out.printf("\nAltura: %s", rectangulo2.getAltura());
        System.out.printf("\nBase: %s\n", rectangulo.getBase());
           */
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Cercle">
    public static void funcCercle(){   
        
        double rad;
        Scanner input = new Scanner(System.in);
        System.out.printf("Introduce el radio de la circunsferencia: ");
        rad=input.nextDouble();                
            
      
        
        Cercle circulo= new Cercle(rad);
        System.out.printf("---Circunsferencia--- %n");
         System.out.printf("\nÁrea: %s",circulo.getArea());         
        System.out.printf("\nPerímetro: %s\n",circulo.getPerimeter());
     
            
               
    }    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sphere">
        public static void funcSphere(){   
        
         double radi;
        Scanner input = new Scanner(System.in);                
        System.out.printf("Introduce el radio de la esfera: ");
        radi=input.nextDouble();
              
        
     
        
        Sphere esfera= new Sphere(radi);
        System.out.printf("---Shpere---");
         System.out.printf("\nÁrea: %s",esfera.getArea());         
        System.out.printf("\nPerímetro: %s\n",esfera.getPerimeter());
        
    
     }     
        
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Color">
          public static void funcColor(){   
        
        Color co1= new Color(125,125,Color.MAX_VALUE);
        
        System.out.printf("\n---Color---");             
        System.out.printf("\nco1-> r: %d g: %d b: %d %n", co1.getRed(), co1.getGreen(),
        co1.getBlue() );
        System.out.printf("co1-> %s %n", co1.toHexString(true));
        System.out.printf("co1-> %s %n", co1.toHexString(false));
        
        System.out.printf("\n---Color Hexadecimal---");
        Color co2= Color.fromHexString("#FFAAFF");
        System.out.printf("\nco2-> r: %d g: %d b: %d %n", co2.getRed(), co2.getGreen(),
        co2.getBlue() );
        
        
        System.out.printf("\nColores creados: %d %n", Color.getCounter());
      
    
     }  
        
        
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Color aleatorio">
public static void funcColAlea() {
    
    Color col6=Color.getRandow();
    
    System.out.printf("col aleatori -> r: %d g: %d b: %d %n", col6.getRed(), col6.getGreen(), col6.getBlue());
        
    }
    
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="toHexString">
public static void functoHexString(){
    Color co1= new Color(125,125,Color.MAX_VALUE);
     System.out.printf("--toHexString--\n");
    System.out.printf("co1 -> r: %d g: %d b: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue());
    System.out.printf("co1 -> %s %n", co1.toHexString(false));
    System.out.printf("co1 -> %s %n", co1.toHexString(true));
}

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="AlphaColor">
   
    public static void funcAlpha(){
        
        AlphaColor ac1= new AlphaColor(0.0, 170, 212, 38);
        
        System.out.printf("%n");
        System.out.printf("---AlphaColor--- %n");
        System.out.printf("%s %n", ac1.toRGBString());
        System.out.printf("%s %n", ac1.toString());
        
        
        AlphaColor ac2 = new AlphaColor();
        System.out.printf("---AlphaColor por defecto--- %n");
        System.out.printf("%s %n", ac2.toRGBString());
        
        
        
      
       
           
    }


//</editor-fold>

//</editor-fold>

}

      


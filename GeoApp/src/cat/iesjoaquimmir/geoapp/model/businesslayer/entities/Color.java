/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

import java.util.Random;

/**
 *
 * @author David Caballero
 */
public class Color {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private int red;
    private int green;
    private int blue;
    
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
  
    //<editor-fold defaultstate="collapsed" desc="Gettes/Setters">
    /**
     * @return the red
     */
    public int getRed() {
        return red;
    }

    /**
     * @param red the red to set
     */
    public void setRed(int red) {
        if (red<0 || red>255){
            throw new IllegalArgumentException(String.format("Valor %d no válido para la"
                    + " coordenada R", red)); 
        }
        
        this.red = red;
    }

    /**
     * @return the green
     */
    public int getGreen() {
        return green;
    }

    /**
     * @param green the green to set
     */
    public void setGreen(int green) {
        
          if (green<0 || green>255){
            throw new IllegalArgumentException(String.format("Valor %d no válido para la"
                    + " coordenada G", green)); 
        }
        
        this.green = green;
    }

    /**
     * @return the blue
     */
    public int getBlue() {
        return blue;
    }

    /**
     * @param blue the blue to set
     */
    public void setBlue(int blue) {
        
          if (blue<0 || blue>255){
            throw new IllegalArgumentException(String.format("Valor %d no válido para la"
                    + " coordenada B", blue)); 
        }
        
        this.blue = blue;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Color(int red, int green, int blue) {
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos estaticos">
    public static int getCounter(){
            return  counter;
    }
    
    public static Color fromHexString(String color){
        
        if(color==null){
            throw new NullPointerException("Es obligatorio indicar una cadena de texto");
        }
        
        if(!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(
            String.format("El texto %s no tiene formato hexadecimal", color));
            
        }
        
        return new Color(Integer.parseInt(color.substring(1,3),16),
                        Integer.parseInt(color.substring(3,5),16),
                        Integer.parseInt(color.substring(5,7),16));
    }
    
    
      public static Color getRandow(){
    
        Random rnd= new Random();
        return new Color(rnd.nextInt(MAX_VALUE+1),rnd.nextInt(MAX_VALUE+1),rnd.nextInt(MAX_VALUE+1));
        
    }
    
//</editor-fold>
    
    
//</editor-fold>
 
    
}

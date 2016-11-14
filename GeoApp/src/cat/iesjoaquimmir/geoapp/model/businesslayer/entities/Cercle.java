/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author David Caballero
 */
public class Cercle extends Shape {
           
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double  radio;
    
    
//</editor-fold> 
//<editor-fold defaultstate="collapsed" desc="Metodos">
   
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the base
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the base to set
     */
    public void setRadio(double radio) {
          if (radio<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", radio));
        }
        
        this.radio = radio;
    }

    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Cercle(double radio,AlphaColor backgroundColor, AlphaColor foregroundColor) {
        super(backgroundColor,foregroundColor);
        this.setRadio(radio);
    }

    
    public Cercle(double radio) {
        this(radio,new AlphaColor(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE),
        new AlphaColor(Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE));
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
      
   public double getArea(){
        return (getRadio()*getRadio())*Math.PI;
    }
    
    public double getPerimeter(){
        return (2*Math.PI)*getRadio();
    }    
      
      
      
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
    @Override
    public String toString(){
        return String.format("%n---Circulo ---%nRadio: %.2f%nColor de fondo: %s%nColor de linia: %s%n ",
        this.getRadio(),this.getBackgroundColor().toHexString(),this.getForegroundColor().toHexString());
    
    }
    
//</editor-fold>
   
//</editor-fold>
    
}

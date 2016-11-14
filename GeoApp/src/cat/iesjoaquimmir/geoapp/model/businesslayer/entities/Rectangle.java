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
public class Rectangle extends Shape {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double  base;
    private double altura;
    
//</editor-fold>   
//<editor-fold defaultstate="collapsed" desc="Metodos">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
          if (base<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", base));
        }
        
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
          if (altura<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", altura));
        }
        
        
        this.altura = altura;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
          
        public Rectangle(double base, double altura, AlphaColor backgroundColor, AlphaColor foregroundColor) {
            super(backgroundColor,foregroundColor);
            this.setBase(base);
            this.setAltura(altura);
        }
        
         
        public Rectangle(double base, double altura) {
            this(base,altura, new AlphaColor(Color.MAX_VALUE,Color.MAX_VALUE,Color.MAX_VALUE),
        new AlphaColor(Color.MIN_VALUE,Color.MIN_VALUE,Color.MIN_VALUE));
        }

   
        
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
      
   public double getArea(){
        return (getBase()*getAltura())/2;
    }
    
    public double getPerimeter(){
        return (getAltura()*2)+getBase();
    }    
      
      
      
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
    @Override
    public String toString(){
        return String.format("%n---Rectangulo ---%nBase: %.2f%n %nAltura: %.2f%nColor de fondo: %s%nColor de linia: %s%n ",
        this.getBase(),this.getAltura(),this.getBackgroundColor().toHexString(),this.getForegroundColor().toHexString());
    
    }
    
//</editor-fold>
//</editor-fold>
  
}

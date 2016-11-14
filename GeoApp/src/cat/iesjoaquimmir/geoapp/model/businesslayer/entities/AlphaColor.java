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
public class AlphaColor extends Color {
   
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double alpha;
    private static final double MAX_VALUE=1;
    private static final double MIN_VALUE=0;

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(double alpha) {
        
        if(alpha<MIN_VALUE || alpha>MAX_VALUE){
            throw new IllegalArgumentException(String.format("El valor %.02f, no es valido", alpha));
        }
        
        this.alpha = alpha;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
     
    public AlphaColor(double alpha, int red, int green, int blue) {
        super(red, green, blue);
        this.setAlpha(alpha);
    }
    
    public AlphaColor(int red, int green, int blue) {
        this(MIN_VALUE,Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE);
        
    }
    
     public AlphaColor() {
        this(MIN_VALUE,Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE);
    }

    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos de objetos">
    
    @Override
    public String toString(){
        return String.format("El AlphaColor es: %.02f%nColor toHexString: %s%nColor toRGBString: %s%n",getAlpha(), toHexString(), toRGBString());
    }
    
       
//</editor-fold>
    
//</editor-fold>
  
}

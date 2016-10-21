/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Sphere {
    
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
      
   public Sphere(double radio){
        this.setRadio(radio);
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    public double getArea() {
        return ((4*Math.PI)*(getRadio()*getRadio()));
    }
    
    public double getPerimeter(){
        return (2*Math.PI)*getRadio();
    }    
      
      
      
//</editor-fold>

    
//</editor-fold>
    
}

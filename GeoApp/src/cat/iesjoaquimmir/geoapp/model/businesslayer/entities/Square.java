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
public class Square {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double  side=1.0;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    //<editor-fold defaultstate="collapsed" desc="Constructores">
     public Square() {
    }
     
     public Square(double side){
     
         this.setSide(side);
     }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
     
     /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
      
        if (side<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", side));
        }
      
        this.side = side;
    }

     
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operaciones objeto">
    
    public double getArea(){
        return Math.pow(getSide(), 2);
    }
    
    public double getPerimeter(){
        return getSide()*4;
    }
    
    
//</editor-fold>
     
//</editor-fold>

    
   
    
}

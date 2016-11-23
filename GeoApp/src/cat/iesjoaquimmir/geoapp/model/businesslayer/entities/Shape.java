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
public abstract class Shape {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private AlphaColor backgroundColor;
    private AlphaColor foregroundColor;
    private static int counter=0;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
        /**
         * @return the backgroundColor
         */
        public AlphaColor getBackgroundColor() {
            return backgroundColor;
        }

        /**
         * @param backgroundColor the backgroundColor to set
         */
        public void setBackgroundColor(AlphaColor backgroundColor) {
             if(backgroundColor==null){
                throw new NullPointerException("Es obligatorio indicar el backgroundColor");
            }
            this.backgroundColor = backgroundColor;
        }

        /**
         * @return the foregroundColor
         */
        public AlphaColor getForegroundColor() {
            return foregroundColor;
        }

        /**
         * @param foregroundColor the foregroundColor to set
         */
        public void setForegroundColor(AlphaColor foregroundColor) {
            
            if(foregroundColor==null){
                throw new NullPointerException("Es obligatorio indicar el foregroundColor");
            }
            this.foregroundColor = foregroundColor;
        }
        
       
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos Estáticos">
        
         public static int getCounter(){
            return counter;
        }
        
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
         
    public Shape() {
        counter++;
    }
    
      public Shape(AlphaColor backgroundColor, AlphaColor foregroundColor) {
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        counter++;
    }
         
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
      public abstract double getArea();
//</editor-fold>
      
//</editor-fold>
 
}

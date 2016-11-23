/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.pratica9a.model.businesslayer.entities;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Modul {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String nombre;
    private String descripcion;
    private int hor_dur;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
      /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
         if(nombre==null){
     
                throw new IllegalArgumentException("Nombre modulo vacio");
            
        }else{
        this.nombre = nombre;
        }
        
        
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
         if(descripcion==null){
     
                throw new IllegalArgumentException("Descripcion modulo vacio");
            
        }else{
        
        this.descripcion = descripcion;
         }
    }

    /**
     * @return the hor_dur
     */
    public int getHor_dur() {
        return hor_dur;
    }

    /**
     * @param hor_dur the hor_dur to set
     */
    public void setHor_dur(int hor_dur) {
         if(hor_dur<0 || hor_dur>=1000){
     
                throw new IllegalArgumentException("Numero de horas del modulo incorrectas");
            
        }else{
        
        this.hor_dur = hor_dur;
         }
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Modul(String nombre, String descripcion, int hor_dur) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setHor_dur(hor_dur);
    }
    
    public Modul(String nombre, int hor_dur) {
        this(nombre,null,hor_dur);
    }
    
 
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    
    public String getModulos(){
    
    return String.format("Nombre: %s, Descripcion: %s, Numero de horas: %d", getNombre(),getDescripcion(),getHor_dur());
    }
     
//</editor-fold>
    
//</editor-fold>
 
}

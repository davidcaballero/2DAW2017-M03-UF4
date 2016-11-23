/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.pratica9a.model.businesslayer.entities;

/**
 *
 * @author David Caballero
 */
public class Domicili {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String carrer;
    private String numero;
    private String pis;
    private String cod_post;
    private String poblacion;
    private String provincia;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the carrer
     */
    public String getCarrer() {
        return carrer;
    }

    /**
     * @param carrer the carrer to set
     */
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        
         if(numero.length()==0){
     
                throw new IllegalArgumentException("El numero está vacio");
            
        }else{
        
        this.numero = numero;
         }
    }

    /**
     * @return the pis
     */
    public String getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(String pis) {
        if(pis.length()==0){
     
                throw new IllegalArgumentException("El campo del piso esta vacio");
            
        }else{        
                
        this.pis = pis;
        }
    }

    /**
     * @return the cod_post
     */
    public String getCod_post() {
        return cod_post;
    }

    /**
     * @param cod_post the cod_post to set
     */
    public void setCod_post(String cod_post) {
         
        if(cod_post.length()==5){
     
        this.cod_post = cod_post;        
            
        }else{
        
        this.cod_post = cod_post;
        }
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * @param poblacion the poblacion to set
     */
    public void setPoblacion(String poblacion) {
    
        if(poblacion.length()==0){
     
                throw new IllegalArgumentException("El campo de poblacion esta vacio");
            
        }else{
        
        this.poblacion = poblacion;
        }
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        
        if(provincia.length()==0){
     
          throw new IllegalArgumentException("El campo de la provincia esta vacio");
        }else{
        this.provincia = provincia;
        }
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

        public Domicili(String carrer, String numero, String pis, String cod_post, String poblacion, String provincia) {
            this.setCarrer(carrer);
            this.setNumero(numero);
            this.setPis(pis);
            this.setCod_post(cod_post);
            this.setPoblacion(poblacion);
            this.setProvincia(provincia);
        }
   
        public Domicili(String carrer, String numero, String pis, String cod_post, String poblacion) {
            this(carrer,numero,pis,cod_post,poblacion,null);
        }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    
    public String getDomiciliAmigable(){
     
        return String.format("%s, %s, %s, %s,%s, %s", getCarrer(),getNumero(),getPis(),getCod_post(),getPoblacion(),getProvincia());
     
     }
     
//</editor-fold>
    
//</editor-fold>

}

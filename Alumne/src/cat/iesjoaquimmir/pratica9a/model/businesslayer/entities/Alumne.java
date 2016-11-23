/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.pratica9a.model.businesslayer.entities;

import java.util.ArrayList;

/**
 *
 * @author David Caballero
 */
public class Alumne {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nom;
    private String primer_cognom;
    private String segon_cognom;
    private String dni;
    private ArrayList<String> telefon;
    private int edat;
    private Domicili domicili;
    private ArrayList<Modul> modulos;
//</editor-fold>    
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        if(nom==null){
     
                throw new IllegalArgumentException("Nombre vacio");
            
        }else{
        this.nom = nom;
        }
    }

    /**
     * @return the primer_cognom
     */
    public String getPrimer_cognom() {
        return primer_cognom;
    }

    /**
     * @param primer_cognom the primer_cognom to set
     */
    public void setPrimer_cognom(String primer_cognom) {
        if(primer_cognom==null){
     
                throw new IllegalArgumentException("Primer apellido vacio");
            
        }else{
        this.primer_cognom = primer_cognom;
        }
    }

    /**
     * @return the segon_cognom
     */
    public String getSegon_cognom() {
        
        
        return segon_cognom;
    }

    /**
     * @param segon_cognom the segon_cognom to set
     */
    public void setSegon_cognom(String segon_cognom) {
        
        if(segon_cognom==null){
     
                throw new IllegalArgumentException("Segundo apellido vacio");
            
        }else{
        this.segon_cognom = segon_cognom;
        }
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        if(!dni.matches("^((([A-Z]|[a-z])\\d{8})|(\\d{8}([A-Z]|[a-z])))$")){
            throw new IllegalArgumentException(String.format("El dni %s no es correcto", dni));
        }
        
    this.dni = dni; 
    }

   /**
     * @return the telefon
     */
    public ArrayList<String> getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(ArrayList<String> telefon) {
        for(int i=0; i<telefon.size(); i++){
            if(telefon.get(i).length() !=9){
                throw new IllegalArgumentException("El telefono es incorrecto");
        
        }else{
        
        this.telefon = telefon;
            }}
    }
   

    /**
     * @return the edat
     */
    public int getEdat() {
        return edat;
    }

    /**
     * @param edat the edat to set
     */
    public void setEdat(int edat) {
        
        if(edat<=0 || edat>120){
            throw new IllegalArgumentException("Edat incorrecta");
              
    }else{
        this.edat = edat;
    }
       
    }
    
    /**
     * @return the domicili
     */
    public Domicili getDomicili() {
        return domicili;
    }

    /**
     * @param domicili the domicili to set
     */
    public void setDomicili(Domicili domicili) {
        this.domicili = domicili;
    }
    
     /**
     * @return the modulos
     */
    public ArrayList<Modul> getModulos() {
        return modulos;
    }

    /**
     * @param modulos the modulos to set
     */
    public void setModulos(ArrayList<Modul> modulos) {
        this.modulos = modulos;
    }

    
  

    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public Alumne(String nom, String primer_cognom, String segon_cognom, String dni, ArrayList<String> telefon, int edat, Domicili domicili, ArrayList<Modul> modul) {
        this.nom = nom;
        this.primer_cognom = primer_cognom;
        this.segon_cognom = segon_cognom;
        this.dni = dni;
        this.telefon = telefon;
        this.edat = edat;
        this.domicili = domicili;
        this.modulos = modul;
    }

    
    
    
    public Alumne(String nom, String primer_cognom, String segon_cognom, String dni, int edat) {
       this(nom,primer_cognom,segon_cognom,dni,null,edat,null,null);
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    
       public String getNomComplert() {
         
         return String.format("%s, %s, %s", getNom(),getPrimer_cognom(),getSegon_cognom());
        
        }
       
       public String getMajorEdat(){
        
            if(getEdat()<18){
                return ("No es mayor de edat");
            }else{
                return ("Es mayor de edat");
            }
        }
       
     public String getModuloos(Modul modulos){
    
    return String.format("%s, %s %d", modulos.getNombre(),modulos.getDescripcion(),modulos.getHor_dur());
    }
    
    
//</editor-fold>
    
//</editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios;

import cat.iesjoaquimmir.davidcaballero.biblioteca.articles.Articles;
import java.util.Objects;

/**
 *
 * @author David Caballero
 */
public class UsuariAdult extends Usuari {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String dni;
    private TipoUsuari tipoUsu;
    int cont=0;
       
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    private void setDni(String dni) {
        if(!dni.matches("^((([A-Z]|[a-z])\\d{8})|(\\d{8}([A-Z]|[a-z])))$")){
            throw new IllegalArgumentException(String.format("El dni %s no es correcto", dni));
        }
        
        this.dni = dni;
    }
    
      /**
     * @return the tipoUsu
     */
    @Override
    public TipoUsuari getTipoUsu() {
        return tipoUsu;
    }

    /**
     * @param tipoUsu the tipoUsu to set
     */
    public void setTipoUsu(TipoUsuari tipoUsu) {
        this.tipoUsu = tipoUsu;
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">

    public UsuariAdult(String dni, TipoUsuari tipoUsu, String nom, String pri_cog, String seg_cog) {
        super(nom, pri_cog, seg_cog);
        this.dni = dni;
        this.tipoUsu = tipoUsu;
    }
    
   
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    @Override
    public String toString(){
        return String.format("%n---Usuario Adulto---%nDNI: %s%nTipo de usuario: %s%n%s", getDni(), tipoUsu.getMsg(), super.toString());
    }
    
     @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof UsuariAdult))
            return false;
        UsuariAdult useradulto = (UsuariAdult) o;
        if (dni == null || dni != useradulto.dni)
            return false;
      return true;
    }

      @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.dni);
        return hash;
    }
   
      @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPrimerapellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSegundoapellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//</editor-fold>
        
//</editor-fold>

}

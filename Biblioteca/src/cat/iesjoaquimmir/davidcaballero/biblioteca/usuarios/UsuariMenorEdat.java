/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios;

/**
 *
 * @author alumne
 */
public class UsuariMenorEdat extends Usuari {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
   
    private UsuariAdult tutor;
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
     /**
     * @return the tutor
     */
    public UsuariAdult getTutor() {
        return tutor;
    }

    /**
     * @param tutor the tutor to set
     */
    public void setTutor(UsuariAdult tutor) {
        this.tutor = tutor;
    }
   
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public UsuariMenorEdat(UsuariAdult tutor, String nom, String pri_cog, String seg_cog) {
        super(nom, pri_cog, seg_cog);
        this.tutor = tutor;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos objeto">
     
    public boolean esAdulto(){
        return false;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
     @Override
    public String toString(){
        return String.format("%n---Usuario Menor de edad---%n%s%nTutor: %n%s",super.toString(),tutor.toString());
    }
    
//</editor-fold>
    
//</editor-fold>

    @Override
    public TipoUsuari getTipoUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

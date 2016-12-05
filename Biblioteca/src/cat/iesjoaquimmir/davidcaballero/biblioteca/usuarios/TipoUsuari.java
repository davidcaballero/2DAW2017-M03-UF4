/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.davidcaballero.biblioteca.usuarios;

/**
 *
 * @author David Caballero
 */
public enum TipoUsuari {
    
    Premium("Premium",4,true),
    Normal("Normal",2,false);
    
private final String msg;
private final boolean tipoUsu;
private final int cant;

TipoUsuari(String msg, int cant, boolean tipoUsu){
    this.msg=msg;
    this.cant=cant;
    this.tipoUsu=tipoUsu;
}
  
public String getMsg(){
    return msg;
}

public boolean tipoUsu(){
    return tipoUsu;
}

public int cant(){
    return cant;
}
    
}

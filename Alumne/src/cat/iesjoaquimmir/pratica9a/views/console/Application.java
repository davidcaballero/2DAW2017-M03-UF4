/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.pratica9a.views.console;

import cat.iesjoaquimmir.pratica9a.model.businesslayer.entities.Alumne;
import cat.iesjoaquimmir.pratica9a.model.businesslayer.entities.Domicili;
import cat.iesjoaquimmir.pratica9a.model.businesslayer.entities.Modul;
import java.util.ArrayList;


/**
 *
 * @author David Caballero
 */
public class Application {
    
public static void main(String[] args) {
    
ArrayList<String> telf=new ArrayList<String>();
ArrayList<Modul> modulos=new ArrayList<Modul>();
 
Domicili domicili = new Domicili("Industria", "188", "2n 1a","08800", "Badalona", "Barcelona");

modulos.add(new Modul("M01", "Sistemas", 77));
modulos.add(new Modul("M02","Bases",220));
modulos.add(new Modul("M03","Programacion",77));

telf.add("111111111");
telf.add("222222222");
telf.add("333333333");
telf.add("777777777");

Alumne alumno = new Alumne("Pedro", "García", "Ramírez","12345678J",telf, 22,domicili, modulos);

showListTelMod(alumno);
//showListModul(alumno);

//mostra el format cognom1 cognom2, nom
System.out.println(alumno.getNomComplert());

//Industria 188, 2o 1a, 08025, Badalona (Barcelona)
System.out.println(domicili.getDomiciliAmigable());
//Pinta el mateix que la linia anterior
System.out.println(alumno.getDomicili().getDomiciliAmigable());
}


 public static void showListTelMod(Alumne alumne1){
   
       System.out.printf("Alumne: %s%n", alumne1.getNomComplert());
      
       
       for(int i=0;i<alumne1.getTelefon().size();i++){
           System.out.printf("*** Telefono %d *** numero: %s%n", i+1,alumne1.getTelefon().get(i));
        }
       
       for(int i=0;i<alumne1.getModulos().size();i++){
           System.out.printf("*** Modulo %d *** %s %n",i+1,alumne1.getModulos().get(i).getModulos());
        }
       
     
  }
 
 /*public static void showListModul(Alumne alumno){
           
        
       for(int i=0;i<alumno.getModulos().size();i++){
           System.out.printf("Modulos: %d %s%n",i,alumno.getModulos().get(i));
        }
       
  }
*/

}

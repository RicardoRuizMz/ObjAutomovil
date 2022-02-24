/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundopoo2209;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Ricardo
 */
public class HolaMundoPoo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo poo");
        Persona per1 = new Persona();
        per1.setNombre("Jesus HC");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("Hamburgesa hawaiana!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        per2.comer("Pizza Hawaiana");
        System.out.println("Nombre per 2: " + per2.getNombre()+"\n");
        
        Automovil bocho=new Automovil();
        bocho.setMarca("VM");
        System.out.println("Marca: "+ bocho.getMarca());
        bocho.setSubMarca("Sedan");
        System.out.println("SubMarca: "+ bocho.getSubMarca());
        bocho.setModelo(1970);
        System.out.println("Modelo: "+ bocho.getModelo());
        bocho.setColor(Color.blue);
        System.out.println("Color: "+ bocho.getColor()+"\n");
        
        
        Automovil Akura=new Automovil();
        Akura.setMarca("Akura");
        Akura.setSubMarca("NSX");
        Akura.setModelo(2013);
        Akura.setColor(Color.GRAY);
        System.out.println("Marca: "+Akura.getMarca());
        System.out.println("SubMarca: "+Akura.getSubMarca());
        System.out.println("Modelo:"+Akura.getModelo());
        System.out.println("Color: "+Akura.getColor()+"\n");
        
        
        Automovil Mustang=new Automovil ();
        Mustang.setMarca("Ford");
        Mustang.setSubMarca("Mustan");
        Mustang.setModelo(2010);
        Mustang.setColor(Color.yellow);
        System.out.println("Marca: "+Mustang.getMarca());
        System.out.println("SubMarca: "+Mustang.getSubMarca());
        System.out.println("Modelo: "+Mustang.getModelo());
        System.out.println("Color: "+Mustang.getColor());
    }

}

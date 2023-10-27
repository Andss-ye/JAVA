/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import logica.*;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animales[] = new Animal[3];
        
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Perro();
   
        animales[0].setEdad(1);
        animales[0].setNombre("Add");
        animales[0].setPeso(25);
        
        animales[1].setEdad(3);
        animales[1].setNombre("andrew");
        animales[1].setPeso(15);
        
        animales[2].setEdad(4);
        animales[2].setNombre("holi");
        animales[2].setPeso(10);
        
        for(int i = 0; i < 3; i++){
            animales[i].alimentar();
            System.out.println(animales[i].toString());
        }
    }
    
}

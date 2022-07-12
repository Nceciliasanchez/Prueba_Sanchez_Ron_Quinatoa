/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Point
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Persona p1= new Persona();
        System.out.println("Ingresa la cedula");
        p1.setCi(leer.next());
        System.out.println("Ingresa Nombre1");
        p1.setNombre1(leer.next());
        p1.setNombre2(JOptionPane.showInputDialog("Ingresa tu segundo nombre"));
        p1.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        JOptionPane.showMessageDialog(null,p1.toString());
    }
    
}

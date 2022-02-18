/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab5_progra2_favionataren;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class Examen1_Lab5_favioNataren {

    static Scanner leer=new Scanner(System.in);
    ArrayList <persona> heroes=new ArrayList();
    ArrayList <persona> Villanos=new ArrayList();
    ArrayList <persona> Personas=new ArrayList();
    public static void main(String[] args) {
        boolean cont=true;
        while  (cont){
            System.out.println("1. Opciones Universo"
                    + "\n2. Opciones Escuadron"
                    + "\n3. Opciones Persona");
            System.out.print("Ingrese Opcion: ");
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("crear"
                            + "modificar"
                            + "listar");
                    int opcionU=leer.nextInt();
                    switch(opcionU){
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;                  
                    }
                }
                break;
                case 2:{
                    System.out.println("crear"
                            + "modificar"
                            + "listar"
                            + "Listar"
                            + "Agregar personas"
                            + "Simular batalla");
                    int opcionE=leer.nextInt();
                    switch(opcionE){
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 5:
                            
                            break; 
                        case 4:
                            
                            break; 
                        case 6:
                            
                            break;     
                    }
                    
                }
                break;
                case 3:{
                    System.out.println("crear"
                            + "modificar"
                            + "listar");
                    int opcionP=leer.nextInt();
                    switch(opcionP){
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;                  
                    }
                    
                    
                }
                break;
            }
        }
    }
    
}

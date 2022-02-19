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

    static Scanner lea = new Scanner(System.in);
    /*static ArrayList <persona> heroes=new ArrayList();
    static ArrayList <persona> Villanos=new ArrayList();*/
    static ArrayList<persona> Personas = new ArrayList();
    static ArrayList<escuadrones> escuadrones = new ArrayList();
    static ArrayList<universo> universo = new ArrayList();

    public static void main(String[] args) {
        boolean exit = true;
        do {
            System.out.println("1. Opciones Universo"
                    + "\n2. Opciones Escuadrones"
                    + "\n3. Opciones Persona"
                    + "\nIngrese Opcion: ");
            int opcion = lea.nextInt();

            switch (opcion) {
                case 4: {
                    System.exit(0);
                }
                break;
                case 1: {
                    System.out.println("1. crear Universo");
                    System.out.println("2. Eliminar Universo");
                    System.out.println("3. Modificar Universo");
                    System.out.println("4. listar Universo");
                    System.out.print("Ingrese Opcion: ");
                    int opcion2 = lea.nextInt();
                    System.out.println();
                    switch (opcion2) {
                        case 1: {
                            System.out.println("Ingrese Nombre Del Universo");
                            String nom = lea.nextLine();
                            nom = lea.nextLine();
                            universo.add(new universo(nom));
                        }
                        break;
                        case 2: {
                            int i = 0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo " + i + " " + univ);
                            }
                            System.out.print("Ingrese Numero Del Universo a Eliminar: ");
                            int elim = lea.nextInt();
                            universo.remove(i - 1);
                        }
                        break;
                        case 3: {
                            int i = 0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo " + i + " " + univ);
                            }
                            System.out.print("Ingrese Numero Del Universo a modificar: ");
                            int elim = lea.nextInt();
                            universo.remove(i - 1);
                            System.out.println("1- Agregar Escuadrones");
                            System.out.println("2- Elimar Escuadrones");
                            int agregar = lea.nextInt();
                            switch (agregar) {
                                case 1: {

                                }
                                break;
                                case 2: {

                                }
                                break;
                            }
                        }
                        break;
                        case 4: {
                            int i = 0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo " + i + " " + univ);
                            }
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    System.out.println("1. crear Escuadrones");
                    System.out.println("2. Eliminar Escuadrones");
                    System.out.println("3. Modificar Escuadrones");
                    System.out.println("4. listar Escuadrones");
                    System.out.println("5. Agregar Personas");
                    System.out.println("6. simular");
                    System.out.print("Ingrese Opcion: ");
                    int opcion2 = lea.nextInt();
                    switch (opcion2) {
                        case 1: {
                            System.out.println("Ingrese nombre");
                            String nom = lea.nextLine();
                            nom = lea.nextLine();
                            System.out.println("Ingrese Lugar Donde Se Encuentra El Escuadron");
                            String Lugar = lea.nextLine();
                            System.out.println("Ingrese Base Del Escuadron");
                            String base = lea.nextLine();
                            System.out.println("1- Villano");
                            System.out.println("2- SuperHeroe");
                            System.out.print("Ingrese de que sera el escuadron: ");
                            int opcion3 = lea.nextInt();
                            boolean heroeVillano = true;
                            switch (opcion3) {
                                case 1: {
                                    heroeVillano = false;
                                    escuadrones.add(new escuadrones(nom, Lugar, base, heroeVillano));
                                }
                                break;
                                case 2: {
                                    heroeVillano = true;
                                    escuadrones.add(new escuadrones(nom, Lugar, base, heroeVillano));
                                }
                                break;
                                default: {
                                    System.out.println("Opcion invalida");
                                }
                                break;
                            }
                        }
                        break;
                        case 2: {
                            escuadrones.add(new escuadrones());
                            int i = 0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i + " " + escua);
                            }
                            System.out.println();
                            System.out.print("Seleccione escuadron a eliminar: ");
                            int eli = lea.nextInt();
                            escuadrones.remove(i - 1);
                        }
                        break;
                        case 3: {
                            int i = 0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i + " " + escua);
                            }
                            System.out.print("Seleccione escuadron a modificar: ");
                            int eli = lea.nextInt();
                        }
                        break;
                        case 4: {
                            int i = 0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i + " " + escua);
                            }
                        }
                        break;
                        case 5: {
                            int i = 0;

                        }
                        break;
                        case 6: {
                            int i = 0;

                        }
                        break;
                    }
                }
                break;
                case 3: {
                    System.out.println("1. crear Persona"
                            + "\n2. Eliminar Persona"
                            + "\n3. Modificar Persona"
                            + "\n4. listar Persona"
                            + "\nIngrese Opcion: ");
                    int opcion3 = lea.nextInt();
                    switch (opcion3) {
                        case 1: {
                            System.out.println("Ingrese nombre: ");
                            String nombre = lea.nextLine();
                            nombre = lea.nextLine();
                            System.out.println("Ingrese poder: ");
                            String poder = lea.nextLine();
                            System.out.println("Ingrese debilidad: ");
                            String debilidad = lea.nextLine();
                            System.out.println("1. villano"
                                    + "2. Super Heroe"
                                    + "Ingrese Opcion: ");
                            int opcion2 = lea.nextInt();
                            boolean heroeVilano = true;

                            if (opcion2 == 1) {
                                heroeVilano = false;
                            } else {
                                if (opcion2 == 2) {
                                    heroeVilano = true;
                                } else {
                                    System.out.println("Opcion Invalida");
                                    break;
                                }
                            }
                            System.out.println("Ingrese fuerza");
                            int fuerza = lea.nextInt();
                            System.out.println("Ingrese habilidad mental");
                            int habilidadMental = lea.nextInt();
                            System.out.println("Ingrese habilidad fisica");
                            int habilidadFisica = lea.nextInt();
                            if (fuerza + habilidadFisica + habilidadMental > 150 || fuerza + habilidadFisica + habilidadMental < 100) {
                                System.out.println("Esta persona es muy debil para ser un heroe o villano ");
                                break;
                            }
                            boolean tieneSquad = false;
                            System.out.println("selecione que especie es "
                                    + "1. persona nomal"
                                    + "2. super humano"
                                    + "3. radioctivo"
                                    + "4. deidad"
                                    + "5. Alien"
                                    + "6. Mutante"
                                    + "Ingrese opcion: ");
                            int superr = lea.nextInt();

                            switch (superr) {
                                case 1: {
                                    Personas.add(new personaNormal(nombre, poder, debilidad, heroeVilano, fuerza, habilidadMental, habilidadFisica, tieneSquad));
                                }
                                break;
                                case 2: {
                                    System.out.println("Ingrese superpoder");
                                    String superpoder = lea.nextLine();
                                    Personas.add(new SuperHumano(superpoder, nombre, poder, debilidad, heroeVilano, fuerza, habilidadMental, habilidadFisica, tieneSquad));
                                }
                                break;
                                case 3: {
                                    System.out.println("Ingrese edad que tenia cuando le paso el accidente");
                                    int edad = lea.nextInt();
                                    System.out.println("Ingrese Tipo De Accidente");
                                    String tipo_accidentelea = lea.nextLine();
                                    tipo_accidentelea = lea.nextLine();
                                    Personas.add(new Radioctivo(edad, tipo_accidentelea, nombre, poder, debilidad, heroeVilano, fuerza, habilidadMental, habilidadFisica, tieneSquad));
                                }
                                break;
                                case 4: {
                                    boolean creyentes = true;
                                    boolean conte = true;
                                    System.out.println("Tiene creyentes"
                                            + "\n1. si"
                                            + "\n2. no"
                                            + "\ningrese opcion: ");
                                    int cre = lea.nextInt();
                                    switch (cre) {
                                        case 1: {
                                            creyentes = true;
                                        }
                                        break;
                                        case 2: {
                                            creyentes = false;
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion Invalida");
                                            conte = false;
                                        }
                                    }
                                    if (conte) {
                                        System.out.println("Ingrese religion");
                                        String religion = lea.nextLine();
                                        religion = lea.nextLine();
                                        //Personas.add(new Deidad(creyentes, religion));
                                    }

                                }
                                break;
                                case 5: {
                                    System.out.println("Ingrese planeta: ");
                                    String planeta = lea.nextLine();
                                }
                                break;
                                case 6: {
                                    System.out.println("Ingrese la cantidad de factores del mutante");
                                    int fac = lea.nextInt();
                                    ArrayList<String> factores = new ArrayList();
                                    String a = lea.nextLine();
                                    for (int i = 1; i <= fac; i++) {
                                        System.out.print("Ingrese factor numero " + i + ": ");
                                        a = lea.nextLine();
                                        factores.add(a);
                                    }
                                    mutante mutante = new mutante(nombre, poder, debilidad, tieneSquad, fuerza,
                                            habilidadMental, habilidadFisica, tieneSquad);
                                    mutante.setFactores(factores);
                                    Personas.add(mutante);
                                }
                                break;

                            }
                        }
                        break;
                        case 2: {
                            int i = 0;
                            for (persona per : Personas) {
                                i++;
                                System.out.println(i + " " + Personas);
                            }
                        }
                        break;
                        case 3: {
                            int i = 0;
                            for (persona personas : Personas) {
                                i++;
                                System.out.println(i + " " + Personas);
                            }
                        }
                        break;
                        case 4: {
                            int i = 0;
                            for (persona personas : Personas) {
                                i++;
                                System.out.println(i + " " + Personas);
                            }
                        }
                        break;
                    }
                }
                break;

            }
        } while (exit);
    }

}

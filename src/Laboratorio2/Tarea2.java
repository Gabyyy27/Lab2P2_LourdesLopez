/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class Tarea2 {

    public static void main(String[] arg) {
        ArrayList museo = new ArrayList();
        int opcion = 0;
        while (opcion != 8) {

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("     OPCIONES: \n "
                            + "1- Agregar una Pintura\n"
                            + "2- Agregar una Escultura\n"
                            + "3- Agregar un Escrito\n"
                            + "4- Agregar una fotografia\n"
                            + "5- Listar \n"
                            + "6- Modificar\n"
                            + "7- Eliminar\n"
                            + "8- Salir"));
            if (opcion == 1) {

                Pinturas p = new Pinturas(JOptionPane.showInputDialog("Ingrese el nombre de la pintura: "),
                        JOptionPane.showInputDialog("Ingrese el nombre del Autor: "),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de Presentacion: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de Presentacion: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de Presentacion: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de Adquision: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de Adquision: ")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de Adquision: ")),
                        JOptionPane.showInputDialog("Posicion actual: " + "(En Exposicion o En Bodega)\n"));
                museo.add(p);

            }
            if (opcion == 2) {

                Esculturas e = new Esculturas(JOptionPane.showInputDialog("Ingrese nombre del escultor: "),
                        JOptionPane.showInputDialog("Ingrese el Material: "),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en el que se Esculpio: ")),
                        JOptionPane.showInputDialog("Ingrese Departamento que pertenece: \n" + "(Artes, Arqueologia, Historia Moderna)\n"));
                museo.add(e);

            }
            if (opcion == 3) {

                Escritos es = new Escritos(JOptionPane.showInputDialog("Ingrese Total de Palabras: "),
                        JOptionPane.showInputDialog("Ingrese el nombre del Autor del Escrito: "),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese La Epoca de Redaccion: ")),
                        JOptionPane.showInputDialog("Ingrese el genero literario"));
                museo.add(es);

            }
             if (opcion == 4) {

                Fotografias f = new Fotografias(JOptionPane.showInputDialog("Ingrese La Dimension: "),
                        JOptionPane.showInputDialog("Ingrese La Resolucion: "),
                        JOptionPane.showInputDialog("Ingrese si la fotografia es en B/N o Color: "));
                museo.add(f);
             }
            if (opcion == 5) {
                for (int i = 0; i < museo.size(); i++) {
                    JOptionPane.showInputDialog(" " + museo.indexOf(museo.get(i)) + "-" + museo.get(i));
                }
            }
            if (opcion == 6) {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar"));
                if (pos >= 0 && pos < museo.size()) {
                       if (museo.get(pos) instanceof Fotografias) {
                        ((Fotografias) museo.get(pos)).setDimensiones(JOptionPane.showInputDialog(null,"Ingrese las dimensiones: "));
                        ((Fotografias) museo.get(pos)).setResolucion(JOptionPane.showInputDialog(null,"Ingrese la resolucion: "));
                        ((Fotografias) museo.get(pos)).setColorOBlancoNegro(JOptionPane.showInputDialog(null,"Ingrese si la fotografia es en B/N o Color: "));   
                       }
                    if (museo.get(pos) instanceof Pinturas) {
                        ((Pinturas) museo.get(pos)).setAutor(JOptionPane.showInputDialog(null, "Ingrese el nombre del autor: "));
                        ((Pinturas) museo.get(pos)).setNombre(JOptionPane.showInputDialog(null,"Ingrese Nombre dela Pintura: "));
                        ((Pinturas) museo.get(pos)).setPosicion(JOptionPane.showInputDialog(null,"Ingrese Posicion Actual: " + "(En Exposicion o En Bodega)\n"));
                    }
                     if (museo.get(pos) instanceof Escritos) {
                        ((Escritos) museo.get(pos)).setAutorEscrito(JOptionPane.showInputDialog(null, "Ingrese el nombre del autor del Escrito: "));
                        ((Escritos) museo.get(pos)).setEpocaRedaccion(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese La Epoca de Redaccion: ")));
                        ((Escritos) museo.get(pos)).setTotalPalabras(JOptionPane.showInputDialog(null,"Ingrese Total de Palabras: "));
                        ((Escritos) museo.get(pos)).setGeneroLiterario(JOptionPane.showInputDialog(null,"Ingrese Genero Literario: "));
       
                    }
                     if (museo.get(pos) instanceof Esculturas) {
                        ((Esculturas) museo.get(pos)).setNombreEscultor(JOptionPane.showInputDialog(null,"Ingrese el nombre del autor: "));
                        ((Esculturas) museo.get(pos)).setMaterial(JOptionPane.showInputDialog(null,"Ingrese el material: "));
                        ((Esculturas) museo.get(pos)).setDepartamento(JOptionPane.showInputDialog(null,"Ingrese Departamento que se encuentra: "));  
                     } 
            
            } else {
                    JOptionPane.showMessageDialog(null, "Posicion Incorrecta"); 
                }
            }
            if (opcion == 7) {
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
                if (pos >= 0 && pos < museo.size()) {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminarlo?");
                    if (confirmacion == 0) {
                        museo.remove(pos);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Posicion Incorrecta");
                }
            }
        }//Fin While

    }}


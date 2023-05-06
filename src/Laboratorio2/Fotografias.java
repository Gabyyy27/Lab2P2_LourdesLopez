/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author Lourdes
 */
public class Fotografias {
    private String Dimensiones;
    private String resolucion;
    private String ColorOBlancoNegro; 

    public String getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(String Dimensiones) {
        this.Dimensiones = Dimensiones;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getColorOBlancoNegro() {
        return ColorOBlancoNegro;
    }

    public void setColorOBlancoNegro(String ColorOBlancoNegro) {
        this.ColorOBlancoNegro = ColorOBlancoNegro;
    }

    public Fotografias(String Dimensiones, String resolucion, String ColorOBlancoNegro) {
        this.Dimensiones = Dimensiones;
        this.resolucion = resolucion;
        this.ColorOBlancoNegro = ColorOBlancoNegro;
    }

    @Override
    public String toString() {
        return "\n FOTOGRAFIAS: \n" + "\n Dimensiones= " + Dimensiones + "\n Resolucion=" + resolucion + "\n Color o B/N= " + ColorOBlancoNegro;
    }

    
    
    
}

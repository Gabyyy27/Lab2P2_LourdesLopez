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
public class Pinturas {

    private String nombre;
    private String autor;
    private int DiaPresentacion;
    private int MesPresentacion;
    private int AñoPresentacion;
    private int DiaAdquision;
    private int MesAdquision;
    private int AñoAdquision;
    private String Posicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public Pinturas(String nombre, String autor, int DiaPresentacion, int MesPresentacion, int AñoPresentacion, int DiaAdquision, int MesAdquision, int AñoAdquision, String Posicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.DiaPresentacion = DiaPresentacion;
        this.MesPresentacion = MesPresentacion;
        this.AñoPresentacion = AñoPresentacion;
        this.DiaAdquision = DiaAdquision;
        this.MesAdquision = MesAdquision;
        this.AñoAdquision = AñoAdquision;
        this.Posicion = Posicion;
   
    }

    @Override
    public String toString() {
        return "\n PINTURAS \n" + "\n Nombre de la Pintura= " + nombre + "\n Autor= " + autor + "\n Fecha de Presentacion= " + DiaPresentacion + "/" + MesPresentacion + "/" + AñoPresentacion + "\n Fecha de Adquision= " + DiaAdquision + "/" + MesAdquision + "/" + AñoAdquision + "\n Posicion Actual= " + Posicion ;
    }
  
}

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
public class Escritos {
    private String TotalPalabras;
    private String AutorEscrito;
    private int EpocaRedaccion;
    private String GeneroLiterario;

    public String getTotalPalabras() {
        return TotalPalabras;
    }

    public void setTotalPalabras(String TotalPalabras) {
        this.TotalPalabras = TotalPalabras;
    }

    public String getAutorEscrito() {
        return AutorEscrito;
    }

    public void setAutorEscrito(String AutorEscrito) {
        this.AutorEscrito = AutorEscrito;
    }

    public int getEpocaRedaccion() {
        return EpocaRedaccion;
    }

    public void setEpocaRedaccion(int EpocaRedaccion) {
        this.EpocaRedaccion = EpocaRedaccion;
    }

    public String getGeneroLiterario() {
        return GeneroLiterario;
    }

    public void setGeneroLiterario(String GeneroLiterario) {
        this.GeneroLiterario = GeneroLiterario;
    }

    public Escritos(String TotalPalabras, String AutorEscrito, int EpocaRedaccion, String GeneroLiterario) {
        this.TotalPalabras = TotalPalabras;
        this.AutorEscrito = AutorEscrito;
        this.EpocaRedaccion = EpocaRedaccion;
        this.GeneroLiterario = GeneroLiterario;
    }

    @Override
    public String toString() {
        return "\n ESCRITOS: \n" + "\nTotal Palabras del Escrito= " + TotalPalabras + "\n Autor del Escrito= " + AutorEscrito + "\n Epoca que fue Redactado= " + EpocaRedaccion + "\n Genero Literario= " + GeneroLiterario ;
    }
    
    
}

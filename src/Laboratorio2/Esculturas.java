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
public class Esculturas {
    private String NombreEscultor;
    private String Material;
    private int AñoEsculpio;
    private String Departamento;

    public String getNombreEscultor() {
        return NombreEscultor;
    }

    public void setNombreEscultor(String NombreEscultor) {
        this.NombreEscultor = NombreEscultor;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getAñoEsculpio() {
        return AñoEsculpio;
    }

    public void setAñoEsculpio(int AñoEsculpio) {
        this.AñoEsculpio = AñoEsculpio;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public Esculturas(String NombreEscultor, String Material, int AñoEsculpio, String Departamento) {
        this.NombreEscultor = NombreEscultor;
        this.Material = Material;
        this.AñoEsculpio = AñoEsculpio;
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "\n ESCULTURAS: \n" + "\n NombreEscultor= " + NombreEscultor + "\n Material= " + Material + "\n  Año que se Esculpio= " + AñoEsculpio + "\n Departamento= " + Departamento;
    }

  

    
    }

 
    
    
    


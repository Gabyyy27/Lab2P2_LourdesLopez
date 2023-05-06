/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.p2_lourdesamador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lourdes
 */
public class CalculadoraFechas_LourdesAmador {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
    
  try {
    
            SimpleDateFormat Fecha = new SimpleDateFormat("dd/MM/yyyy");
    
            Date fecha_usuario = Fecha.parse("20/02/2020");
            Date fecha_actual = Fecha.parse("21/4/2023");
            
            
            long tiempo_diferencia =fecha_actual.getTime()-fecha_usuario.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long dias = unidad.convert(tiempo_diferencia, TimeUnit.MILLISECONDS);
            
            SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ejemplo: 20/12/2022");
            System.out.println("Fecha actual: "+formato.format(fecha_actual));
            System.out.println("Fecha usuario: "+formato.format(fecha_usuario));
            System.out.println("Los dias de diferencia son: "+dias);
        } 
        catch (ParseException ex) {
            Logger.getLogger(CalculadoraFechas_LourdesAmador.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        }
} 

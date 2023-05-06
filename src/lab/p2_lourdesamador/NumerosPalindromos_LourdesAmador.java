/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.p2_lourdesamador;

import java.util.Scanner;

/**
 *
 * @author Lourdes
 */
public class NumerosPalindromos_LourdesAmador {

    /**
     * @param n
     * @param recv
     * @return 
     */
    public static int recursiva(int n, int recv)
    {
        if (n == 0) {
            return recv;
        }
 
        recv = recv * 10 + (n % 10);
        recv = recursiva(n / 10, recv);
        return recv;
    }
    public static boolean Palindromo(int num)
    {
        int recv = 0;
        recv = recursiva(num, recv);
        return (num == recv);
    }
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = entrada.nextInt();
        System.out.println("El numero ingresado fue: "+n);
        if (Palindromo(n)) {
            System.out.printf("Es Palindromo   ");
        }
        else {
            System.out.printf("No es Palindromo   ");
        }
    }
    }
    


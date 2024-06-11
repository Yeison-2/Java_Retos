/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Promedio");

        System.out.println("Ingrese el primer numero ");
        int numero1 = cargarNumero();

        System.out.println("Ingrese el segundo numero");
        int numero2 = cargarNumero();

        System.out.println("Ingrese el tercer numero");
        int numero3 = cargarNumero();
        /**
         * Esta es la instancia de la funcion genararPromedio
         */
        generarPromedio(numero1, numero2, numero3);

    }
    /**
     * Esta es la funcion que recibe lo numeros por teclado
     * 
     * @return retorno de numero Double 
     * @throws IOException 
     */
    public static Integer cargarNumero() throws IOException {
        InputStreamReader inpuDato = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inpuDato);
        String strNumero = buffer.readLine();
        int numero = Integer.parseInt(strNumero);
        return numero;
    }
    /**
     * Funcion que genera el promedio entre los tres numeros 
     * @param numero1 
     * @param numero2
     * @param numero3 
     */
    public static void generarPromedio(int numero1, int numero2, int numero3) {
        double promedio = (numero1 + numero2 + numero3) / 3.0;
        System.out.println("El promedio es de " + promedio);
    }

}

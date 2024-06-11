/**
 * Docente: Magda Pineda
 * Universidad juan de castellanos
 * Asignatura: POO
 * Descripción: 
 * Fecha: //
 * Autor: Yeison Stiven Romero Salinas
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Par_O_Impar {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Par o Impar");

        System.out.println("Ingrese numero ");
        int numero = cargarNumero();
        
        Boolean esPar = numero % 2 == 0;
        
        if (esPar) {
            System.out.println("Es par el numero "+numero);
        } else {
            System.out.println("Es impar el numero "+ numero);
        }

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


}

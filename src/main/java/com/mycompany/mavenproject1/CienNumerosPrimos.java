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
public class CienNumerosPrimos {

    public static void main(String[] args) throws IOException {
        String resultado = "";
        int contador = 0;
        int numero = 1;


        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;

        }
        System.out.println("Los primeros 100 numeros son " + resultado);
    }

    /**
     * Función que analiza si un numero es primo o no
     *
     * @param numero es el numero que va aumentando comanzando en uno
     * @return retorna si un boolean si un numero es o no primo
     */
    private static Boolean esPrimo(int numero) {

        boolean esNPrimo = true;

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                esNPrimo = false;
            }

        }
        return esNPrimo;
    }

}

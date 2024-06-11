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
import java.util.Scanner;

/**
 *
 * @author Yeison Romero Salinas
 */
public class Main {

     
    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese el primer número:");
        Integer numerol = cargarNumero();

        System.out.println("Ingrese el segundo número:");
        Integer numero2 = cargarNumero();

        System.out.println("Ingrese el tercer número:");
        Integer numero3 = cargarNumero();

        calcularNumeroMayor(numerol, numero2, numero3);
        calcularNumeroMenor(numerol, numero2, numero3);

    }

    /**
     * Esta función permite cargar los numeros por teclado
     *
     * @return aqui se retorna el numero del teclado
     */
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }

    /**
     * Esta funcion calcula el numero mayor
     *
     * @param numerol Este es el numero 1
     * @param numero2 Este es el numero 2
     * @param numero3 Este es el numero 3
     */
    private static void calcularNumeroMayor(Integer numerol, Integer numero2, Integer numero3) {

        Integer numeroMayor = numerol;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);

    }

    private static void calcularNumeroMenor(Integer numerol, Integer numero2, Integer numero3) {

        Integer numeroMenor = numerol;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        System.out.println("El número menor es: " + numeroMenor);

    }
}

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
package AppClientes;

/**
 *
 * @author Yeison Romero Salinas
 */

/**
 * Esta clase representa a los clientes
 * 
 */
public class Cliente {
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getCompleteName(){
        return name + " " + lastName;
    }
    
}

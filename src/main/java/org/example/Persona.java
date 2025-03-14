package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en la agenda, compuesto por un nombre y una lista de telefonos asignados.
 *
 * @author CIFP Carlos III
 * @version 1.0 11/03/2025
 */
class Persona {
    private String name; // Nombre del contacto
    private List<String> phones; // Lista de telefonos asignados.

    /**
     * Constructor para crear un nuevo contacto.
     *
     * @param name Nombre del contacto.
     * @param phone Numero de telefono del contacto.
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Devuelve nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de numeros de telefono del contacto.
     *
     * @return Lista de numeros de telefono.
     * @see List
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
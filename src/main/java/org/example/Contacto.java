package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto en la agenda, compuesto por un nombre y una lista de telefonos asignados.
 *
 * @author CIFP Carlos III
 * @version 1.0 11/03/2025
 */
class Contacto {
    private String name; // Nombre del contacto
    private List<String> phones; // Lista de telefonos asignados.

    /**
     * Constructor para crear un nuevo contacto.
     *
     * @param name Nombre del contacto.
     * @param phone Numero de telefono del contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
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
}
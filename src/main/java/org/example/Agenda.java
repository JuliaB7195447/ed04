package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una agenda de contactos.
 * Contiene metodos para añadir, eliminar, y modificar los contactos.
 *
 * @author CIFP Carlos III
 * @version 1.0 11/03/2025
 * @see Contacto
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Constructor de la clase Agenda.
     * Inicializa nueva lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un nuevo contacto o añade un nuevo numero de telefono a contacto ya existente.
     *
     * @param name Nombre del contacto.
     * @param phone Numero de telefono para añadir
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {      // si el contacto no existe
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto existente de la agenda.
     *
     * @param name Nombre del contacto para eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica el numero de telefono de un contacto existente.
     *
     * @param name Nombre del contacto.
     * @param oldPhone Numero de telefono para modificar.
     * @param newPhone Nuevo numero de telefono a reemplazar.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos guardados en la agenda.
     *
     * @return Lista de contactos.
     * @see Contacto
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
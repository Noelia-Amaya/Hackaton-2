package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
  
  // atributos de la clase agenda
  private List<Contacto> agendaContactos;
  private int tamanio;
  
  // metodo constructor por defecto
  public Agenda() {
  }
  
  // metodo constructor para inicializar los atributos
  public Agenda(int tamanio) {
    this.agendaContactos = new ArrayList<>(tamanio);
    this.tamanio = tamanio;
  }
  
  // añadir un elemento a la lista --> se usa add
  public String añadirContacto(Contacto c) {
    if (agendaContactos.contains(c)) {
      return "En la agenda ya se encuentra el contacto: " + c.getNombre();
    } else if (agendaContactos.size() >= tamanio) {
      return "No se pueden añadir más contactos a la agenda, el máximo de contactos es de: " + tamanio;
    } else {
      agendaContactos.add(c);
      return "El contacto " + c.getNombre() + " se añadió con éxito a la agenda!";
    }
  }
  
  // verificar si existe un elemento de la lista --> se usa contains
  public String existeContacto(Contacto c) {
    if (agendaContactos.contains(c)) {
      return "En la agenda ya se encuentra el contacto: " + c.getNombre();
    } else {
      return "En la agenda no existe el contacto " + c.getNombre() + " elija la opcion 1 del menu para añadirlo";
    }
  }
  
  // listar todos los elementos de una lista --> se usa for each
  public void listarContactos() {
    if (agendaContactos.isEmpty()) {
      System.out.println("La agenda esta vacia !!!");
    } else {
      for (Contacto contacto : agendaContactos) {
        System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
      }
    }
  }

  // buscar un elemento de la lista --> for each
  // metodo para verificar que un contacto es igual a otro --> se usa el equalsIgnoreCase
  public void buscaContacto(String nombre) {
    for (Contacto contacto : agendaContactos) {
      if (contacto.getNombre().equalsIgnoreCase(nombre)) {
        System.out.println("El telefono de " + contacto.getNombre() + " es " + contacto.getTelefono());
        return;
      }
    }
    System.out.println("El contacto no se ha encontrado!");
  }
  
  // eliminar un elemento de la lista --> se usa remove
  public void eliminarContacto(Contacto c) {
    boolean result = agendaContactos.remove(c);
    if (result) {
      System.out.println("El contacto " + c.getNombre() + " se ha eliminado con exito de la agenda");
    } else {
      System.out.println("No se ha podido eliminar el contacto " + c.getNombre() + " de la agenda");
    }
  }
  
  // para verificar si la lista esta llena con elementos --> se usa size
  public String agendaLlena() {
    if (agendaContactos.size() == tamanio) {
      return "La agenda esta llena !";
    } else {
      return "La agenda no esta llena. Dirijase a la opcion 3 del menu para verificar todos los contactos que hay en la agenda";
    }
  }
  
  // se hace una resta para saber los espacios libres de la lista
  public String espacioLibres() {
    if (agendaContactos.isEmpty()) {
      return "La agenda esta totalmente vacia, puede meter " + tamanio + " contactos";
    } else {
      int espacioLibre = tamanio - agendaContactos.size();
      return "Puede meter " + espacioLibre + " contactos en la agenda";
    }
  }
}


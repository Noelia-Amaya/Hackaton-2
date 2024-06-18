package org.example;

import java.util.Objects;

public class Contacto {
  
  // esta definido por un nombre y un telefono, es decir, estos son los
  // atributos de la clase Contacto
  private String nombre;
  private int telefono;
  
  // metodo constructor por defecto
  public Contacto() {
  }
  
  // metodo constructor para inicializar los atributos
  public Contacto(String nombre, int telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }
  
  // metodos GET para obtener datos desde otra clase
  // metodos SET para modificar los datos desde otra clase
  public String getNombre() {
    return nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int getTelefono() {
    return telefono;
  }
  
  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
  
  // metodos para verificar si un contacto es igual a otro contacto
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contacto contacto = (Contacto) o;
    return Objects.equals(nombre, contacto.nombre);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }
}
